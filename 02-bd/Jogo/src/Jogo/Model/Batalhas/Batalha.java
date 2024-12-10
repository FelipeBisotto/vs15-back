package Jogo.Model.Batalhas;

import Jogo.Controller.ConsoleColors;
import Jogo.Model.Personagens.Jogador;
import Jogo.Model.Personagens.TreinadorAD;

import java.util.Random;
import java.util.Scanner;

import static Jogo.Controller.ConsoleColors.*;

public class Batalha {
    private Jogador jogador;
    private TreinadorAD treinadorAD;
    Scanner sc = new Scanner(System.in);

    public TreinadorAD getTreinador() {
        return treinadorAD;
    }

    public void setTreinador(TreinadorAD treinador) {
        this.treinadorAD = treinador;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public Batalha(Jogador jogador, TreinadorAD treinador) {
        this.jogador = jogador;
        this.treinadorAD = treinador;
    }

    public void setLider(TreinadorAD lider) {
        this.treinadorAD = lider;
    }

    public void run() {
        String devmonJogador = jogador.getDevmonEscolhido().getNome();
        String devmonTreinador = treinadorAD.getDevMon().getNome();

        System.out.println(YELLOW_BOLD_BRIGHT + "COMEÇANDO A BATALHA DEVMON" + RESET);
        System.out.println(RED + "Devmon: " + devmonJogador + RESET);
        System.out.println(GREEN + " VS " + RESET);
        System.out.println(RED + "Devmon: " + devmonTreinador + RESET);

        while (jogador.getDevmonEscolhido().estaVivo() && treinadorAD.getDevMon().estaVivo()) {
            int danoTreinador = treinadorAD.getDevMon().getAtk();
            int danoJogador = jogador.getDevmonEscolhido().getAtk();


            Random rand = new Random();
            int randomNum = rand.nextInt(2);

            if (randomNum == 0) {
                System.out.println(YELLOW_BOLD_BRIGHT + "O DevMon " + devmonJogador + " está atacando: " + RESET);
                treinadorAD.getDevMon().receberDano(danoJogador);
                System.out.println(RED_BOLD + "IMPACTO NO DEVMON TREINADOR: " + RESET + danoJogador);
                System.out.println("--------------------------------------");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            } else {
                System.out.println(YELLOW_BOLD_BRIGHT + "O DevMon " + devmonTreinador + " está atacando:" + RESET);
                jogador.getDevmonEscolhido().receberDano(danoTreinador);
                System.out.println(RED_BOLD + "IMPACTO NO DEVMON JOGADOR: " + RESET + danoTreinador);
                System.out.println("--------------------------------------");
            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            if (!jogador.getDevmonEscolhido().estaVivo()) {
                System.out.println(GREEN_BOLD + "Devmon: " + devmonTreinador + " WINS!" + RESET);
                System.out.println("--------------------------------------");
                System.out.println(YELLOW_BOLD_BRIGHT + "Aperte qualquer tecla pra ir para a proxima batalha? " + RESET);
                String escolha = sc.nextLine();
                if (escolha != null) {
                    break;
                }
            }

            if (!treinadorAD.getDevMon().estaVivo()) {
                System.out.println(GREEN + "Devmon " + devmonJogador + " WINS!" + RESET);
                System.out.println( GREEN + "Você obteve 30xp." + RESET);
                System.out.println("--------------------------------------");
                System.out.println(YELLOW_BOLD_BRIGHT + "Aperte qualquer tecla pra ir para a proxima batalha: " + RESET);
                String escolha = sc.nextLine();
                if (escolha != null) {
                    break;
                }
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}