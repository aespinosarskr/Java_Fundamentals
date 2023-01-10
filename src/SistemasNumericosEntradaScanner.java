import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;
        try {
            numeroDecimal = numeroDecimal = scanner.nextInt();//Integer.parseInt(numeroStr);

        }catch (InputMismatchException e){
            System.out.println("Error debe ingresar un número entero!");
            main(args);
            System.exit(0);
        }


        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String resultadoHexa = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        //mensaje = mensaje + "\numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        mensaje += "\n" + resultadoOctal; //la misma que arriba pero definida diferente
        mensaje += "\n" + resultadoHexa;
        System.out.println(mensaje);
    }
}