import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço do livro:");
        double precoLivro = scanner.nextDouble();

        System.out.println("Digite a quantidade de livros:");
        int quantLivros = scanner.nextInt();

        double valorTotal = precoLivro * quantLivros;

        // Verifica se o desconto de 5% da p/ aplicar
        if (valorTotal > 100) {
            valorTotal -= valorTotal * 0.05; 
        }

        System.out.printf("Valor fa compra: R$ %.2f\n", valorTotal);

        scanner.close();
    }
}
