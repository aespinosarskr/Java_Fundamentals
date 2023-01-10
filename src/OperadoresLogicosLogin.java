import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        /*String[] usernames = new String [3];
        String[] passwords = new String[3];
        usernames[0] = "Angel";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1]= "12345";

        usernames[2] = "pepe";
        passwords[2]= "12345";*/
        String[] usernames = {"angel", "admin", "pepe"};
        String[] passwords = {"123", "1234", "12345"};


        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username: ");
        String usuario = scanner.nextLine();

        System.out.println("Ingrese el password: ");
        String pass = scanner.nextLine();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {
            esAutenticado = (usernames[i].equals(usuario) && passwords[i].equals(pass)) ? true: esAutenticado;

            /*if ( usernames[i].equals(usuario) && passwords[i].equals(pass)){
                esAutenticado = true;
                break;
            }*/
        }

        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(usuario).concat("!") : "username o contraseña incorrectos!\nLo sentimos, requiere autenticación";
        System.out.println("mensaje = " + mensaje);

        /*if (esAutenticado){
            System.out.println("Bienvenido usuario ".concat(usuario).concat("!"));

        }else {
            System.out.println("username o contraseña incorrectos!");
            System.out.println("Lo siento, requiere autenticación");

        }*/


    }
}
