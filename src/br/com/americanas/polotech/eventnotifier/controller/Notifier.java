package br.com.americanas.polotech.eventnotifier.controller;

import br.com.americanas.polotech.eventnotifier.interfaces.INotifier;
import br.com.americanas.polotech.eventnotifier.models.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Notifier implements INotifier {
    private List<Pessoa> ListaPessoas = new ArrayList<>();

    private String mensagem;
    public Notifier(){
    }

    public List<Pessoa> getListaPessoas() {
        return ListaPessoas;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void adicionarPessoa(Pessoa pessoa) {
        getListaPessoas().add(pessoa);
    }

    public void limparMensagem() {
        setMensagem("");
    }

    public void enviarMensagem(){
        getListaPessoas().stream().forEach((Pessoa p) ->{
            System.out.println(p.getNome() + " received a message: -> " + getMensagem());
            System.out.println("{" + p.getNome() + "=" + "received a message: -> " + getMensagem());
        });

    }

}
