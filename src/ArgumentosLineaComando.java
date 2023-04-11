/*/En la terminal javac nombreArchivo.java para compilar
java nombre archivo sin extension para ejecutar
javac nombre de archivo.java y la bandera -encoding utf8 para que el compilador reconozca caracteres especiales*/
public class ArgumentosLineaComando {
    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println("Debe ingresar argumentos o parámetros!");
            System.exit(-1);//0:ok 1:se lanza una Exception  -1:error
        }
        for (int i = 0; i < args.length; i++){
            System.out.println("Argumentos nº " + i + ": " + args[i] );
        }
    }
}
