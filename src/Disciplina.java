package modelo;

import java.util.List;
import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private String professor;
    private String codigo;

    private List<Atividade> atividades;

    public Disciplina(String nome, String professor, String codigo){
        this.nome = nome;
        this.professor = professor;
        this.codigo = codigo;

        this.atividades = new ArrayList<>();
    }
    public String getNome() {
        return nome;
    }
    public String getProfessor() {
        return professor;
    }
    public String getCodigo() {
        return codigo;
    }
    public List<Atividade> getAtividades(){return this.atividades;}

    public void setNome(String nome) {
        this.nome = nome;}

    public void setProfessor(String professor) {
        this.professor = professor;}

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void adicionarAtividade(Atividade atividade){
        this.atividades.add(atividade);
    }
    public void removerAtividade(Atividade atividade){
        this.atividades.remove(atividade);
    }
    public Atividade buscarAtividade(String titulo) {
        for (Atividade atividade : atividades) {
            if (atividade.getTitulo().equalsIgnoreCase(titulo)) {
                return atividade;
            }
        }
        return null;
    }





}
