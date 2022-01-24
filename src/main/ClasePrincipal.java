package main;

import operaciones.*;

import javax.swing.*;
import java.util.ArrayList;

public class ClasePrincipal {

    public static void main (String[]args){
        PedirDatos ms1 = new PedirDatos();
        double n1 = ms1.pedir_dato1();
        double n2 = ms1.pedir_dato2();
        JOptionPane.showMessageDialog(null,"Ingresaste los numeros " +
                
                "\n" + n1 + " \n y " + n2);
        ClaseHija_Suma ms2 = new ClaseHija_Suma();


        ClaseHija_Resta ms3 = new ClaseHija_Resta();
        ClaseHija_Multiplicacion ms4 = new ClaseHija_Multiplicacion();
        ClaseHija_Division ms5 = new ClaseHija_Division();


        double suma = ms2.sumar(n1, n2);
        double resta = ms3.restar(n1, n2);
        double multiplica = ms4.multiplicar(n1, n2);
        double divide = ms5.dividir(n1, n2);


        System.out.println("El resultado de la suma es " + suma);
        System.out.println("El resultado de la resta es " + resta);
        System.out.println("El resultado de la multiplicacion es " + multiplica);
        System.out.println("El resultado de la division es " +divide);













        //ArrayList<Integer> list = ms1.pedir_datos();
        //ClaseHija_Suma ms2 = new ClaseHija_Suma();
        //ms2.sumar(list);
        //ClaseHija_Resta ms3 = new ClaseHija_Resta();
        //ms3.restar(list);
        //ClaseHija_Multiplicacion ms4 = new ClaseHija_Multiplicacion();
        //ms4.multiplicar(list);
        //ClaseHija_Division ms5 = new ClaseHija_Division();
        //ms5.division(list);










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
