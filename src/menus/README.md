# Interface

Aqui ficam as telas e os componentes de interface do SprintWise.

## Janela principal

A classe `TelaPrincipal.java` cria a janela inicial usando Java Swing. Ela contém:

- Menu lateral para navegar entre Visão geral, Disciplinas, Projetos e tarefas e Eventos.
- Cabeçalho que acompanha a área selecionada.
- Painel inicial com atalhos e uma mensagem de orientação.
- Painéis provisórios para os módulos que serão conectados conforme suas funcionalidades forem implementadas.

## Como executar

Compile a partir da pasta raiz do projeto:

```bash
javac -d out src/menus/TelaPrincipal.java
java -cp out menus.TelaPrincipal
```

A classe usa apenas bibliotecas incluídas no Java (Swing e AWT). As telas dos módulos ainda são espaços reservados; as regras de negócio e os cadastros devem ser implementados nas classes e serviços correspondentes, não concentrados na janela principal.
