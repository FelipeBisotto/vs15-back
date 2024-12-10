package Jogo.Model.Personagens;

import Jogo.Model.Abstracoes.Ser;

import static Jogo.Controller.ConsoleColors.*;

public class Devmon extends Ser {
    private int atk;
    private int def;
    private String tipo;

    public Devmon(String nome, int vida, int vidaMaxima, int atk, int def, String tipo) {
        super(nome, vida, vidaMaxima);
        this.atk = atk;
        this.def = def;
        this.tipo = tipo;
    }


    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public void mostrarInformacoes(){

        System.out.println(  GREEN_BOLD_BRIGHT + "--- Está é o deu Devmon ---" + RESET);
        System.out.println(GREEN_BOLD_BRIGHT +"Devmon: " + getNome() + RESET);
        System.out.println(GREEN_BOLD_BRIGHT +"Tipo: " + tipo + RESET);
        System.out.println(GREEN_BOLD_BRIGHT +"Vida: " + getVida() + RESET);
        System.out.println(GREEN_BOLD_BRIGHT +"Ataque: " + atk + RESET);
        System.out.println(GREEN_BOLD_BRIGHT +"Defesa: " + def + RESET);
    }

    public void evoluir() {
        this.def += 40;
        this.atk += 30;
        this.setVidaMaxima(this.getVidaMaxima() + 50);
        this.setVida(this.getVidaMaxima());
        this.mostrarInformacoes();
    }
}
