package br.mack;

public class MensagemUrgente extends MensagemDecorator {

    public MensagemUrgente(Mensagem mensagem) {
        super(mensagem);
    }
    public String getTexto() {
        return "[URGENTE]: " + mensagem.getTexto();
    }

}
