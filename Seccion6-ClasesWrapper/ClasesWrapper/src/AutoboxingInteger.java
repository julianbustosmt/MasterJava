public class AutoboxingInteger {
    public static void main(String[] args) {

        Integer[] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int suma = 0;

        //Forma explicita (Innecesario)
        /*for (Integer num: enteros
             ) {
            if(num.intValue() % 2 == 0){
                suma += num.intValue();
            }
        }
        System.out.println("suma = " + suma);*/

        // Forma implicita
        for (Integer num : enteros
        ) {
            if (num % 2 == 0) {
                suma += num;
            }
        }
        System.out.println("suma = " + suma);

    }
}
