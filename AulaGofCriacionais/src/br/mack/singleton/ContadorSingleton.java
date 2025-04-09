package br.mack.singleton;

public class ContadorSingleton {

    private static ContadorSingleton instance;
    private int contador = 0;

    private ContadorSingleton() { }

    public static ContadorSingleton getInstance() {
        if (instance == null) {
            instance = new ContadorSingleton();
        }
        return instance;
    }

    public void incrementar() {
        contador++;
    }

    public void decrementar() {
        contador--;
    }

    public int getContador() {
        return contador;
    }
}
