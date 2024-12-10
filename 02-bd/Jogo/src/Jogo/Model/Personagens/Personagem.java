package Jogo.Model.Personagens;

public class Personagem {
    private String nome;
    private String Genero;

    public Personagem(String nome, String Genero) {
        this.nome = nome;
        this.Genero = Genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }
}
