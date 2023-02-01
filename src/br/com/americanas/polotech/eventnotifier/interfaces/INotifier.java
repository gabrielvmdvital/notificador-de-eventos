package br.com.americanas.polotech.eventnotifier.interfaces;

import br.com.americanas.polotech.eventnotifier.models.Pessoa;

public interface INotifier {
    public void adicionarPessoa(Pessoa pessoa);
    public void limparMensagem();
}