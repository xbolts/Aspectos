package aspectos;

import aspectos.singleton.*;
import aspectos.adapter.*;

// ─── COMO EJECUTAR ───
// Requiere compilar con Maven (AspectJ no funciona con javac directo).
//
// ── Forma 1 (terminal) ──
//   1. cd AOP
//   2. mvn clean compile
//   3. java -cp "target/classes;$env:USERPROFILE\.m2\repository\org\aspectj\aspectjrt\1.9.22.1\aspectjrt-1.9.22.1.jar" aspectos.Main
//
// ── Forma 2 (script run.ps1) ──
//   1. cd AOP
//   2. mvn clean compile
//   3. .\run.ps1
// ─────────────────────

public class Main {
    public static void main(String[] args) {
        System.out.println("=== DEMO AOP (AspectJ) ===");
        System.out.println();

        // --- SINGLETON ---
        // Usamos new Logger(). El aspecto SingletonAspect intercepta
        // y garantiza una unica instancia.
        System.out.println("--- Singleton ---");
        Logger log = new Logger();
        log.info("Sistema iniciado");

        Logger l1 = new Logger();
        Logger l2 = new Logger();
        System.out.println("Misma instancia? " + (l1 == l2));
        System.out.println();

        // --- ADAPTER ---
        // El aspecto PagoAspect agrega logging transversal
        // (@Before y @AfterReturning sobre cobrar())
        System.out.println("--- Adapter ---");
        StripeAPI stripe = new StripeAPI();
        ProcesadorPago adapter = new AdaptadorStripe(stripe);
        CarritoCompras carrito = new CarritoCompras(adapter);
        carrito.checkout(99.99);
    }
}
