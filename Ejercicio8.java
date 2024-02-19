import java.util.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Digite el Dividendo: ");
        int dividendo = sc.nextInt();
        System.out.println("Digite el Divisor: ");
        int divisor = sc.nextInt();

        if (divisor == 0) {
            System.out.println("El Divisor No Puede Ser Cero");

        } else {
            int resto = calcularResto(dividendo, divisor);
            System.out.println("El Resto de la División " + dividendo + " entre " + divisor + " es " + resto);

        }
    }

    public static int calcularResto(int dividendo, int divisor) {
        return dividendo % divisor;
    }
}
