import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num1, Num2, Num3, M_Aritmética;
        System.out.println("Digite el Número 1: ");
        Num1 = sc.nextInt();
        System.out.println("Digite el Número 2: ");
        Num2 = sc.nextInt();
        System.out.println("Digite el Número 3: ");
        Num3 = sc.nextInt();
        M_Aritmética = Num1 + Num2 + Num3 / 3;
        System.out.println("La Media Aritmética De Los 3 Números es: " + M_Aritmética);
    }
}
