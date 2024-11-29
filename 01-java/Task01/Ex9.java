import java.util.Scanner;

public class Ex9 {

    private static final String[] portugues = { "Cachorro", "Cidade", "Feliz", "Triste" };
    private static final String[] ingles = { "Dog", "City", "Happy", "Sad" };

    private static int encontrarIndice(String palavra, String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (palavra.equalsIgnoreCase(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public static String traduzirParaIngles(String palavra) {
        int indice = encontrarIndice(palavra, portugues);
        if (indice != -1) {
            return ingles[indice];
        }
        return "Esse idioma nao e valido.";
    }

    public static String traduzirParaPortugues(String palavra) {
        int indice = encontrarIndice(palavra, ingles);
        if (indice != -1) {
            return portugues[indice];
        }
        return "Esse idioma nao e valido.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n[ SISTEMA TRADUTOR ]");
            System.out.println("Escolha uma opcao: ");
            System.out.println("-----------------------------------------");
            System.out.println("(1) Traduzir do Português para o Ingles");
            System.out.println("(2) Traduzir do Ingles para o Portugues");
            System.out.println("(3) Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite uma palavra em Portugues: ");
                    String palavraPortugues = scanner.nextLine();
                    System.out.println("Tradução: " + traduzirParaIngles(palavraPortugues));
                    break;

                case 2:
                    System.out.print("Digite uma palavra em Ingles: ");
                    String palavraIngles = scanner.nextLine();
                    System.out.println("Tradução: " + traduzirParaPortugues(palavraIngles));
                    break;

                case 3:
                    System.out.println("Saindo do programa!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção invalida! Tente novamente.");
            }
        }
    }
}
