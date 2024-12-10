package Jogo.Model.Personagens;

public class TreinadorAD extends Personagem {
    private Devmon devMon;

    public TreinadorAD(String nome, String Genero, Devmon devMon) {
        super(nome, Genero);
        this.devMon = devMon;
    }

    public Devmon getDevMon() {
        return devMon;
    }
}
