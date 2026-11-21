package modelo;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Projeto extends Atividade {
    private LocalDate prazoFinal;
    private LocalDate dataCriacao;
    private Disciplina disciplina;
    private List<Tarefa> tarefas;

    public Projeto(String titulo, String descricao, LocalDate prazo, LocalDate criacao, Disciplina disciplina) {
        super(titulo, descricao);
        this.prazoFinal = prazo;
        this.disciplina = disciplina;
        this.dataCriacao = criacao;
        this.tarefas = new ArrayList<>();
    }
    public Disciplina getDisciplina() {return disciplina;}
    public LocalDate getPrazoFinal() {return prazoFinal;}
    public LocalDate getDataCriacao() {return dataCriacao;}

    public void adicionarTarefa(Tarefa tarefa){
        this.tarefas.add(tarefa);
    }
    public void removerTarefa(Tarefa tarefa){
        this.tarefas.remove(tarefa);
    }
    public List<Tarefa> listarTarefas(){
        return this.tarefas;
    }
}
