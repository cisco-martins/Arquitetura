package Model;

public class TarefaService {

    public void cadastrarPessoa(int id, String nome, String email){
        Pessoa pessoa = new Pessoa(id, nome, email);
    }
}
