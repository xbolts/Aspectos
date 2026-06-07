package aspectos.adapter;

public class CarritoCompras {

    private ProcesadorPago pago;

    public CarritoCompras(ProcesadorPago pago) {
        this.pago = pago;
    }

    public void checkout(double total) {
        System.out.println("Carrito: Compra $" + total);
        pago.cobrar(total);
    }
}
