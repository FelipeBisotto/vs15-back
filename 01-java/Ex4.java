public class Ex4 {

    public static void main(String[] args) {

        int anoInicial = 1500;
        int anoAtual = 2024; 
        int mediaAnos = 28; //

        int anosPassados = anoAtual - anoInicial;

        int numeroGeracoes = anosPassados / mediaAnos;

        System.out.println("De" + anoInicial + " até " + anoAtual + ":");
        System.out.println("Anos totais: " + anosPassados);
        System.out.println("Nº geracoes: " + numeroGeracoes);
    }
}
