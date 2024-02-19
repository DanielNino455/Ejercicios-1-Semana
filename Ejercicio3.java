import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Base, Altura, Area;
        System.out.println("Digite la Base del triangulo: ");
        Base = sc.nextInt();
        System.out.println("Digite la Altura del triangulo: ");
        Altura = sc.nextInt();
        Area = Base * Altura / 2;
        System.out.println("El resultado del Area es: " + Area);

    }
}
