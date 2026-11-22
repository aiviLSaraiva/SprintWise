package menus;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

/**
 * Janela principal do SprintWise e ponto de entrada da interface Swing.
 * As telas dos módulos podem ser conectadas aqui conforme forem implementadas.
 */
public class TelaPrincipal extends JFrame {
    private static final Color AZUL_ESCURO = new Color(23, 37, 84);
    private static final Color AZUL_ATIVO = new Color(43, 78, 160);
    private static final Color FUNDO = new Color(245, 247, 251);
    private static final Color TEXTO = new Color(31, 41, 55);
    private static final Color TEXTO_SECUNDARIO = new Color(107, 114, 128);
    private static final Color BRANCO = Color.WHITE;

    private final CardLayout gerenciadorDeTelas = new CardLayout();
    private final JPanel areaDeConteudo = new JPanel(gerenciadorDeTelas);
    private final JLabel tituloDaPagina = new JLabel("Visão geral");
    private final Map<String, JButton> botoesDeNavegacao = new LinkedHashMap<String, JButton>();
    private String paginaAtual = "inicio";

    public TelaPrincipal() {
        super("SprintWise | Organizador Acadêmico");
        configurarJanela();
        montarNavegacao();
        montarAreaPrincipal();
        registrarTelas();
        atualizarNavegacao("inicio");
    }

