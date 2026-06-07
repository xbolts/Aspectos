package aspectos.adapter;

import org.aspectj.lang.*;
import org.aspectj.lang.annotation.*;

// Aspecto que agrega logging transversal al flujo de pago.
// En POO este logging iria disperso en cada metodo o en el Main.
// En AOP esta centralizado en un solo aspecto.
//
// Pointcut: execution(* aspectos.adapter.ProcesadorPago.cobrar(..))
// Advice @Before: se ejecuta ANTES de cobrar()
// Advice @AfterReturning: se ejecuta DESPUES si todo sale bien
@Aspect
public class PagoAspect {

    @Before("execution(* aspectos.adapter.ProcesadorPago.cobrar(..))")
    public void antesCobro(JoinPoint jp) {
        Object monto = jp.getArgs()[0];
        System.out.println("  [Aspecto Pago] Iniciando cobro $" + monto);
    }

    @AfterReturning("execution(* aspectos.adapter.ProcesadorPago.cobrar(..))")
    public void despuesCobro() {
        System.out.println("  [Aspecto Pago] Cobro exitoso");
    }
}
