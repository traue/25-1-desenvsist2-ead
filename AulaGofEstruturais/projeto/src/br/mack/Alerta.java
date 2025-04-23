package br.mack;

public class Alerta extends Notificacao {

    public Alerta(CanalEnvio canal) {
        super(canal);
    }

    public void enviar(String mensagem) {
        canal.enviar(mensagem);
    }

}
