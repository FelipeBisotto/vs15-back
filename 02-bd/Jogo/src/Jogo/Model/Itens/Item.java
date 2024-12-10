package Jogo.Model.Itens;

import Jogo.Model.Personagens.Devmon;

public class Item {
    private String nome;
    private int quantidade;
    private int efeitoCura;

    public Item(String nome, int quantidade, int efeitoCura) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.efeitoCura = efeitoCura;
    }

    public Item(String nome, int quantidade) {
        this(nome, quantidade, 0);
    }

    public void usar(Devmon devmon) {
        if (devmon.estaVivo()) {
            devmon.curar(efeitoCura);
            System.out.println(nome + " usado! Restaurou " + efeitoCura + " pontos de vida.");
        } else {
            System.out.println("Não é possível usar " + nome + " em um Devmon fora de combate.");
        }
    }

    public void revive(Devmon devmon) {
        if (!devmon.estaVivo()) {
            devmon.curar(devmon.getVidaMaxima());
            System.out.println(nome + " usado! Restaurou " + devmon.getVidaMaxima() + " pontos de vida.");
        } else {
            System.out.println("Não é possível usar " + nome + " em um Devmon fora de combate.");
        }
    }

}


