public class PrimitivosCaracteres {
    public static void main(String[] args) {

        char caracter = '\u0048';
        int decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + (simbolo == caracter));

        char espacio = ' '; //funciona con unicode \u0020
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("tipo char corresponde en byte a" + espacio + Character.BYTES);
        System.out.println("tipo char corresponde en byte a" + retroceso + Character.BYTES);
        System.out.println("tipo char corresponde en byte a" + tabulador + Character.BYTES);
        System.out.println("tipo char corresponde en bites a " + Character.SIZE);
        System.out.println("valor máximo de un char  = " + Character.MAX_VALUE);
        System.out.println("valor máximo de un char = " + Character.MIN_VALUE);

    }
}
