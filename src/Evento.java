package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Evento extends Atividade {
    private LocalDate data;
    private LocalTime hora;
    private Disciplina disciplina;

    public Evento(String titulo, String descricao, LocalDate data, LocalTime hora, Disciplina disciplina) {
        super(titulo, descricao);
        this.data = data;
        this.hora = hora;
        this.disciplina = disciplina;
    }
    public LocalDate getData() {return data;}
    public LocalTime getHora() {return hora;}
    public Disciplina getDisciplina() {return disciplina;}


}
