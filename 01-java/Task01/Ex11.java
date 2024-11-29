import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto:");
        String nomeProduto = scanner.nextLine();

        System.out.println("Digite o preço do produto:");
        double precoProduto = scanner.nextDouble();

        System.out.println("\nPromoção: " + nomeProduto);
        for (int quant = 1; quant <= 10; quant++) {
            double desconto = quant * 5; 
            if (desconto > 50) {
                desconto = 50; 
            }

      
            double precoDesconto = precoProduto * (1 - desconto / 100);

            double valorTotal = precoDesconto * quant;

            System.out.printf("%10d | R$ %16.2f | R$ %10.2f\n", quant, precoDesconto, valorTotal);
        }

    }
}
