import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        double quantidade_atual;
        double quantidade_max;
        double quantidade_min;
        double quantidade_media;

        Scanner leitura = new Scanner(System.in);

        System.out.println("\n---Calculo compra de produtos---");

        try{
            System.out.println("\nInsira a quantidade atual do produto:");
            quantidade_atual= leitura.nextDouble();


            System.out.println("\nInsira a quantidade maxima do produto:");
            quantidade_max= leitura.nextDouble();

            System.out.println("\nInsira a quantidade minima do produto:");
            quantidade_min= leitura.nextDouble();

            quantidade_media=(quantidade_max + quantidade_min)/2;
            if(quantidade_atual >= quantidade_media){
                System.out.println("\nNão efetuar compra");
            }else{
                System.out.println("\nEfetuar compra");
            }

        }catch (InputMismatchException e){
            System.out.println("Ops.. Só aceitamos numeros.");
            System.exit(0); // Encerra o programa após o erro
        }

    }
}