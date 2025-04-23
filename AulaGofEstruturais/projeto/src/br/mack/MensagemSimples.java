package br.mack;

public class MensagemSimples implements Mensagem {

    private String texto;

    public MensagemSimples(String texto) {
        this.texto = texto;
    }

    @Override
    public String getTexto() {
        return texto;
    }

}
