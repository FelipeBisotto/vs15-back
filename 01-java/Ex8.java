import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex8 {

    public static class Produto {
        private String nome;
        private String descricao;
        private double preco;
        private int estoque;

        public Produto(String nome, String descricao, double preco, int estoque) {
            this.nome = nome;
            this.descricao = descricao;
            this.preco = preco;
            this.estoque = estoque;
        }

        public String getNome() {
            return nome;
        }

        public String getDescricao() {
            return descricao;
        }

        public double getPreco() {
            return preco;
        }

        public int getEstoque() {
            return estoque;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public void incluirDesconto(double porcentagem) {
            if (porcentagem > 0 && porcentagem <= 100) {
                this.preco -= this.preco * (porcentagem / 100);
            } else {
                System.out.println("Porcentagem invalida");
            }
        }

        @Override
        public String toString() {
            return "Produto{" +
                    "nome='" + nome + '\'' +
                    ", descricao='" + descricao + '\'' +
                    ", preco=" + String.format("%.2f", preco) +
                    ", estoque=" + estoque +
                    '}';
        }
    }

    private List<Produto> produtos;

    public Ex8() {
        this.produtos = new ArrayList<>();
    }

    public void cadastraProduto(String nome, String descricao, double preco, int estoque) {
        Produto produto = new Produto(nome, descricao, preco, estoque);
        produtos.add(produto);
        System.out.println("Produto cadastrado");
    }

    public Produto buscarProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }

    public void aplicaPromocao(String nomeProduto, double porcentagem) {
        Produto produto = buscarProduto(nomeProduto);
        if (produto != null) {
            produto.incluirDesconto(porcentagem);
            System.out.println("Desconto aplicado");
        } else {
            System.out.println("Produto inexistente");
        }
    }

    public void exibeInformacoes(String nomeProduto) {
        Produto produto = buscarProduto(nomeProduto);
        if (produto != null) {
            System.out.println(produto);
        } else {
            System.out.println("Nao foi possivel encontrar o produto");
        }
    }

    // Método principal
    public static void main(String[] args) {
        Ex8 loja = new Ex8();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n-- [E-commerce] --");
            System.out.println("Escolha uma opção:");
            System.out.println("-----------------------------");
            System.out.println("(1) Cadastrar produto");
            System.out.println("(2) Aplicar promoção");
            System.out.println("(3) Informacoes de um produto");
            System.out.println("(4) Sair");
            
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Informacao do produto: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Preco do produto: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Estoque disponivel do produto: ");
                    int estoque = scanner.nextInt();
                    loja.cadastraProduto(nome, descricao, preco, estoque);
                    break;

                case 2:
                    System.out.print("Nome do produto p/ aplicacao de desconto: ");
                    String nomeDesconto = scanner.nextLine();
                    System.out.print("Porcentagem de desconto: ");
                    double desconto = scanner.nextDouble();
                    loja.aplicaPromocao(nomeDesconto, desconto);
                    break;

                case 3:
                    System.out.print("Nome do produto p/ mostrar detalhes: ");
                    String nomeInformacoes = scanner.nextLine();
                    loja.exibeInformacoes(nomeInformacoes);
                    break;

                case 4:
                    System.out.println("Sistema encerrando");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Escolha um numero valido.");
            }
        }
    }
}
