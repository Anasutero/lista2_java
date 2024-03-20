import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        double valor_unitario = 0;
        double quantidade = 0;
        double valor_normal = 0;
        double valor_ddesconto = 0;
        double valor_pagar = 0;

        Scanner leitura = new Scanner(System.in);

        System.out.println("\n-- Cálculo do valor da compra --");
        System.out.println("\n-- A compra de mais de 12 produtos contém desconto de 10% --");

        try {
            System.out.println("\nInsira o valor unitário do produto:");
            valor_unitario = leitura.nextDouble();

            System.out.println("\nInsira a quantidade do produto:");
            quantidade = leitura.nextDouble();

            if (quantidade <= 12) {
                valor_normal = valor_unitario * quantidade;
                System.out.println("O valor total da compra foi R$ " + String.format("%.2f", valor_normal) + ", pois comprou até 12 produtos");

            } else {
                valor_ddesconto = valor_unitario * 0.9;
                valor_pagar = valor_ddesconto * quantidade;
                System.out.println("O valor total da compra foi R$ " + String.format("%.2f", valor_pagar) + ", pois comprou mais de 12 produtos");
            }

        } catch (InputMismatchException e) {
            System.out.println("ERRO: Ops... Apenas números são aceitos.");
            System.exit(0); // Encerra o programa após o erro
        }
    }
}
