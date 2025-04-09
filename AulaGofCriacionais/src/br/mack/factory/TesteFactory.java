package br.mack.factory;

public class TesteFactory {
    public static void main(String[] args) {
        WindowsFactory windowsFactory = new WindowsFactory();
        windowsFactory.criarBotao().render();
    }
}
