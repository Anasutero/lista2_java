import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        String pergunta1;
        String pergunta2;
        String menuInput;
        int menu = 0; // Inicializando com um valor padrão
        Scanner leitura = new Scanner(System.in);
        System.out.println("\n--Programa perguntas e respostas--");

        do {
            System.out.println("\nFaça a escolha de qual pergunta deseja responder:");
            System.out.println("1. Pergunta 1\n2. Pergunta 2\n3. Sair");
            System.out.println("Escolha uma opção:");

            menuInput = leitura.nextLine();

            try {
                menu = Integer.parseInt(menuInput);
            } catch (NumberFormatException e) {
                System.out.println("Erro: Ops.. Insira um numero valido!");
                continue;
            }

            if (menu == 1) {
                System.out.println("\nQual método para ler em Java?");
                System.out.println("\nEscolha a alternativa correta:");
                System.out.println("a - While\nb - Scanner\nc - Print");
                System.out.println("Escolha uma opção:");
                pergunta1 = leitura.nextLine().toUpperCase().trim();

                if (pergunta1.equalsIgnoreCase("b")) {
                    System.out.println("Parabéns, você acertou!");
                    System.out.println("Pode retirar seu bônus na Shostners and Shostners");
                } else {
                    System.out.println("Você não acertou, mas tente novamente numa próxima");
                }
            } else if (menu == 2) {
                System.out.println("\nPra que serve o print em Java?");
                System.out.println("\nEscolha a alternativa correta:");
                System.out.println("a - Para apresentar valores para os usuários no terminal.\nb - Para deixar bonito\nc - Para fazer conta.");
                System.out.println("Escolha uma opção:");
                pergunta2 = leitura.nextLine().toUpperCase().trim();

                if (pergunta2.equalsIgnoreCase("a")) {
                    System.out.println("Parabéns, você acertou!");
                    System.out.println("Pode retirar seu bônus na Shostners and Shostners");
                } else {
                    System.out.println("Você não acertou, mas tente novamente numa próxima");
                }
            } else if (menu == 3) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }
        } while (menu != 3);
    }
}
