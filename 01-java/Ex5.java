import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nº total de eleitores:");
        int totalEleitores = scanner.nextInt();

        System.out.println("Digite nº de votos brancos:");
        int votosBrancos = scanner.nextInt();

        System.out.println("Digite o nº de votos nulos:");
        int votosNulos = scanner.nextInt();

        System.out.println("Digite o nº de votos validos:");
        int votosValidos = scanner.nextInt();

        // Calcula a porcentagem
        double porcentagemBrancos = (votosBrancos * 100.0) / totalEleitores;
        double porcentagemNulos = (votosNulos * 100.0) / totalEleitores;
        double porcentagemValidos = (votosValidos * 100.0) / totalEleitores;

        System.out.println("\nResultado:");
        System.out.printf("Percentual de votos brancos: %.2f%%\n", porcentagemBrancos);
        System.out.printf("Percentual de votos nulos: %.2f%%\n", porcentagemNulos);
        System.out.printf("Percentual de votos válidos: %.2f%%\n", porcentagemValidos);

    }
    
}
