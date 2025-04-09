package br.mack.factory;

public class BotaoWindows implements Botao {

    @Override
    public void render() {
        System.out.println("Botao renderizado na Janela");
    }

}
