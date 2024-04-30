import java.util.Scanner;

public class MainResta {
    public static void main(String[] args) {
        Scanner ing = new Scanner(System.in);
        System.out.println("Ingresa el primero numero");
        int a = ing.nextInt();
        System.out.println("Ingrese el segundo numero");
        int b = ing.nextInt();
        Resta p1 = new Resta();
        p1.setA(a);
        p1.setB(b);
        // sm.sumar(a, b);
        System.out.println(p1.sumar());
        System.out.println(ing.toString());
    }

}
