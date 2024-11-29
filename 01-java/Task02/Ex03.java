//Tema 03 - Progressao academia

public class Ex03 {

    private int diasFrequentados;
    private int semanasMes;
    private int cargaIncial;
    private int cargaFinal;

    public Ex03(int diasFrequentados, int semanasMes, int cargaIncial, int cargaFinal){
        this.diasFrequentados = diasFrequentados;
        this.semanasMes = semanasMes;
        this.cargaIncial = cargaIncial;
        this.cargaFinal = cargaFinal;
    }

        public int calcularFrequencia(){
            return diasFrequentados * semanasMes;
        }

        public double calcularProgresso(){
            return ((cargaFinal - cargaIncial)/cargaIncial)*100;
        }

        public void exibirInfo() {
            System.out.println("Insira a media de dias que voce foi na academia na semana:" + this.diasFrequentados);
            System.out.println("Insira quantas semanas voce foi na academia: " + this.semanasMes);
            System.out.println("Quantidade de dias frequentados no mes: " + this.calcularFrequencia());
            System.out.println("Progresso feito em um mes: " + this.calcularProgresso() + "%");
             }
          
        public static void main(String args[]){
           System.out.println("\n--------- Teste ----------");
           Ex03 progresso = new Ex03(5, 4, 20, 40);
           progresso.exibirInfo();;
        }


    
}
