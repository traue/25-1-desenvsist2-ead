package br.mack;

public abstract class MensagemDecorator implements Mensagem {

    protected Mensagem mensagem;

    public MensagemDecorator(Mensagem mensagem) {
        this.mensagem = mensagem;
    }

}
