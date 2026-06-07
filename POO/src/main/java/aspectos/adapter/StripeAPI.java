package aspectos.adapter;

// Adaptee: API externa de terceros (simulada)
// Tiene una firma incompatible con lo que espera el sistema
public class StripeAPI {

    public boolean cobrarExterno(float cantidad, String moneda) {
        System.out.println("  StripeAPI: $" + cantidad + " " + moneda);
        return true;
    }
}
