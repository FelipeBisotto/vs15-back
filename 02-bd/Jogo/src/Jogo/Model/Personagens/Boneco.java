package Jogo.Model.Personagens;

import static Jogo.Controller.ConsoleColors.*;

public class Boneco {
    public void animarBoneco(int alturaTerminal, int larguraTerminal, int passos) {
        int posicaoVertical = 0;
        int posicaoHorizontal = 0;
        int direcaoVertical = 1;
        int direcaoHorizontal = 1;

        for (int passo = 0; passo < passos; passo++) {

            System.out.print("\033[H\033[2J");
            System.out.flush();


            for (int i = 0; i < alturaTerminal; i++) {
                if (i == posicaoVertical) {
                    for (int j = 0; j < larguraTerminal; j++) {
                        if (j == posicaoHorizontal) {
                            System.out.print(BLUE + " O ");
                        } else {
                            System.out.print("   ");
                        }
                    }
                    System.out.println();
                    for (int j = 0; j < larguraTerminal; j++) {
                        if (j == posicaoHorizontal) {
                            System.out.print(BLUE +"/|\\");
                        } else {
                            System.out.print("   ");
                        }
                    }
                    System.out.println();
                    for (int j = 0; j < larguraTerminal; j++) {
                        if (j == posicaoHorizontal) {
                            System.out.print( BLUE +"/ \\" + RESET);
                        } else {
                            System.out.print("   ");
                        }
                    }
                    System.out.println();
                    i += 2;
                } else {
                    System.out.println();
                }
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (posicaoVertical < alturaTerminal - 3) {
                posicaoVertical += direcaoVertical;
            } else {
                posicaoHorizontal += direcaoHorizontal;
                if (posicaoHorizontal >= larguraTerminal - 3 || posicaoHorizontal <= 0) {
                    direcaoHorizontal *= -1;
                }
            }
        }
    }
}
