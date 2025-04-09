package br.mack.singleton;

public class TesteSingleton {

    public void testarSingleton() {
        ContadorSingleton contadorSingleton = ContadorSingleton.getInstance();

        System.out.println("Valor atual do contador: " + contadorSingleton.getContador());
        System.out.println("Incrementando quatro vezes...");
        contadorSingleton.incrementar();
        contadorSingleton.incrementar();
        contadorSingleton.incrementar();
        contadorSingleton.incrementar();
        System.out.println("Valor atual do contador: " + contadorSingleton.getContador());
        System.out.println("Decrementando oito vezes....");
        contadorSingleton.decrementar();
        contadorSingleton.decrementar();
        contadorSingleton.decrementar();
        contadorSingleton.decrementar();
        contadorSingleton.decrementar();
        contadorSingleton.decrementar();
        contadorSingleton.decrementar();
        contadorSingleton.decrementar();
        System.out.println("Valor atual do contador: " + contadorSingleton.getContador());
    }


}
