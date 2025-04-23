package br.mack;

public class Email implements CanalEnvio {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando email: " + mensagem);
    }

}
