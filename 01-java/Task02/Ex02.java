//Tema 02 - Leilao de arte

public class Ex02 {

    private String obra;
    private int lanceMinimo;
    private int lanceFinal;
    

    public Ex02(String obra, int lanceMinimo, int lanceFinal){
        this.obra = obra;
        this.lanceMinimo = lanceMinimo;
        this.lanceFinal = lanceFinal;

    }

    public int calcularLucro(){
        return lanceFinal - lanceMinimo;
    }

    public void exibirInfo(){
        System.out.println("Nome da Obra:" + obra);
        System.out.println("Lance minimo: " + lanceMinimo);
        System.out.println("Lance Final: " + lanceFinal);
        System.out.println("Lucro da obra: " + calcularLucro());
        }
    public static void main(String args[]){
        System.out.println("\n--------- Teste ----------");
        Ex02 leilao = new Ex02("Monalisa", 100000000, 1000000000);
        leilao.exibirInfo();
    
        }
    
    
}
