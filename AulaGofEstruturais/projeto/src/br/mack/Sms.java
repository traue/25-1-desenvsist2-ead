package br.mack;

public class Sms implements CanalEnvio{

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }

}
