

public class Ex04 {

    private int numPaginasPorDia;
    private int periodoLeitura;
    private int numTotalPaginas;

    public Ex04(int numPaginasPorDia, int periodoLeitura, int numTotalPaginas) {
        this.numPaginasPorDia = numPaginasPorDia;
        this.periodoLeitura = periodoLeitura;
        this.numTotalPaginas = numTotalPaginas;
    }

    public int calcularMediaPaginas() {
        if (numTotalPaginas % numPaginasPorDia == 0) {
            return numTotalPaginas / numPaginasPorDia;
        } else {
            return (numTotalPaginas / numPaginasPorDia) + 1;
        }
    }
    

    public String calcularObjetivo() {
        int diasNecessarios = calcularMediaPaginas();
        if (diasNecessarios <= periodoLeitura) {
            return "Objetivo concluido. Voce leu no prazo.";
        } else {
            return "Que pena, o objetivo nao foi concluido .";
        }
    }

    public void exibirInfo() {
        System.out.println("Numero total de paginas: " + this.numTotalPaginas);
        System.out.println("Paginas lidas por dia: " + this.numPaginasPorDia);
        System.out.println("Periodo disponivel para ler o lic=vro: " + this.periodoLeitura);
        System.out.println("Dias necessarios para terminar o livro: " + this.calcularMediaPaginas());
        System.out.println(this.calcularObjetivo());
    }

    public static void main(String[] args) {
        System.out.println("\n--------- Teste 1 ----------");
        Ex04 progressoLeitura1 = new Ex04(10, 15, 120); 
        progressoLeitura1.exibirInfo();
    
        System.out.println("\n--------- Teste 2 ----------");
        Ex04 progressoLeitura2 = new Ex04(5, 10, 120); 
        progressoLeitura2.exibirInfo();
    }
    
}
