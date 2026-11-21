package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Prova extends Evento {
    private Disciplina disciplina;
    private String conteudo;

    public Prova(String titulo, String descricao, LocalDate data, LocalTime hora, Disciplina disciplina, String conteudo){
        super(titulo, descricao, data, hora);
        this.disciplina = disciplina;
        this.conteudo = conteudo;
    }
    public Disciplina getDisciplina() {
        return disciplina;
    }
    public String getConteudo() {
        return conteudo;
    }
}
