package operaciones;

import java.util.Scanner;

public class ClasePadre {
    /*Esta es la clase padre.

     */
    protected int valor1;
    protected int valor2;
    protected int resultado;

    Scanner entrada = new Scanner(System.in);

    // CREACION DE UN METODO QUE PIDE VALORES AL USUARIO
    public void pedirDatos() {
        System.out.print("Dame el primer valor:");
        valor1 = entrada.nextInt();
        System.out.print("Dame el segundo valor: ");
        valor2 = entrada.nextInt();
    }

        // ESTE METODO MUESTRA EL RESULTADO
    public void mostrarResultado(){
        System.out.println(resultado);
    }



}
