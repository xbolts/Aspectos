package aspectos.adapter;

public class StripeAPI {

    public boolean cobrarExterno(float cantidad, String moneda) {
        System.out.println("  StripeAPI: $" + cantidad + " " + moneda);
        return true;
    }
}
