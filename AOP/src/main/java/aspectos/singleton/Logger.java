package aspectos.singleton;

// Logger es un POJO (Plain Old Java Object).
// No sabe que sera singleton. El aspecto SingletonAspect
// se encarga de interceptar new Logger() y retornar
// siempre la misma instancia.
public class Logger {

    private String archivo = "log.txt";

    public Logger() {}

    public void info(String msg) {
        System.out.println("[INFO] " + msg);
    }

    public void error(String msg) {
        System.err.println("[ERROR] " + msg);
    }
}
