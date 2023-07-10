package questao02;

import java.time.LocalDateTime;

public abstract class Usuario {

    private String email;
    private String nomeCompleto;
    private LocalDateTime dataNascimento;

    public String getEmail() {
        return email;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
