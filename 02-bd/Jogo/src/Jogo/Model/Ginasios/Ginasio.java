package Jogo.Model.Ginasios;

import Jogo.Model.Batalhas.Batalha;
import Jogo.Model.Itens.Item;
import Jogo.Model.Personagens.Jogador;
import Jogo.Model.Personagens.TreinadorAD;

import java.util.Scanner;

public class Ginasio {
    private String nome;
    private TipoGinasio tipo;
    private TreinadorAD lider;

    Scanner sc = new Scanner(System.in);

    public Ginasio(String nome, TreinadorAD treinador) {
        this.nome = nome;

        this.lider = treinador;
    }


    public String getNome() {
        return nome;
    }

    public TipoGinasio getTipo() {
        return tipo;
    }

    public void desafiar(Jogador jogador) {
        this.tipo = TipoGinasio.getTipoAleatorio();
        System.out.println("[Bem vindo ao Ginásio de DevmonCity]");
        System.out.println("--------------------------------------");
        System.out.println("Tipo da Arena selecionada: " + tipo);
        System.out.println("Descrião: " + tipo.getDescricao());
        System.out.println();

        System.out.println("Os status atuais do seu pokemon:");
        jogador.getDevmonEscolhido().mostrarInformacoes();
        System.out.println("Ao encontrar o lider do ginasio, ele oferece uma poção de cura\n" +
                "Deseja utilizar? S ou N: ");
        String resposta = sc.nextLine();
        if(resposta.equals("S")) {
            Item PocCura = new Item("Poção", 1,80);
            jogador.usarItem(PocCura);
            System.out.println("Status Vida: "+ jogador.getDevmonEscolhido().getVida());
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("A batalha vai começar!");
        Batalha batalha = new Batalha(jogador, lider);
        batalha.run();

    }
}

