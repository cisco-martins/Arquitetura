package Controller;

import Model.PessoaService;

import java.util.List;

public class PessoaController {
    private static PessoaService pessoaService;

    public PessoaController(PessoaService service) {
        this.pessoaService = service;
    }

    public List<?> mostrar(){
        return pessoaService.listarPessoa();
    }

    public void cadastrar(){
        pessoaService.cadastrarPessoa("Francisco", "francisco@gmail.com");
    }

    public void deletar(int id){
        pessoaService.deletarPessoa(id);
    }

    public void atualizar(int id, String nome){
        pessoaService.atualizarPessoa(id,nome);
    }
}
