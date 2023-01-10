import javax.swing.*;

public class SistemasNumericos {

    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);

        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error debe ingresar un número entero");
            main(args);
            System.exit(0);
        }


        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        int numeroBinario = 0b11110;
        System.out.println("numeroBinario = " + numeroBinario);

        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoBinario);
        int numeroOctal = 036;
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHexa = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexa);
        int numeroHex = 0x1e;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = resultadoBinario;
        //mensaje = mensaje + "\numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        mensaje += "\n" + resultadoOctal; //la misma que arriba pero definida diferente
        mensaje += "\n" + resultadoHexa;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
