import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1 = 0, n2 = 0, base = 0, altura = 0, raio = 0;

        while (true) {
            System.out.println("\n-- [Calculadora] --");
            System.out.println("Escolha uma operacao:");
            System.out.println("---------------------------------");
            System.out.println("(1) Adicao");
            System.out.println("(2) Subtracao");
            System.out.println("(3) Multiplicacao");
            System.out.println("(4) Divisao");
            System.out.println("(5) Area circulo");
            System.out.println("(6) Area retangulo");
            System.out.println("(7) Area triangulo");
            System.out.println("(8) Diametro circulo");
            System.out.println("(9) Sair");
            System.out.println("---------------------------------");
            System.out.print("Digite sua escolha: ");

            try {
                int escolha = scanner.nextInt();

                switch (escolha) {
                    case 1:
                        System.out.print("Digite o primeiro numero: ");
                        n1 = scanner.nextDouble();
                        System.out.print("Digite o segundo numero: ");
                        n2 = scanner.nextDouble();
                        System.out.println("Resultado: " + (n1 + n2));
                        break;

                    case 2:
                        System.out.print("Digite o primeiro numero: ");
                        n1 = scanner.nextDouble();
                        System.out.print("Digite o segundo numero: ");
                        n2 = scanner.nextDouble();
                        System.out.println("Resultado: " + (n1 - n2));
                        break;

                    case 3:
                        System.out.print("Digite o primeiro numero: ");
                        n1 = scanner.nextDouble();
                        System.out.print("Digite o segundo numero: ");
                        n2 = scanner.nextDouble();
                        System.out.println("Resultado: " + (n1 * n2));
                        break;

                    case 4:
                        System.out.print("Digite o primeiro numero: ");
                        n1 = scanner.nextDouble();
                        System.out.print("Digite o segundo numero: ");
                        n2 = scanner.nextDouble();
                        if (n2 != 0) {
                            System.out.println("Resultado: " + (n1 / n2));
                        } else {
                            System.out.println("Erro: divisao por zero nao e permitida!");
                        }
                        break;

                    case 5:
                        System.out.print("Digite o raio do circulo: ");
                        raio = scanner.nextDouble();
                        System.out.println("Area do circulo: " + (Math.PI * raio * raio));
                        break;

                    case 6:
                        System.out.print("Digite a base do retangulo: ");
                        base = scanner.nextDouble();
                        System.out.print("Digite a altura do retangulo: ");
                        altura = scanner.nextDouble();
                        System.out.println("Area do retangulo: " + (base * altura));
                        break;

                    case 7:
                        System.out.print("Digite a base do triangulo: ");
                        base = scanner.nextDouble();
                        System.out.print("Digite a altura do triangulo: ");
                        altura = scanner.nextDouble();
                        System.out.println("Area do triangulo: " + (base * altura / 2));
                        break;

                    case 8:
                        System.out.print("Digite o raio do circulo: ");
                        raio = scanner.nextDouble();
                        System.out.println("Diametro do circulo: " + (2 * raio));
                        break;

                    case 9:
                        System.out.println("Saindo do programa!");
                        return;

                    default:
                        System.out.println("Opcao invalida!");
                }
            } catch (Exception e) {
                System.out.println("Erro! Insira um numero.");
                scanner.nextLine();
            }
        }
    }
}
