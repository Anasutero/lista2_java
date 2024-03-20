import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        double idade =0;

        Scanner leitura = new Scanner(System.in);

        System.out.println("\n-- Descubra sua categoria--");

        try {
            System.out.println("\nInsira o sua idade:");
            idade = leitura.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("ERRO: Ops.. So aceitamoos numero inteiro.");
            System.exit(0); // Encerra o programa após o erro
        }
        if(idade == 0 || idade <= 14){
            System.out.println("\nVocê encaixa na categoria: CRIANÇA");
        }else if( idade == 15 || idade <=17){
            System.out.println("\nVocê encaixa na categoria: ADOLESCENTE");
        }else if(idade == 18 || idade <=30){
            System.out.println("\nVocê encaixa na categoria: ADULTO JOVEM");
        }else{
            System.out.println("\nVocê encaixa na categoria: ADULTO");
        }

    }
}
