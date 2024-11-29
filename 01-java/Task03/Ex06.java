// Tema 06 - Pardal e Multas

public class Ex06 {
    private double velocidadePermitida;
    private double velocidadeVeiculo;
    private double multa;

    public Ex06(double velocidadePermitida, double velocidadeVeiculo, double multa) {
        this.velocidadePermitida = velocidadePermitida;
        this.velocidadeVeiculo = velocidadeVeiculo;
        this.multa = multa;
    }

    public double verificarMulta() {
        if (velocidadeVeiculo > velocidadePermitida) {
            return multa * (velocidadeVeiculo - velocidadePermitida);
        } else {
            return 0;
        }
    }

    public void exibirInfo() {
        System.out.println("Velocidade Permitida: " + velocidadePermitida + " km/h");
        System.out.println("Velocidade do Veiculo: " + velocidadeVeiculo + " km/h");

        if (velocidadeVeiculo > velocidadePermitida) {
            System.out.println("Você foi multado! Valor da multa: R$ " + verificarMulta());
        } else {
            System.out.println("Você está dentro do limite de velocidade. Sem multa!");
        }
    }

    public static void main(String[] args) {
        System.out.println("\n--------- Teste 1 ----------");
        Ex06 carro1 = new Ex06(60, 80, 5.0);
        carro1.exibirInfo();

        System.out.println("\n--------- Teste 2 ----------");
        Ex06 carro2 = new Ex06(100, 90, 10.0);
        carro2.exibirInfo();
    }
}
