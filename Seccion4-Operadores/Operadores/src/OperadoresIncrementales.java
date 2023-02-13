public class OperadoresIncrementales {
    public static void main(String[] args) {

        // Pre Incremento
        System.out.println("Pre Incremento");
        int i = 1;
        System.out.println("i = " + i);

        int j = ++i; // i = i +1
        System.out.println("j = " + j);
        System.out.println("i = " + i);

        // Post Incremento
        System.out.println("Post Incremento");
        i = 2;
        System.out.println("i = " + i);

        j = i++;
        System.out.println("j = " + j);
        System.out.println("i = " + i);

        // Pre Decremento
        System.out.println("Pre Decremento");
        i = 3;
        System.out.println("i = " + i);

        j = --i; // i = i - 1
        System.out.println("j = " + j);
        System.out.println("i = " + i);

        // Post Decremento
        System.out.println("Post Decremento");
        i = 4;
        System.out.println("i = " + i);

        j = i--;
        System.out.println("j = " + j);
        System.out.println("i = " + i);

        System.out.println("(++j) = " + (++j));
        System.out.println("(j++) = " + (j++));

    }
    }
