package lacosRepeticaoJava;
import java.util.Scanner;

public class LacoRepeticaoWhile1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pessoasMenoresDe21 = 0;
        int pessoasMaioresDe50 = 0;
        int idade = 0;

        while (idade >= 0) {
                System.out.print("Digite uma idade: ");
                idade = scan.nextInt();

                if (idade < 21 && idade >= 0) {
                    pessoasMenoresDe21++;
                } else if (idade > 50) {
                    pessoasMaioresDe50++;
                }


        }

        System.out.println("Total de pessoas menores de 21 anos: " + pessoasMenoresDe21);
        System.out.println("Total de pessoas maiores de 50 anos: " + pessoasMaioresDe50);
    }
}
