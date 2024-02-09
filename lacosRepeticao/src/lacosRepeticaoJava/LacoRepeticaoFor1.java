package lacosRepeticaoJava;
import java.util.Scanner;

public class LacoRepeticaoFor1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número do intervalo: ");
        int numero1 = scan.nextInt();
        System.out.print("Digite o último número do intervalo: ");
        int numero2 = scan.nextInt();

        if (numero1 < numero2) {
            for (int i = numero1; i <= numero2; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.printf("%d é múltiplo de 3 e 5\n", i);
                }
            }

        } else {
                System.out.println("Intervalo Inválido!");
            }
    }

}
