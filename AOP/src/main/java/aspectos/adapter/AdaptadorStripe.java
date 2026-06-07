package aspectos.adapter;

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
