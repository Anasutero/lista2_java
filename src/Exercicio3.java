import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        double timeA = 0;
        double timeB = 0;

        Scanner leitura = new Scanner(System.in);


        System.out.println("\n---Placar do jogo: --");

        try {
            System.out.println("\nInsira a quantidadde de gol do time A:");
            timeA = leitura.nextDouble();

            System.out.println("\nInsira a quantidadde de gol do time B:");
            timeB = leitura.nextDouble();

            if (timeA> timeB){
                System.out.println("O time A foi o CAMPEÃO do jogo");
            }else if(timeA ==timeB){
                System.out.println("Nesse jogo houve um EMPATE , pois a quantidade de gol dos times foi igual");
            }else{
                System.out.println("O time B foi o CAMPEÃO d do jogo");
            }

        }catch (InputMismatchException e){
            System.out.println("ERRO: Ops.. So aceitamoos numero inteiro.");
            System.exit(0); // Encerra o programa após o erro
        }

    }

}
