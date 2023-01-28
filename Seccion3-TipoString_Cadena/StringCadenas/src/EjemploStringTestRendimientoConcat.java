public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++){
            //c = c.concat(a).concat(b).concat("\n"); // 500 -> 2ms ; 1000 -> 4ms ; 10000 -> 94ms
            //c += a + b + "\n"; // 500 -> 11ms // 1000 -> 12ms ; 10000 -> 57ms
            sb.append(a).append(b).append("\n"); //500 -> 1ms ; 1000->0 ; 10000 -> 5ms

        }

        //System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);

    }
}
