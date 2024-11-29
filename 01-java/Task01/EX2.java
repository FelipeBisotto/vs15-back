import java.util.Scanner;

/* 2 - Crie um programa em Java que valide se um número fornecido por um usuário é par ou ímpar. 
O programa deve declarar uma variável número, atribuir um valor a ela e, em seguida, determinar 
se o número é par ou ímpar sem usar instruções if ou else. Exiba o resultado */


public class EX2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        String[] resultados = {"O número é par.", "O número é ímpar."}; // Cria um array com os resultados possiveis

        String resultado = resultados[numero % 2]; // verifica se é par ou impar usando resto da divisao

        System.out.println(resultado);

    }
}
