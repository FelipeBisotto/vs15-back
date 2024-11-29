//Tema 05 - Luta de Ufc 

//Funcionalidades dos metodos:
// media entre vitorias e derrotas
//probabilidade de quem vai vencer


public class Ex05 {

    private String lutador1; 
    private String lutador2;
    private String categoria;
    private int peso;
    private int vitorias1;
    private int vitorias2;
    private int derrotas1;
    private int derrotas2;

    public Ex05(String lutador1, String lutador2, String categoria, int peso, int vitorias1, int vitorias2, int derrotas1, int derrotas2){
        this.lutador1 = lutador1;
        this.lutador2 = lutador2;
        this.categoria = categoria;
        this.peso = peso;
        this.vitorias1 = vitorias1;
        this.vitorias2 = vitorias2;
        this.derrotas1 = derrotas1;
        this.derrotas2 = derrotas2;
    }

    public double totalLutal1(){
        return vitorias1 + derrotas1;
    }

    public double totalLutal2(){
        return vitorias2 + derrotas2;
    }

    public double chanceDeVitoria1(){
        return Math.round((vitorias1 / (double) totalLutal1()) * 100);

    }

    public double chanceDeVitoria2(){
        return Math.round((vitorias2 / (double) totalLutal2()) * 100);
    }

    public void exibirInfo(){
        System.out.println("Lutador 1: " + this.lutador1);
        System.out.println("Lutador 2: " + this.lutador2);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Peso: " +  this.peso + "Kg");
        System.out.println("Lutador 2: " + this.lutador2);
        System.out.println("Chance de ganhar: " + this.lutador1 + ":" + this.chanceDeVitoria1() + "%");
        System.out.println("Chance de ganhar: " + this.lutador2 + ':' + this.chanceDeVitoria2() + "%");
    }

    public static void main(String[] args) {
        System.out.println("\n--------- Teste ----------");
        Ex05 luta = new Ex05("Jon Jones", "Anderson Silva", "Peso Medio", 84, 25, 22, 1, 6); 
        luta.exibirInfo();



    }
}

    
