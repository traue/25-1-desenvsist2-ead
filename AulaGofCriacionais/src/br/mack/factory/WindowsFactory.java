package br.mack.factory;

public class WindowsFactory implements GuiFactory {

    @Override
    public Botao criarBotao() {
        return new BotaoWindows();
    }
}
