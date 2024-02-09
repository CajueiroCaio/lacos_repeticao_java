package lacosRepeticaoJava;
import java.util.Scanner;

public class LacoRepeticaoWhile2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade, somaTodasidades = 0, totalPessoasBackend = 0, mulheresCisETransDevFrontend = 0;
        int homensCisETransDevMobileMaior40Anos = 0, naoBinariosDevFullStackMenor30Anos = 0, totalPessoas = 0;
        float mediaIdade;
        String continuar = "s";

        String mensagemIdentidadeDeGenero = """
                -----------------
                1 - Mulher Cis
                2 - Homem Cis
                3 - Não Binário
                4 - Mulher Trans
                5 - Homem Trans
                6 - Outros
                -----------------
                """;
        String mensagemPessoaDesenvolvedora = """
                -----------------
                1 - Backend
                2 - Frontend
                3 - Mobile
                4 - FullStack
                -----------------
                """;

        while(continuar.equals("s")) {
            System.out.print("Digite sua idade: ");
            idade = scan.nextInt();

            somaTodasidades += idade;
            totalPessoas++;

            System.out.println("Qual sua identidade de gênero? ");
            System.out.println(mensagemIdentidadeDeGenero);
            int identidadeEscolhida = scan.nextInt();
            scan.nextLine();

            System.out.println("Qual a sua área de desenvolvimento? ");
            System.out.println(mensagemPessoaDesenvolvedora);
            int pessoaDev = scan.nextInt();
            scan.nextLine();

            if (pessoaDev == 1)
                totalPessoasBackend++;

            if ((identidadeEscolhida == 1 || identidadeEscolhida == 4) && pessoaDev == 2)
                mulheresCisETransDevFrontend++;

            if ((identidadeEscolhida == 2 || identidadeEscolhida == 5) && pessoaDev == 3 && idade > 40)
                homensCisETransDevMobileMaior40Anos++;

            if (identidadeEscolhida == 3 && pessoaDev == 4 && idade <30)
                naoBinariosDevFullStackMenor30Anos++;

            System.out.print("Deseja continuar? (s/n) ");
            continuar = scan.nextLine();
        }

        mediaIdade = (float) somaTodasidades / totalPessoas;

        System.out.println("O número total de pessoas que responderam à pesquisa: " + totalPessoas);
        System.out.println("Total de pessoas desenvolvedoras Backend: " + totalPessoasBackend);
        System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulheresCisETransDevFrontend);
        System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homensCisETransDevMobileMaior40Anos);
        System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + naoBinariosDevFullStackMenor30Anos);
        System.out.print("A média de idade das pessoas que responderam à pesquisa: " + mediaIdade);
    }


}
