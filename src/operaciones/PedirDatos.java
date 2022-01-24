package operaciones;

import javax.swing.*;

public class PedirDatos {

    public double pedir_dato1() {
        double number1 = Double.parseDouble(JOptionPane.showInputDialog("Digita el primer numero"));
        return number1;


    }

    public double pedir_dato2(){
        double number2 = Double.parseDouble(JOptionPane.showInputDialog("Digita el segundo numero"));
        return number2;

    }



}






