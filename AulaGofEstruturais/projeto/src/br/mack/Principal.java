package br.mack;

public class Principal {

    public static void main(String[] args) {

        // msg simples:
        Mensagem msgSimples = new MensagemSimples("O Mck é top!");

        // msg com decorator:
        Mensagem msgUrgente = new MensagemUrgente(msgSimples);

        Mensagem msgConfidencial = new MensagemConfidencial(msgUrgente);

        Notificacao alertaEmail = new Alerta(new Email());
        alertaEmail.enviar(new MensagemUrgente(new MensagemSimples("Tem promoção no Bobs")).getTexto());
        alertaEmail.enviar(new MensagemConfidencial(new MensagemSimples("Todo mundo vai tirar 10, se estudar!")).getTexto());
        alertaEmail.enviar(new MensagemSimples("O ADS é um curso TOP!").getTexto());
    }
}
