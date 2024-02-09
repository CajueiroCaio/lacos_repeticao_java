package lacosRepeticaoJava;
import java.util.Scanner;

public class LacoRepeticaoDoWhile1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int somaNumerosPositivos = 0, numeros = 0;

        do {
            System.out.print("Digite um número: ");
            numeros = scan.nextInt();

            if(numeros >= 0) {
                somaNumerosPositivos+= numeros;
            }
        } while (numeros != 0);

        System.out.print("A soma dos números é: " + somaNumerosPositivos);
    }
}
