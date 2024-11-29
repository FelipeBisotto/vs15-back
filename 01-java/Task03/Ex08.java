// Tema 08 - Previsao de chegada dos bombeiros

public class Ex08 {
    private double horarioLigacao;
    private double distanciaIncendio;
    private double velocidadeMedia;

    public Ex08(double horarioLigacao, double distanciaIncendio, double velocidadeMedia) {
        this.horarioLigacao = horarioLigacao;
        this.distanciaIncendio = distanciaIncendio;
        this.velocidadeMedia = velocidadeMedia;
    }
    // tempo = distancia/velocidadeM
    public String previsaoDeChegada() {

        double tempoHoras = distanciaIncendio / velocidadeMedia;
        double chegada = horarioLigacao + tempoHoras;
        int horas = (int) chegada;
        
        int minutos = (int) ((chegada - horas) * 60);
        if (minutos < 10) {
            return horas + ":0" + minutos;
        } else {
            return horas + ":" + minutos;
        }
    }
    

    public void exibirInfo() {
        System.out.println("Horario da ligacao: " + horarioLigacao + " horas");
        System.out.println("Distancia do incendio: " + distanciaIncendio + " km");
        System.out.println("Velocidade media: " + velocidadeMedia + " km/h");
        System.out.println("Previsao de chegada: " + previsaoDeChegada() + " horas");
    }

    public static void main(String[] args) {
        System.out.println("\n--------- Teste  ----------");
        Ex08 previsao = new Ex08(10.0, 10, 60); 
        previsao.exibirInfo();
    }
}