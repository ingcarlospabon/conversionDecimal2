import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese nuevo numero");
        //String numeroStr = teclado.nextLine();
        int numeroDecimal = 0;
        try{
            numeroDecimal = teclado.nextInt();//Integer.parseInt(numeroStr); //500
        }catch (InputMismatchException e){
            System.out.println("Error, debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("Numero Decimal = " + numeroDecimal);
        String resultadoBinario = "Numeros binarios = " + numeroDecimal + " <=> " + Integer.toBinaryString(numeroDecimal);


        int numeroBinario = numeroDecimal;
        String resultadoOctal = "Numeros Octal = " + numeroBinario + " <=> " + Integer.toOctalString(numeroDecimal);

        int numeroOctal = numeroDecimal;
        String resultadoHexa = "Numeros Hexadecimal = " + numeroOctal + " <=> " + Integer.toHexString(numeroOctal);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexa;
        System.out.println(mensaje);

    }
}

