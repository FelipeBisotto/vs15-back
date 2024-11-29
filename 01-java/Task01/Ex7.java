import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos da turma:");
        int quantAlunos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= quantAlunos; i++) {
            System.out.println("\nDigite o nome do aluno " + i + ":");
            String nome = scanner.nextLine();

            // Solicitar as notas do aluno
            System.out.println("Digite a nota da prova 1:");
            double nota1 = scanner.nextDouble();

            System.out.println("Digite a nota da prova 2:");
            double nota2 = scanner.nextDouble();

            System.out.println("Digite a nota da prova 3:");
            double nota3 = scanner.nextDouble();
            scanner.nextLine();

            double media = (nota1 + nota2 + nota3) / 3;

            System.out.printf("Aluno: %s - Média: %.2f\n", nome, media);
        }

        scanner.close();
    }
}
