package br.mack;

public abstract class Notificacao {

    protected CanalEnvio canal;

    public Notificacao(CanalEnvio canal) {
        this.canal = canal;
    }

    public abstract void enviar(String mensagem);

}
