import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.nextLine();

        System.out.println("Digite o salário do funcionário:");
        double salarioMes = scanner.nextDouble();

        System.out.println("Digite o nº de meses trabalhados no ano:");
        int mesesTrabalhados = scanner.nextInt();

        if (mesesTrabalhados < 1 || mesesTrabalhados > 12) {
            System.out.println("Erro: O numero de meses deve estar no intervalo de 1-12.");
        } else {
            // Calcular o salário anual
            double salarioAno = salarioMes * mesesTrabalhados;

            // Exibir o resultado
            System.out.println("Nome do funcionário: " + nome);
            System.out.printf("Salário anual: R$ %.2f\n", salarioAno);
        }

    }
}
