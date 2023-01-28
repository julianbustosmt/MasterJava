public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "El pepe";
        System.out.println("nombre = " + nombre);

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"El pepe\") = " + nombre.equals("El pepe"));
        System.out.println("nombre.equals(\"el pepe\") = " + nombre.equals("el pepe"));
        System.out.println("nombre.equalsIgnoreCase(\"el pepe\") = " + nombre.equalsIgnoreCase("el pepe"));
        System.out.println("nombre.compareTo(\"El pepe\") = " + nombre.compareTo("El pepe"));
        System.out.println("nombre.compareTo(\"Etesech\") = " + nombre.compareTo("Etesech"));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));

        System.out.println("\n");

        System.out.println("nombre.substring(3) = " + nombre.substring(3));
        System.out.println("nombre.substring(3,7) = " + nombre.substring(3,7));
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));
        
        System.out.println("\n");
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.replace(\"a\",\"*\") = " + trabalenguas.replace("a","*"));
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a')); // Posición Primera ocurrencia
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a')); // Posición Ultima ocurrencia
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('z'));
        System.out.println("trabalenguas.contains(\"a\") = " + trabalenguas.contains("a"));
        System.out.println("trabalenguas.contains(\"z\") = " + trabalenguas.contains("z"));
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));

        System.out.println("\n");

        System.out.println("    trabalenguas       ");
        System.out.println(" trabalenguas ".trim());

    }
}
