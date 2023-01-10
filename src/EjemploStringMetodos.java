public class EjemploStringMetodos {
    public static void main(String[] args) {
        
        String nombre = "Angel";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Angel\") = " + nombre.equals("Angel"));
        System.out.println("nombre.equals(\"angel\") = " + nombre.equals("angel"));
        System.out.println("nombre.equals(\"angel\") = " + nombre.equalsIgnoreCase("angel"));
        System.out.println("nombre.compareTo(\"Angel\") = " + nombre.compareTo("Angel"));
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(4) = " + nombre.charAt(4));
        System.out.println("nombre.charAt(nombre.length() -1) = " + nombre.charAt(nombre.length() -1));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4));
        System.out.println("nombre.substring(3, 5) = " + nombre.substring(3, 5));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas.indexOf() = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf() = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalengua.contains  = " + trabalenguas.indexOf("lenguas"));
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println(" trabalenguas ");
        System.out.println(" trabalenguas ".trim());
    }
}
