public class EjemploClaseMath {
    public static void main(String[] args) {

        int absolute = Math.abs(-456);
        System.out.println("absolute = " + absolute);

        absolute = Math.abs(456);
        System.out.println("absolute = " + absolute);

        double max = Math.max(3.52 , 1.35);
        System.out.println("max = " + max);

        double min = Math.min(3.52, 1.35);
        System.out.println("min = " + min);

        double techo = Math.ceil(3.6);
        System.out.println("techo = " + techo);

        double piso = Math.floor(3.6);
        System.out.println("piso = " + piso);

        long entero = Math.round(3.3);
        System.out.println("entero = " + entero);

        long pi = Math.round(Math.PI);
        System.out.println("pi = " + pi);

        double exp = Math.exp(2);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);

        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("Convertir radianes a grados = " + grados);
        
        double radianes = Math.toRadians(90);
        System.out.println("Convertir de grados a radianes = " + radianes);

        System.out.println("Math.sin(radianes) = " + Math.sin(radianes));
        System.out.println("Math.cos(radianes) = " + Math.cos(radianes));

        radianes = Math.toRadians(180);
        System.out.println("radianes = " + radianes);
        System.out.println("Math.sin(radianes) = " + Math.sin(radianes));
        System.out.println("Math.cos(radianes) = " + Math.cos(radianes));

    }
}
