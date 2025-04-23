package br.mack;

public class MensagemConfidencial extends MensagemDecorator {

    public MensagemConfidencial(Mensagem mensagem) {
        super(mensagem);
    }

    public String getTexto() {
        return "[CONFIDENCIAL]: " + mensagem.getTexto();
    }

}
