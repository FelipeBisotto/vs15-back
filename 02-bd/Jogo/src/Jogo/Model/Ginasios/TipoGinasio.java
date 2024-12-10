package Jogo.Model.Ginasios;

import java.util.Random;

public enum TipoGinasio {
    NORMAL("Um ginasio tradicional, onde o equilibrio e a estrategia sao cruciais.\n Sem vantagens elementares, o foco esta na habilidade dos treinadores."),
    FOGO("Um ginasio infernal, onde as chamas consomem o campo de batalha.\n Apenas os mais resistentes conseguem suportar o calor intenso."),
    AGUA("Um ginasio submerso, onde a agua domina cada movimento.\n A fluidez e a adaptabilidade sao essenciais para triunfar aqui."),
    PLANTA("Um ginasio selvagem, coberto por uma densa floresta.\n A natureza e tanto sua aliada quanto sua adversaria neste ambiente imprevisivel."),
    ELETRICO(
            "Um ginasio eletrizante, repleto de circuitos e relampagos.\n Reflexos rapidos e decisoes imediatas sao a chave para vencer."),
    PEDRA("Um ginasio imponente, construido entre montanhas e rochas.\n A forca bruta e a resiliencia sao testadas ao extremo neste terreno arido.");

    private final String descricao;

    TipoGinasio(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoGinasio getTipoAleatorio() {
        TipoGinasio[] tipos = TipoGinasio.values();
        Random aleatorio = new Random();
        return tipos[aleatorio.nextInt(tipos.length)];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            TipoGinasio tipoAleatorio = TipoGinasio.getTipoAleatorio();
            System.out.println("Tipo gerado: " + tipoAleatorio + " - " + tipoAleatorio.getDescricao());
        }
    }
}