    private void configurarJanela() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1100, 720);
        setMinimumSize(new Dimension(900, 600));
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
    }

    private void montarNavegacao() {
        JPanel menuLateral = new JPanel();
        menuLateral.setBackground(AZUL_ESCURO);
        menuLateral.setPreferredSize(new Dimension(238, 0));
        menuLateral.setBorder(new EmptyBorder(28, 18, 24, 18));
        menuLateral.setLayout(new BoxLayout(menuLateral, BoxLayout.Y_AXIS));

        JLabel marca = new JLabel("SprintWise");
        marca.setForeground(BRANCO);
        marca.setFont(new Font("SansSerif", Font.BOLD, 25));
        marca.setAlignmentX(LEFT_ALIGNMENT);
        menuLateral.add(marca);

        JLabel subtitulo = new JLabel("ORGANIZADOR ACADÊMICO");
        subtitulo.setForeground(new Color(190, 205, 235));
        subtitulo.setFont(new Font("SansSerif", Font.PLAIN, 10));
        subtitulo.setBorder(new EmptyBorder(5, 1, 34, 0));
        subtitulo.setAlignmentX(LEFT_ALIGNMENT);
        menuLateral.add(subtitulo);

        adicionarBotaoDeNavegacao(menuLateral, "inicio", "Visão geral");
        adicionarBotaoDeNavegacao(menuLateral, "disciplinas", "Disciplinas");
        adicionarBotaoDeNavegacao(menuLateral, "projetos", "Projetos e tarefas");
        adicionarBotaoDeNavegacao(menuLateral, "eventos", "Eventos");
        add(menuLateral, BorderLayout.WEST);
    }

    private void adicionarBotaoDeNavegacao(JPanel menu, final String chave, String texto) {
        JButton botao = new JButton(texto);
        botao.setFont(new Font("SansSerif", Font.PLAIN, 14));
        botao.setHorizontalAlignment(SwingConstants.LEFT);
        botao.setMaximumSize(new Dimension(Integer.MAX_VALUE, 44));
        botao.setPreferredSize(new Dimension(195, 44));
        botao.setBorder(new EmptyBorder(0, 14, 0, 10));
        botao.setFocusPainted(false);
        botao.setOpaque(true);
        botao.setAlignmentX(LEFT_ALIGNMENT);
        botao.addActionListener(evento -> mostrarPagina(chave));
        botoesDeNavegacao.put(chave, botao);
        menu.add(botao);
        menu.add(Box.createVerticalStrut(7));
    }

    private void montarAreaPrincipal() {
        JPanel areaPrincipal = new JPanel(new BorderLayout());
        areaPrincipal.setBackground(FUNDO);

        JPanel cabecalho = new JPanel(new BorderLayout());
        cabecalho.setBackground(BRANCO);
        cabecalho.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(229, 233, 240)),
                new EmptyBorder(22, 30, 22, 30)));

        tituloDaPagina.setFont(new Font("SansSerif", Font.BOLD, 21));
        tituloDaPagina.setForeground(TEXTO);
        cabecalho.add(tituloDaPagina, BorderLayout.WEST);

        JLabel identificacao = new JLabel("SPRINTWISE");
        identificacao.setFont(new Font("SansSerif", Font.BOLD, 10));
        identificacao.setForeground(TEXTO_SECUNDARIO);
        cabecalho.add(identificacao, BorderLayout.EAST);

        areaDeConteudo.setBackground(FUNDO);
        areaDeConteudo.setBorder(new EmptyBorder(28, 30, 30, 30));
        areaPrincipal.add(cabecalho, BorderLayout.NORTH);
        areaPrincipal.add(areaDeConteudo, BorderLayout.CENTER);
        add(areaPrincipal, BorderLayout.CENTER);
    }

    private void registrarTelas() {
        areaDeConteudo.add(criarTelaInicial(), "inicio");
        areaDeConteudo.add(criarTelaDeModulo("Disciplinas",
                "Aqui ficará a área de cadastro e consulta das disciplinas."), "disciplinas");
        areaDeConteudo.add(criarTelaDeModulo("Projetos e tarefas",
                "Aqui ficará a área de organização dos projetos e tarefas."), "projetos");
        areaDeConteudo.add(criarTelaDeModulo("Eventos",
                "Aqui ficará a área de cadastro e consulta dos eventos acadêmicos."), "eventos");
    }

    private JPanel criarTelaInicial() {
        JPanel painel = new JPanel(new BorderLayout(0, 22));
        painel.setOpaque(false);

        JPanel introducao = new JPanel();
        introducao.setOpaque(false);
        introducao.setLayout(new BoxLayout(introducao, BoxLayout.Y_AXIS));

        JLabel saudacao = new JLabel("Bem-vinda ao SprintWise!");
        saudacao.setFont(new Font("SansSerif", Font.BOLD, 25));
        saudacao.setForeground(TEXTO);
        saudacao.setAlignmentX(LEFT_ALIGNMENT);

        JLabel descricao = new JLabel(
                "Organize suas disciplinas, acompanhe seus projetos e não perca os prazos.");
        descricao.setFont(new Font("SansSerif", Font.PLAIN, 14));
        descricao.setForeground(TEXTO_SECUNDARIO);
        descricao.setBorder(new EmptyBorder(8, 0, 0, 0));
        descricao.setAlignmentX(LEFT_ALIGNMENT);
        introducao.add(saudacao);
        introducao.add(descricao);

        JPanel atalhos = new JPanel(new GridLayout(1, 3, 16, 0));
        atalhos.setOpaque(false);
        atalhos.add(criarCartao("Disciplinas", "Acesse suas matérias cadastradas."));
        atalhos.add(criarCartao("Projetos e tarefas", "Acompanhe atividades e prazos."));
        atalhos.add(criarCartao("Eventos", "Consulte provas e compromissos."));

        JPanel aviso = new JPanel(new BorderLayout());
        aviso.setBackground(BRANCO);
        aviso.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(229, 233, 240)),
                new EmptyBorder(20, 22, 20, 22)));

        JPanel textosAviso = new JPanel();
        textosAviso.setOpaque(false);
        textosAviso.setLayout(new BoxLayout(textosAviso, BoxLayout.Y_AXIS));
        JLabel avisoTitulo = new JLabel("Seu espaço de organização");
        avisoTitulo.setFont(new Font("SansSerif", Font.BOLD, 16));
        avisoTitulo.setForeground(TEXTO);
        JLabel avisoTexto = new JLabel(
                "Escolha uma opção no menu lateral para navegar pelo sistema.");
        avisoTexto.setFont(new Font("SansSerif", Font.PLAIN, 13));
        avisoTexto.setForeground(TEXTO_SECUNDARIO);
        avisoTexto.setBorder(new EmptyBorder(8, 0, 0, 0));
        textosAviso.add(avisoTitulo);
        textosAviso.add(avisoTexto);
        aviso.add(textosAviso, BorderLayout.CENTER);

        JPanel centro = new JPanel(new BorderLayout(0, 22));
        centro.setOpaque(false);
        centro.add(atalhos, BorderLayout.NORTH);
        centro.add(aviso, BorderLayout.CENTER);
        painel.add(introducao, BorderLayout.NORTH);
        painel.add(centro, BorderLayout.CENTER);
        return painel;
    }

    private JPanel criarCartao(String titulo, String descricao) {
        JPanel cartao = new JPanel();
        cartao.setBackground(BRANCO);
        cartao.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(229, 233, 240)),
                new EmptyBorder(20, 18, 20, 18)));
        cartao.setLayout(new BoxLayout(cartao, BoxLayout.Y_AXIS));

        JLabel tituloLabel = new JLabel(titulo);
        tituloLabel.setFont(new Font("SansSerif", Font.BOLD, 15));
        tituloLabel.setForeground(TEXTO);
        tituloLabel.setAlignmentX(LEFT_ALIGNMENT);

        JLabel descricaoLabel = new JLabel("<html><div style='width:170px'>"
                + descricao + "</div></html>");
        descricaoLabel.setFont(new Font("SansSerif", Font.PLAIN, 12));
        descricaoLabel.setForeground(TEXTO_SECUNDARIO);
        descricaoLabel.setBorder(new EmptyBorder(10, 0, 0, 0));
        descricaoLabel.setAlignmentX(LEFT_ALIGNMENT);
        cartao.add(tituloLabel);
        cartao.add(descricaoLabel);
        return cartao;
    }

    private JPanel criarTelaDeModulo(String titulo, String descricao) {
        JPanel painel = new JPanel(new BorderLayout());
        painel.setOpaque(false);

        JPanel cartao = new JPanel();
        cartao.setBackground(BRANCO);
        cartao.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(229, 233, 240)),
                new EmptyBorder(28, 28, 28, 28)));
        cartao.setLayout(new BoxLayout(cartao, BoxLayout.Y_AXIS));

        JLabel tituloLabel = new JLabel(titulo);
        tituloLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
        tituloLabel.setForeground(TEXTO);
        tituloLabel.setAlignmentX(LEFT_ALIGNMENT);

        JLabel descricaoLabel = new JLabel("<html><div style='width:500px'>"
                + descricao + "</div></html>");
        descricaoLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        descricaoLabel.setForeground(TEXTO_SECUNDARIO);
        descricaoLabel.setBorder(new EmptyBorder(12, 0, 0, 0));
        descricaoLabel.setAlignmentX(LEFT_ALIGNMENT);

        JLabel status = new JLabel("Módulo preparado para receber sua implementação.");
        status.setFont(new Font("SansSerif", Font.PLAIN, 12));
        status.setForeground(AZUL_ATIVO);
        status.setBorder(new EmptyBorder(24, 0, 0, 0));
        status.setAlignmentX(LEFT_ALIGNMENT);

        cartao.add(tituloLabel);
        cartao.add(descricaoLabel);
        cartao.add(status);
        painel.add(cartao, BorderLayout.NORTH);
        return painel;
    }

    private void mostrarPagina(String chave) {
        gerenciadorDeTelas.show(areaDeConteudo, chave);
        atualizarNavegacao(chave);
    }

    private void atualizarNavegacao(String chave) {
        paginaAtual = chave;
        String titulo;
        if ("inicio".equals(chave)) {
            titulo = "Visão geral";
        } else if ("disciplinas".equals(chave)) {
            titulo = "Disciplinas";
        } else if ("projetos".equals(chave)) {
            titulo = "Projetos e tarefas";
        } else if ("eventos".equals(chave)) {
            titulo = "Eventos";
        } else {
            titulo = "SprintWise";
        }
        tituloDaPagina.setText(titulo);

        for (Map.Entry<String, JButton> entrada : botoesDeNavegacao.entrySet()) {
            boolean selecionado = entrada.getKey().equals(paginaAtual);
            JButton botao = entrada.getValue();
            botao.setBackground(selecionado ? AZUL_ATIVO : AZUL_ESCURO);
            botao.setForeground(BRANCO);
            botao.setFont(new Font("SansSerif",
                    selecionado ? Font.BOLD : Font.PLAIN, 14));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ignorada) {
                // Mantém o visual padrão do Swing se o tema do sistema não estiver disponível.
            }
            new TelaPrincipal().setVisible(true);
        });
    }
}
