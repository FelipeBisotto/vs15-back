package Jogo.Model.Personagens;
import Jogo.Model.Itens.Item;

import java.util.ArrayList;
import java.util.List;

public class Jogador extends Personagem {
    private Devmon devmonEscolhido;
    private List<Item> inventario = new ArrayList<Item>();



    public Jogador(String nome, String Genero, Devmon devmonEscolhido) {
        super(nome, Genero);
        this.devmonEscolhido = devmonEscolhido;
    }

    public Devmon getDevmonEscolhido() {
        return devmonEscolhido;
    }

    public void usarItem(Item item) {
        inventario.add(item);

        if(devmonEscolhido.estaVivo()) {

        item.usar(this.devmonEscolhido);

        }else{

            item.revive(this.devmonEscolhido);

        }

        inventario.remove(item);
    }

    public void mostrarStatus() {
        System.out.println("\nJogador: " + super.getNome());
        devmonEscolhido.mostrarInformacoes();

    }
}
