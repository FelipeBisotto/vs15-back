package Jogo.Model.Abstracoes;

public abstract class Ser {

    private String nome;
    private int vida;
    private int vidaMaxima;

    public Ser(String nome, int vida, int vidaMaxima) {
        this.nome = nome;
        this.vida = vida;
        this.vidaMaxima = vidaMaxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(int vidaMaxima) {
         this.vidaMaxima = vidaMaxima;
    }

    public abstract void mostrarInformacoes();

    public void curar(int cura){
        vida += cura;
                if(vida > vidaMaxima) vida = vidaMaxima;
    }

    public void receberDano(int dano){
        vida -= dano;
        if(vida < 0) vida = 0;

    }

    public boolean estaVivo(){

       return vida > 0;

    }

}
