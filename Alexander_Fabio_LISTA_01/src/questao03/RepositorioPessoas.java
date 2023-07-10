package questao03;

import java.util.ArrayList;



 //public ArrayList<Palestrante> nomesPalestrantes = new ArrayList<>;

public class RepositorioPessoas {

    ArrayList<Pessoa> pessoas;
    ArrayList<Palestrante> palestrantes;
    ArrayList<Participante> participantes;

    public void inserirPessoa(Pessoa pessoa){
if(pessoa != null){
    String email = pessoa.getEmail();
    boolean emailJaCadastrado = false;
    for (Pessoa registros : pessoas){
if(registros.getEmail().equals(email)){
    emailJaCadastrado = true;
}
    }
    if(!emailJaCadastrado){
        this.pessoas.add(pessoa);
    }
}
    }

    public void removerPessoa(String email){
        boolean emailExiste = false;
        int i;
for( i = 0; i < this.pessoas.size(); i++){
    Pessoa pessoa = this.pessoas.get(i);
    if(pessoa.getEmail().equals(email)){
        emailExiste = true;
    }
}
if(emailExiste){
    this.pessoas.remove(i-1);
}
    }
    public Pessoa buscarPessoaPorEmail(String email){
        Pessoa pessoaComEmailX = null;
        boolean emailExiste1 = false;
        int i;
        for( i = 0; i < this.pessoas.size(); i++){
            Pessoa pessoa = this.pessoas.get(i);
            if(pessoa.getEmail().equals(email)){
                emailExiste1 = true;
            }
        }
        if(emailExiste1){
            pessoaComEmailX = this.pessoas.get(i-1);
        }

        return pessoaComEmailX;
    }

    public ArrayList<Palestrante> listarPalestrantesPorEmpresa(String empresa){

        return null;
    }

    public ArrayList<Palestrante> listarParticipantesComInteresseEm(String trilha){

        return null;
    }

    public ArrayList<Participante> listarParticipantesComIdadeMaiorQue(Integer idade){

        return null;
    }

    @Override
    public String toString() {
        return "RepositorioPessoas{" +
                "pessoas=" + pessoas +
                '}';
    }
}
