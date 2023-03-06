import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {

        String texto = "Hola bb , que mas pues";

        Class strClass = texto.getClass();

        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        System.out.println(".getPackage() = " + strClass.getPackage());
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());

        for (Method metodo: strClass.getMethods()){
            System.out.println("strClass.getMethods() = " + metodo.getName());
        }

        Integer num = 34;

        Class intClass = num.getClass();
        Class objtClass = intClass.getSuperclass().getSuperclass();

        System.out.println("intClass.getName() = " + intClass.getName());
        System.out.println("intClass.getPackage() = " + intClass.getPackage());
        System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass());
        System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass().getSuperclass());

        for (Method metodo: objtClass.getMethods()){
            System.out.println("objtClass.getMethods() = " + metodo.getName());
        }

    }
}
