import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex8 {

    private static List<String[]> produtos = new ArrayList<>();

    public static void cadastraProduto(String nome, String descricao, double preco, int estoque) {
        String[] produto = { nome, descricao, String.valueOf(preco), String.valueOf(estoque) };
        produtos.add(produto);
        System.out.println("Produto cadastrado");
    }

    public static String[] buscarProduto(String nome) {
        for (String[] produto : produtos) {
            if (produto[0].equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }

    public static void aplicaPromocao(String nomeProduto, double porcentagem) {
        String[] produto = buscarProduto(nomeProduto);
        if (produto != null) {
            double precoAtual = Double.parseDouble(produto[2]);
            if (porcentagem > 0 && porcentagem <= 100) {
                double novoPreco = precoAtual - (precoAtual * porcentagem / 100);
                produto[2] = String.valueOf(novoPreco);
                System.out.println("Desconto aplicado");
            } else {
                System.out.println("Porcentagem inválida");
            }
        } else {
            System.out.println("Produto inexistente");
        }
    }

    public static void exibeInformacoes(String nomeProduto) {
        String[] produto = buscarProduto(nomeProduto);
        if (produto != null) {
            System.out.printf("Produto: %s\nDescrição: %s\nPreço: R$%.2f\nEstoque: %s\n",
                    produto[0], produto[1], Double.parseDouble(produto[2]), produto[3]);
        } else {
            System.out.println("Não foi possível encontrar o produto");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n-- [E-commerce] --");
            System.out.println("Escolha uma opção:");
            System.out.println("-----------------------------");
            System.out.println("(1) Cadastrar produto");
            System.out.println("(2) Aplicar promoção");
            System.out.println("(3) Informações de um produto");
            System.out.println("(4) Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Informação do produto: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Preço do produto: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Estoque disponível do produto: ");
                    int estoque = scanner.nextInt();
                    cadastraProduto(nome, descricao, preco, estoque);
                    break;

                case 2:
                    System.out.print("Nome do produto p/ aplicação de desconto: ");
                    String nomeDesconto = scanner.nextLine();
                    System.out.print("Porcentagem de desconto: ");
                    double desconto = scanner.nextDouble();
                    aplicaPromocao(nomeDesconto, desconto);
                    break;

                case 3:
                    System.out.print("Nome do produto p/ mostrar detalhes: ");
                    String nomeInformacoes = scanner.nextLine();
                    exibeInformacoes(nomeInformacoes);
                    break;

                case 4:
                    System.out.println("Sistema encerrando");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Escolha um número válido.");
            }
        }
    }
}
