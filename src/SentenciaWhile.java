public class SentenciaWhile {
    public static void main(String[] args) {

        int i = 0; //Inicializamos variable contador
        while (i <= 5){ //Evaluamos la variable que sea menor que un límite (5 es el límite)
            System.out.println("i = " + i);//Ejecución de código mientras se cumpla la condición previa
            i++;//Incrementamos el contador inicializado luego de cada iteración
        }

        //Otro ejemplo: Mientras prueba sea true
        i = 0;
        boolean prueba = true;
        while(prueba){
            if(i == 7){//cuando 1 sea igual a 7
                prueba = false;//prueba valdrá false
            }
            System.out.println("i = " + i);
            i++;//Incrementamos el contador inicializado luego de cada iteración
        }

        prueba = false;
        do {
            System.out.println("se ejecuta al menos una vez");
        } while (prueba);

        prueba = true;
        i = 0;

        do {
            if (i == 10){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        } while (prueba);

    }
}
