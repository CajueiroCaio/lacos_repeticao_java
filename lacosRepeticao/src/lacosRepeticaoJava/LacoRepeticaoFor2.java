package lacosRepeticaoJava;
import java.util.Scanner;

public class LacoRepeticaoFor2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numerosPares = 0;
        int numerosImpares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o %d número: ", i);
            int numero = scan.nextInt();
            if (numero % 2 == 0) {
                numerosPares++;
            } else {
                numerosImpares++;
            }

        }
        System.out.println("Total de números pares: " + numerosPares);
        System.out.println("Total de números ímpares: " + numerosImpares);
    }
}