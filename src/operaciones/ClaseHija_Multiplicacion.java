package operaciones;

import java.util.ArrayList;

public class ClaseHija_Multiplicacion extends ClasePadre {

    public void multiplicar (ArrayList<Integer> list){
        resultado = 1;
        for (Integer e : list){
            resultado *= e.intValue();
        }
        System.out.println("El resultado de la multiplicación es " +
                resultado);
    }


}
