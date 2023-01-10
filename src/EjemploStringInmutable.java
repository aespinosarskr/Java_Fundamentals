public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andrés Guzman";

        curso.concat(profesor);

        String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("curso = " + resultado);
        System.out.println(curso == resultado);

        /*A PARTIR DE JAVA 12
        String resultado2 = curso.transform(c -> {
            return c + " con " + profesor;
        });
        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2); */
        
        String resultado3 = resultado.replace("a", "A");

        System.out.println("resultado = " + resultado);
        System.out.println("resultado3 = " + resultado3);
        
        


    }
}
