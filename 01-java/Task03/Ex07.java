// Tema 07 - Corrida F1

public class Ex07 {
    private String piloto1;
    private String piloto2;
    private double tempoMedio1;
    private double tempoMedio2;
    private int voltas;

    public Ex07(String piloto1, String piloto2, double tempoMedio1, double tempoMedio2, int voltas) {
        this.piloto1 = piloto1;
        this.piloto2 = piloto2;
        this.tempoMedio1 = tempoMedio1;
        this.tempoMedio2 = tempoMedio2;
        this.voltas = voltas;
    }

    public double tempoTotal1() {
        return tempoMedio1 * voltas;
    }

    public double tempoTotal2() {
        return tempoMedio2 * voltas;
    }

    public String preverVencedor() {
        if (tempoTotal1() < tempoTotal2()) {
            return piloto1;
        } else {
            return piloto2;
        }
    }

    public void exibirInfo() {
        System.out.println("Piloto 1: " + this.piloto1);
        System.out.println("Piloto 2: " + this.piloto2);
        System.out.println("Tempo total do " + this.piloto1 + ": " + tempoTotal1() + " segundos");
        System.out.println("Tempo total do " + this.piloto2 + ": " + tempoTotal2() + " segundos");
        System.out.println("Vencedor: " + preverVencedor());
    }

    public static void main(String[] args) {
        System.out.println("\n--------- Teste  ----------");
        Ex07 corrida = new Ex07("Lewis.H", "Max.V", 78.5, 79.2, 50);
        corrida.exibirInfo();
    }
}
