/*Descrição da Task03

Criar 08 classes com os seguintes requisitos:
- Atributos
- Construtor
- Métodos
- Saída no console*/

// Tema 01 - Times Futebol

public class Ex01{
    //Inserir atributos
    private String nome;
    private int pontosCampeonato;
    private int rankingCampeonato;

    //Criar o construtor
    public Ex01(String nome, int pontosCampeonato, int rankingCampeonato){
        this.nome = nome;
        this.pontosCampeonato = pontosCampeonato;
        this.rankingCampeonato = rankingCampeonato;
    }

    //Criar os metodos
    public void exibirInfo(){
        System.out.println("Nome do time:" + nome);
        System.out.println("Pontos do campeonato: " + pontosCampeonato);
        System.out.println("Ranking do time no campeonato:" + rankingCampeonato);
    }

    //Metodo Main p/teste
    public static void main(String args[]){
        System.out.println("\n--------- Teste ----------");
        Ex01 time = new Ex01("Internacional", 100, 1);
        time.exibirInfo();

    }




}

