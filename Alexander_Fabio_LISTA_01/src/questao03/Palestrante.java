package questao03;

import java.time.LocalDate;

public class Palestrante extends Pessoa{
    private String empresa;
    public Palestrante(Long codigo, String email, String nome, LocalDate dataNascimento, String cidade, String empresa) {
        this.setCodigo(codigo);
        this.setEmail(email);
        this.setNome(nome);
        this.setDataNascimento(dataNascimento);
        this.setCidade(cidade);
        this.setEmpresa(empresa);
    }
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
