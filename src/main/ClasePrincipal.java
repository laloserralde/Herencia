package main;

import operaciones.*;

import java.util.ArrayList;

public class ClasePrincipal {

    public static void main (String[]args){
        PedirDatos ms1 = new PedirDatos();
        ArrayList<Integer> list = ms1.pedir_datos();
        ClaseHija_Suma ms2 = new ClaseHija_Suma();
        ms2.sumar(list);
        ClaseHija_Resta ms3 = new ClaseHija_Resta();
        ms3.restar(list);
        ClaseHija_Multiplicacion ms4 = new ClaseHija_Multiplicacion();
        ms4.multiplicar(list);
        ClaseHija_Division ms5 = new ClaseHija_Division();
        ms5.division(list);










        //Este objeto se esta comunicando con la clase hija suma.
        //ClaseHija_Suma mensajeroSuma = new ClaseHija_Suma();
        //mensajeroSuma.pedirDatos(); //Sino se manda a llamar a este metodo no se podran sumar
        //mensajeroSuma.Sumar(); //llama al metodo sumar
        //System.out.print("El resultado de la suma es " );
        //mensajeroSuma.mostrarResultado();

        //ClaseHija_Resta mensajeroResta = new ClaseHija_Resta();
        //mensajeroResta.pedirDatos();
        //mensajeroResta.Restar();
        //System.out.print("El resultado de tu resta es ");
        //mensajeroResta.mostrarResultado();


    }
}
