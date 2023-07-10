package questao03;

public class Avaliacao {
    private Palestra palestra;
    private Integer nota;
    private String comentario;
    private Participante avaliador;

    public Palestra getPalestra() {
        return palestra;
    }

    public Integer getNota() {
        return nota;
    }

    public String getComentario() {
        return comentario;
    }

    public Participante getAvaliador() {
        return avaliador;
    }

    public void setAvaliador(Participante avaliador) {
        this.avaliador = avaliador;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public void setPalestra(Palestra palestra) {
        this.palestra = palestra;
    }
}
