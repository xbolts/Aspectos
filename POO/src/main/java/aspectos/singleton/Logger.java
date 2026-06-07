package aspectos.singleton;

public class Logger {

    private static Logger instancia;
    private String archivo = "log.txt";

    // Constructor privado: solo esta clase puede crear instancias
    private Logger() {}

    // Metodo estatico que controla la instancia unica
    public static Logger getInstancia() {
        if (instancia == null) {
            instancia = new Logger();
        }
        return instancia;
    }

    public void info(String msg) {
        System.out.println("[INFO] " + msg);
    }

    public void error(String msg) {
        System.err.println("[ERROR] " + msg);
    }
}
