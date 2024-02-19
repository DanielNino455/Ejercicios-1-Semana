import java.util.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num;
        System.out.println("Digite un Número: ");
        Num = sc.nextInt();

        if (Num > 0) {
            System.out.println(" EL Número Ingresado: " + Num + " Es Positivo: ");

        } else {
            System.out.println("El Número ingresado: " + Num + " Es Negativo: ");
        }

    }

}
