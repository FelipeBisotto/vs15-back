import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Exibir o menu de operações
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("9. Sair");
            System.out.print("Digite sua escolha: ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1: // Adição
                    System.out.print("Digite o primeiro número: ");
                    double a1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double b1 = scanner.nextDouble();
                    System.out.println("Resultado: " + (a1 + b1));
                    break;

                case 2: // Subtração
                    System.out.print("Digite o primeiro número: ");
                    double a2 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double b2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (a2 - b2));
                    break;

                case 3: // Multiplicação
                    System.out.print("Digite o primeiro número: ");
                    double a3 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double b3 = scanner.nextDouble();
                    System.out.println("Resultado: " + (a3 * b3));
                    break;

                case 4: // Divisão
                    System.out.print("Digite o primeiro número: ");
                    double a4 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double b4 = scanner.nextDouble();
                    if (b4 != 0) {
                        System.out.println("Resultado: " + (a4 / b4));
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida!");
                    }
                    break;

                    // faltou as outras operacoes

                case 9: // Sair
                    System.out.println("Saindo... Até mais!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
