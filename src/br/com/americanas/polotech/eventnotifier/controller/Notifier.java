package br.com.americanas.polotech.eventnotifier.controller;
import br.com.americanas.polotech.eventnotifier.interfaces.INotifier;
import br.com.americanas.polotech.eventnotifier.models.Pessoa;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;


public class Notifier implements INotifier {
    private List<Pessoa> Pessoas = new ArrayList<>();
    private HashMap<String, String> PessoaMensagem = new HashMap<>();

    private String mensagem;
    public Notifier(){
    }

    public List<Pessoa> getPessoas() {
        return this.Pessoas;
    }

    public HashMap<String, String> getPessoaMensagem(){
        return this.PessoaMensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void adicionarPessoa(Pessoa pessoa) {
        getPessoas().add(pessoa);
    }

    public void limparMensagem() {
        setMensagem(null);
        Pessoas.clear();

    }

    public void enviarMensagem(){
        getPessoas().stream().forEach((Pessoa p) -> {
            System.out.println(p.getNome() + " received a message: -> " + getMensagem());
        });

    }

    public void addInHashMap(){
        if(!this.getMensagem().equals(null)) {
            for(Pessoa p: getPessoas()) {
                getPessoaMensagem().put(p.getNome(),"received a message: -> " + this.getMensagem());
            }
        }
    }

    public void showHashMap(){
        getPessoaMensagem().entrySet().stream().forEach(entry -> {
            System.out.println("{" + entry.getKey()+"="+entry.getValue()+"}");});
    }

}
