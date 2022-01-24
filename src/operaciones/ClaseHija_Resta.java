package operaciones;

import java.util.ArrayList;

public class ClaseHija_Resta extends ClasePadre  {

    public void restar (ArrayList<Integer> list){
        resultado = 0;
        
        for(Integer e : list){
            int rs = list.size();
            resultado = resultado - e.intValue();
        }
        System.out.println("El resultado de la resta de los" +
                "numeros ingresados es de " + resultado);
    }



}
