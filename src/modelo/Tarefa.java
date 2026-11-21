package modelo;

import java.time.LocalDate;

public class Tarefa extends Atividade {
    private LocalDate prazoEntrega;
    private String prioridade;
    private String status;
    private Disciplina disciplina;
    private Projeto projeto;

    public Tarefa(String titulo, String descricao, LocalDate prazo, String prioridade, String status, Disciplina disciplina, Projeto projeto){
        super(titulo, descricao);
        this.prazoEntrega = prazo;
        this.prioridade = prioridade;
        this.status = status;
        this.disciplina = disciplina;
        this.projeto = projeto;
    }
    public LocalDate getPrazoEntrega() {
        return prazoEntrega;
    }
    public String getPrioridade() {
        return prioridade;
    }
    public String getStatus() {
        return status;
    }
    public Disciplina getDisciplina() {return disciplina;}
    public Projeto getProjeto() {return projeto;}


}
