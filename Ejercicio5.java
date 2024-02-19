import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Diagonal_Mayor, Diagonal_Menor, Area;
        System.out.println("Digite la Diagonal Mayor: ");
        Diagonal_Mayor = sc.nextInt();
        System.out.println("Digite la Diagonal Menor: ");
        Diagonal_Menor = sc.nextInt();
        Area = Diagonal_Mayor * Diagonal_Menor / 2;
        System.out.println("El Area de su rombo es: " + Area);

    }
}
