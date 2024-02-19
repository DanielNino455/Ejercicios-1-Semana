import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Radio;
        double Pi, Area;
        System.out.println("Digite el Radio del circulo");
        Radio = sc.nextInt();
        Pi = 3.1416;
        Area = Pi * (Radio) * (Radio);
        System.out.println("El Area del circulo es: " + Area);

    }
}
