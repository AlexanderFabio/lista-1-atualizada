package questao03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Palestra {
    public Long id;
    public String titulo;
    public Palestrante palestrante;
    public String descricao;
    public ArrayList<Avaliacao> avaliacoes;
    public LocalDateTime dataHora;
    public String local;
    public String trilha;
}
