import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Exercicio6 {
    public static void main(String[] args) {
        int tentativas = 3;
        double numero;

        Scanner leitura = new Scanner(System.in);
        System.out.println("\n----Sorteador Java----");
        System.out.println("----OBS: Você tem 3 tentativas para acertar!----");

        Random random = new Random();
        int valor = random.nextInt(101); // Gera um número aleatório entre 0 e 100
        System.out.println("Número gerado: " + valor);

        while (tentativas > 0) {
            System.out.println("\nInsira um número de 0 a 100:");
            try {
                numero = leitura.nextDouble();
                if (numero == valor) {
                    System.out.println("Parabéns, você acertou!");
                    return; // Termina o programa após o acerto
                } else {
                    tentativas--;
                    System.out.println("Ops.. Você ainda tem " + tentativas + " chance(s)!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ops.. Só aceitamos números.");
                leitura.next(); // Limpa o buffer do Scanner
            }
        }
        System.out.println("Ops.. Acabou suas chances!!");
    }
}
