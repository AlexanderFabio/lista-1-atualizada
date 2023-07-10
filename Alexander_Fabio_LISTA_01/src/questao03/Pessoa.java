package questao03;

import java.time.LocalDate;

public abstract class Pessoa {
    private Long codigo;
    private String email;
    private String nome;
    private LocalDate dataNascimento;
    private String cidade;

    // Construtor default

    public Pessoa(){
        codigo = 0000L;
        email = null;
        nome = null;
        dataNascimento = null;
        cidade = null;
    }

    // Construtor normal

    public Pessoa(Long codigo, String email, String nome, LocalDate dataNascimento, String cidade) {
        this.codigo = codigo;
        this.email = email;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cidade = cidade;
    }

    // Getters e Setters

    public Long getCodigo() {
        return codigo;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "codigo=" + codigo +
                ", email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
