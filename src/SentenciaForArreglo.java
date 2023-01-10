import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lal", "Bea", "Pato", "Pepa"};
        int count = nombres.length;
        //Ciclo for que omite andres y pepa
        /*for (int i = 0; i < count; i++){
            if (nombres[i].equalsIgnoreCase("andres") || nombres[i].equalsIgnoreCase("pepa")){
                continue;
            }
            System.out.println( i + ".- " + nombres[i]);
        }*/
        //Ciclo for que omite andres y pepe cambiando todo a minúsculas y usando método contains en lugar de equalsIgnoreCase
        for (int i = 0; i < count; i++){
            if(nombres[i].toLowerCase().contains("ANDRES".toLowerCase()) ||
                    nombres[i].toLowerCase().contains("pePa".toLowerCase())){
                continue;
            }
            System.out.println( i + ".- " + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"Maria\":");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < count; i++){
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
            System.out.println("nombres = " + nombres[i]);
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado!");
        } else {
            JOptionPane.showMessageDialog(null, buscar + " no existe en el sistema!");
        }
    }
}
