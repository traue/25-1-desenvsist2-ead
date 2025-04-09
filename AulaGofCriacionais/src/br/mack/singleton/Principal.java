package br.mack.singleton;

public class Principal {
    public static void main(String[] args) {

        ContadorSingleton contadorSingleton = ContadorSingleton.getInstance();

        System.out.println("Valor atual do contador: " + contadorSingleton.getContador());
        System.out.println("Incrementando duas vezes....");
        contadorSingleton.incrementar();
        contadorSingleton.incrementar();
        System.out.println("Valor atual do contador: " + contadorSingleton.getContador());
        System.out.println("Decrementando três vezes....");
        contadorSingleton.decrementar();
        contadorSingleton.decrementar();
        contadorSingleton.decrementar();
        System.out.println("Valor atual do contador: " + contadorSingleton.getContador());

        System.out.println("==================");
        System.out.println("Usando a instância de outra classe....");
        TesteSingleton t = new TesteSingleton();
        t.testarSingleton();

//
//        System.out.println("Valor atual do contador: " + contadorSingleton2.getContador());
//        System.out.println("Incrementando quatro vezes...");
//        contadorSingleton2.incrementar();
//        contadorSingleton2.incrementar();
//        contadorSingleton2.incrementar();
//        contadorSingleton2.incrementar();
//        System.out.println("Valor atual do contador: " + contadorSingleton2.getContador());
//        System.out.println("Decrementando oito vezes....");
//        contadorSingleton2.decrementar();
//        contadorSingleton2.decrementar();
//        contadorSingleton2.decrementar();
//        contadorSingleton2.decrementar();
//        contadorSingleton2.decrementar();
//        contadorSingleton2.decrementar();
//        contadorSingleton2.decrementar();
//        contadorSingleton2.decrementar();
//        System.out.println("Valor atual do contador: " + contadorSingleton2.getContador());

    }
}
