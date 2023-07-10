package questao03;

import java.time.LocalDate;

public class Participante extends Pessoa{
    private String trilhaDeInteresse;
    public Participante(Long codigo, String email, String nome, LocalDate dataNascimento, String cidade, String trilhaDeInteresse) {
        this.setCodigo(codigo);
        this.setEmail(email);
        this.setNome(nome);
        this.setDataNascimento(dataNascimento);
        this.setCidade(cidade);
        this.setTrilhaDeInteresse(trilhaDeInteresse);
    }
    public String getTrilhaDeInteresse() {
        return trilhaDeInteresse;
    }

    public void setTrilhaDeInteresse(String trilhaDeInteresse) {
        this.trilhaDeInteresse = trilhaDeInteresse;
    }
}
