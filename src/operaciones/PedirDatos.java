package operaciones;

import javax.swing.*;
import java.util.ArrayList;

public class PedirDatos {

    private String solicitar;
    private int contador = 0;
    private int numero;

    public ArrayList<Integer> pedir_datos() {

        ArrayList<Integer> list = new ArrayList<>();



            solicitar = JOptionPane.showInputDialog("¿Deseas ingresar un numero? " +
                    "\n  SI \n Presiona a \n  NO \n Presiona cualquier tecla");

            while (solicitar.equalsIgnoreCase("a")) {

                numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero")); // aqui va el de numero

                JOptionPane.showMessageDialog(null, "Numero ingresado"); // tambien la mude
                contador += 1;

                solicitar = JOptionPane.showInputDialog("Ingresa un numero " +
                        "\n 1. SI Presiona a \n 2. NO Presiona cualquier tecla");

                list.add(numero);
            }







            if (solicitar != "a") {
                JOptionPane.showMessageDialog(null, "Gracias");
            }
            System.out.println("Ingresaste " + contador + " numeros los cuales son: ");
            for (Integer e : list) {
                System.out.println(e.toString());
            }

        return list;
    }

    }

