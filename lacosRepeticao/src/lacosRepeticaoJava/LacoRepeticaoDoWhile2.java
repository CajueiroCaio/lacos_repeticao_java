package lacosRepeticaoJava;
import java.util.Scanner;

public class LacoRepeticaoDoWhile2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeros, totalNumerosMultilplosDe3 = 0, somaNumerosMultiplosDe3 = 0;
        float mediaNumerosMultiplosDe3;

        do {
            System.out.print("Digite um número: ");
            numeros = scan.nextInt();

            if(numeros % 3 == 0) {
                somaNumerosMultiplosDe3 += numeros;
                totalNumerosMultilplosDe3++;
            }
        } while (numeros != 0);

        mediaNumerosMultiplosDe3 = (float) somaNumerosMultiplosDe3 / totalNumerosMultilplosDe3;

        System.out.print("A média de todos os números múltiplos de 3 é: " + mediaNumerosMultiplosDe3);
    }
}
