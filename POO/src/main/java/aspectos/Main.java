package aspectos;

import aspectos.singleton.*;
import aspectos.adapter.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== DEMO POO ===");
        System.out.println();

        // --- SINGLETON ---
        System.out.println("--- Singleton ---");
        Sistema s = new Sistema();
        s.ejecutar();
        Logger l1 = Logger.getInstancia();
        Logger l2 = Logger.getInstancia();
        System.out.println("Misma instancia? " + (l1 == l2));
        System.out.println();

        // --- ADAPTER ---
        System.out.println("--- Adapter ---");
        StripeAPI stripe = new StripeAPI();
        ProcesadorPago adapter = new AdaptadorStripe(stripe);
        CarritoCompras carrito = new CarritoCompras(adapter);
        carrito.checkout(99.99);
    }
}
