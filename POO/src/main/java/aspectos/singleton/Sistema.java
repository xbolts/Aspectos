package aspectos.singleton;

public class Sistema {

    public void ejecutar() {
        Logger log = Logger.getInstancia();
        log.info("Sistema iniciado");
    }
}
