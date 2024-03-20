import java.util.Scanner;

//refazer esse amanha
public class Exercicio4 {
    public static void main(String[] args) {
        int escolha= 0;
        int pacote1;
        int pacote2;
        double valor_base =3000;
        double pacote1_incluso=0;
        double paote1_normal=0;
        double pacote2_incluso=0;
        double paote2_normal=0;



        Scanner leitura = new Scanner(System.in);

        System.out.println("\n---Planejamento viagem: ---");


        // Loop para garantir entrada válida para o destino
        while (escolha != 1 && escolha != 2) {
            System.out.println("\nDigite onde você deseja passar suas férias: ");
            System.out.println("1. Maceió");
            System.out.println("2. Porto Galinhas");
            System.out.print("Escolha: ");
            if (leitura.hasNextInt()) {
                escolha = leitura.nextInt();
                if (escolha != 1 && escolha != 2) {
                    System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                leitura.next(); // Limpar o buffer do Scanner
            }
        }
        switch (escolha) {
            case 1:
                System.out.println("Ótimo, quase tudo pronto para suas férias em Maceió!");
                System.out.println("\n Digite qual pacote voce prefere:");
                System.out.println("1. Almoço e janta incluso");
                System.out.println("2. nada incluso");
                System.out.print("Escolha: ");
                pacote1 = leitura.nextInt();

                if (pacote1==1){
                    pacote1_incluso =valor_base +(3000 *100)/100;
                    System.out.println("O valor a ser pago pelo pacote fechado é: R$" +pacote1_incluso);
                } else if (pacote1 ==2) {
                    paote1_normal =valor_base +(3000 *85)/100;
                    System.out.println("O valor a ser pago pelo pacote fechado é: R$" +paote1_normal);
                } else {
                    System.out.println("Opção de pacote inválida.");
                }
                break;

            case 2:
                System.out.println("Ótimo, quase tudo pronto para suas férias em Porto Galinhas!");
                System.out.println("\nDigite qual pacote voce prefere:");
                System.out.println("1. Almoço e janta incluso");
                System.out.println("2. nada incluso");
                System.out.print("Escolha: ");
                pacote2 = leitura.nextInt();

                if (pacote2==1){
                    pacote2_incluso =valor_base +(3000 *60)/100;
                    System.out.println("O Valor a ser pago pelo pacote fechado é: R$" + pacote2_incluso);
                } else if (pacote2 ==2) {
                    paote2_normal =valor_base +(3000 *45)/100;
                    System.out.println("O Valor a ser pago pelo pacote fechado é: R$" + paote2_normal);
                }
                else {
                    System.out.println("Opção de pacote inválida.");
                }
                break;
            default:
                System.out.println("Destino inválido.");
                break;
        }
    }
}
