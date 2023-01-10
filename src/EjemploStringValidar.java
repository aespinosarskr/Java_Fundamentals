import javax.lang.model.SourceVersion;

public class EjemploStringValidar {
    public static void main(String[] args) {

        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if (esNulo){

            curso = " "; //"Programación Java";

        }

        boolean esVacio = curso.length() == 0;

        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        /* a partir de Java 11 se implementa .isBlank()
         boolean esBlanco = curso.isBlank();
         System.out.println("esBlanco = " + esBlanco); */

        if (curso.isEmpty() == false){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }


    }
}
