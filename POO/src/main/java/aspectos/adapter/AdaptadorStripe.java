package aspectos.adapter;

// Adapter: traduce la interfaz ProcesadorPago a StripeAPI
public class AdaptadorStripe implements ProcesadorPago {

    private StripeAPI api;

    public AdaptadorStripe(StripeAPI api) {
        this.api = api;
    }

    @Override
    public void cobrar(double monto) {
        api.cobrarExterno((float) monto, "USD");
    }
}
