package operaciones;
/* Se tiene que indicar primero al programa
que vamos a herdar los atributos de la clase padre
 */

import java.util.ArrayList;

/* con esto ya se heredaron los atributos de una clase

 */
public class ClaseHija_Suma extends ClasePadre {

    public void sumar (ArrayList<Integer> list){

        for(Integer e : list){
            resultado += e.intValue();
        }
        System.out.println("El resultado de la suma de los" +
                " numeros ingresados es de " + resultado);


    }



    /* public void Sumar(){

        resultado = valor1 + valor2;
    } */

}
