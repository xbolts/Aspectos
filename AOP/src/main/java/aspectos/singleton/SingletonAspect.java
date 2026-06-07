package aspectos.singleton;

import org.aspectj.lang.*;
import org.aspectj.lang.annotation.*;

// Aspecto que garantiza una unica instancia de Logger.
// Pointcut: call(aspectos.singleton.Logger.new(..))
//   -> captura TODOS los sitios donde se llama a new Logger()
//   -> funciona en los CALLERS (Sistema, Main) no en Logger
// Advice: @Around
//   -> 1era vez: deja pasar el constructor (proceed()) y guarda la instancia
//   -> Siguientes: retorna la guardada sin ejecutar proceed()
@Aspect
public class SingletonAspect {

    private static Logger unico;

    @Around("call(aspectos.singleton.Logger.new(..))")
    public Object singletonizar(ProceedingJoinPoint jp) throws Throwable {
        if (unico == null) {
            unico = (Logger) jp.proceed();
            System.out.println("[Aspecto Singleton] Logger creado (unica vez)");
        } else {
            System.out.println("[Aspecto Singleton] Reutilizando Logger");
        }
        return unico;
    }
}
