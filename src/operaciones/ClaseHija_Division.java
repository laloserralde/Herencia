package operaciones;

import java.util.ArrayList;

public class ClaseHija_Division extends ClasePadre {

    public void division (ArrayList<Integer> list){

        for (Integer e : list){
            resultado /= Double.valueOf(e.intValue());
        }
        System.out.println("El resultado de la division de los numeros " +
                "es de " +resultado);
    }
}
