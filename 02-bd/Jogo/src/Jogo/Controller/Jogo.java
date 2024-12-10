package Jogo.Controller;

import Jogo.Model.Batalhas.Batalha;
import Jogo.Model.Itens.Item;
import Jogo.Model.Musica.Reproduzir;
import Jogo.Model.Personagens.Boneco;
import Jogo.Model.Ginasios.Ginasio;
import Jogo.Model.Ginasios.TipoGinasio;
import Jogo.Model.Personagens.Devmon;
import Jogo.Model.Personagens.Jogador;
import Jogo.Model.Personagens.TreinadorAD;

import java.util.List;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

import static Jogo.Controller.ConsoleColors.*;

public class Jogo {

    public void run() {

        //ativar apenas na hora da apresentacao pra ninguem ficar surdo (LEMBRAR DE DIMINUIR O VOLUME)

        Reproduzir player = new Reproduzir();
        player.tocarMusica("/Jogo/Model/Musica/pokemon.wav");

        Scanner sc = new Scanner(System.in);

        System.out.printf( CYAN_BOLD_BRIGHT  +"  _____                __  __               \n" +
                " |  __ \\              |  \\/  |              \n" +
                " | |  | |  ___ __   __| \\  / |  ___   _ __  \n" +
                " | |  | | / _ \\\\ \\ / /| |\\/| | / _ \\ | '_ \\ \n" +
                " | |__| ||  __/ \\ V / | |  | || (_) || | | |\n" +
                " |_____/  \\___|  \\_/  |_|  |_| \\___/ |_| |_|\n" +
                "                                            \n" +
                "                                            \n" + RESET);


        System.out.println(BLACK_BACKGROUND + "=======================================" + RESET);
        System.out.println(CYAN_BOLD + "🌟 Bem-vindo ao Sistema! 🌟" + RESET);
        System.out.println(YELLOW_BOLD_BRIGHT + "Você está preparado para iniciar sua jornada como um jovem treinador DevMon?\n" +
                "Aperte seu cinto, pegue suas DevBalls e embarque nessa jornada espetacular em DevmonCity. " + RESET);
        System.out.println(BLACK_BACKGROUND + "=======================================" + RESET);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(YELLOW_BOLD_BRIGHT + "Digite o seu nome: " + RESET);
        String nome = sc.nextLine();
        System.out.println(YELLOW_BOLD_BRIGHT + "Digite o seu gênero: " + RESET);
        String genero = sc.nextLine().toLowerCase();
        System.out.println(BLACK_BACKGROUND + "=======================================" + RESET);

        if (genero.equals("masculino")) {
            System.out.println(YELLOW_BOLD_BRIGHT + "Olá, jovem treinador " + nome + "!" + RESET);
        } else {
            System.out.println(YELLOW_BOLD_BRIGHT + "Olá, jovem treinadora " + nome + "!" + RESET);
        }
        System.out.println(BLACK_BACKGROUND + "=======================================" + RESET);

        Boneco boneco = new Boneco();

        System.out.println(YELLOW_BOLD_BRIGHT + "Sua jornada se inicia agora" + RESET);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        boneco.animarBoneco(25, 40, 25);

        Devmon javaScripto = new Devmon("JavaScripto", 200, 200, 20, 50, "Fogo");
        Devmon cShapa = new Devmon("CShapa", 200, 200, 30, 40, "Agua");
        Devmon javinha = new Devmon("Javinha", 200, 200, 40, 30, "Grama");

        System.out.println(YELLOW_BOLD_BRIGHT + "Ao iniciar sua jornada você andou até o laboratório do Professor Hash" +
                " E lá recebeu a missão de escolher um Devmon para te acompanhar nessa jornada..." + RESET);



        System.out.println(BLACK_BACKGROUND + "=======================================" + RESET);
        System.out.println(YELLOW_BOLD_BRIGHT + "Escolha seu Devmon inicial: " + RESET);
        System.out.println(RED_BOLD + "1. JavaScripto (Fogo) \uD83D\uDD25" + RESET);
        System.out.println(CYAN_BOLD + "2. CShapa (Água) \uD83D\uDCA7"  + RESET);
        System.out.println(GREEN_BOLD + "3. Javinha (Grama) \uD83C\uDF3F" + RESET);
        int escolha = sc.nextInt();
        System.out.println(BLACK_BACKGROUND + "=======================================" + RESET);

        Devmon escolhido = switch (escolha) {
            case 1 -> javaScripto;
            case 2 -> cShapa;
            case 3 -> javinha;
            default -> javaScripto;
        };

        Jogador novoJogador = new Jogador(nome, genero, escolhido);

        System.out.println("DESEJA VER OS DETALHES \n"
                + "1 - SIM"
                + "\n2 - NÃO");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        String respos = sc.next();
        switch (respos) {
            case "1":
                System.out.println("Detalhes dos Devmon disponíveis:");
                novoJogador.getDevmonEscolhido().mostrarInformacoes();

                System.out.println("Devmons criados no laboratório: ");
                List<Devmon> devmons = List.of(javaScripto, cShapa, javinha);
                for (Devmon devmon : devmons) {
                    System.out.println("Nome: " + devmon.getNome() + ", HP: " + devmon.getVida() + ", Ataque: " + devmon.getAtk() + ", Defesa: " + devmon.getDef() + ", Tipo: " + devmon.getTipo());
                }
                break;

            case "2":
                System.out.println("Você escolheu não visualizar os detalhes.");
                break;

            default:
                System.out.println("Opção inválida.");
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println(BLACK_BACKGROUND + "=======================================" + RESET);
        System.out.println("Deseja iniciar a batalha? [ s ]/[ n ] ");
        String iniciarBatalha = sc.next();
        if (!iniciarBatalha.equalsIgnoreCase("s")) {
            System.out.println("Você escolheu não iniciar a batalha. Fim de Jogo!");
            return;
        }

        System.out.println(BLACK_BACKGROUND + "=======================================" + RESET);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println(YELLOW_BOLD_BRIGHT + "Agora você está na rota DEVMON CITY, e para se fortificar antes de enfrentar o comandante byte acontecerão " +
                "algumas batalhas" + RESET);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        LinkedList<TreinadorAD> listaTreinadores = new LinkedList<>();
        listaTreinadores.add(new TreinadorAD("João", "Masculino",
                new Devmon("PHPenho", 25, 25, 15, 60, "Normal")));
        listaTreinadores.add(new TreinadorAD("Ana", "Feminino",
                new Devmon("Pythinho", 30, 30, 10, 70, "Voador")));
        listaTreinadores.add(new TreinadorAD("Carlos", "Masculino",
                new Devmon("Rustin", 40, 40, 20, 80, "Venenoso")));
        listaTreinadores.add(new TreinadorAD("Lucia", "Feminino",
                new Devmon("Lua", 35, 35, 15, 90, "Mágico")));

        Collections.shuffle(listaTreinadores);
        LinkedHashSet<TreinadorAD> treinadores = new LinkedHashSet<>(listaTreinadores);

        for (TreinadorAD treinador : treinadores) {
            if (!novoJogador.getDevmonEscolhido().estaVivo()) {
                System.out.println(RED + "Seu Devmon foi derrotado. Fim de Jogo!" + RESET);
                return;
            }
            System.out.println( YELLOW_BOLD_BRIGHT + "Você está enfrentando: " + treinador.getNome() + "!" + RESET);
            Batalha batalha = new Batalha(novoJogador, treinador);
            batalha.run();
        }

        System.out.println(YELLOW_BOLD_BRIGHT + "Parabéns! Você venceu todos os treinadores da rota  01 Devmon City." + RESET);
        System.out.println( YELLOW_BOLD_BRIGHT + "Com o xp obtido seu DevMon evoluiu" + RESET);
        novoJogador.getDevmonEscolhido().evoluir();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println( YELLOW_BOLD_BRIGHT + "Parabéns! Você chegou ao Ginásio de Code City." + RESET);
        System.out.println(YELLOW_BOLD_BRIGHT + "Você está prestes a enfrentar o Líder Byte." + RESET);
        System.out.println(YELLOW_BOLD_BRIGHT + "Use suas habilidades e estratégias para vencer o desafio." + RESET);
        System.out.println(YELLOW_BOLD_BRIGHT + "Você deseja desafiar o Líder Byte? [ s ]" + RESET);
        String resp = sc.next();
        System.out.println(BLACK_BACKGROUND + "=======================================" + RESET);
        if (!resp.toLowerCase().equals("s")) {
            System.out.println( RED +"Você desistiu do desafio. Fim de Jogo!" + RESET);
            return;
        }
        sc.nextLine();

        System.out.println( RED+ " ⚓ Comandante Byte:\n" +
                "\"Então, você finalmente chegou. Um treinador patético ousando desafiar o meu ginásio, a minha cidade, o meu poder... Interessante. Tenho observado seus passos desde que pôs os pés em DevmonCity. Cada vitória sua não foi nada além de um teste para provar se você era digno de chegar até mim. Mas me diga: o que faz você pensar que pode derrotar alguém que controla tudo aqui? Eu criei este mundo. Eu controlo estes DevMons. Você não passa de mais uma peça no meu tabuleiro.\"" + RESET);
        System.out.println();
        System.out.println(GREEN +"\uD83E\uDDD1 " + nome+ ": Você pode ter criado este pesadelo, Byte, mas ele termina hoje! Minha jornada não é só sobre vencer batalhas, é sobre libertar os          DevMons da sua tirania. Você os tratou como ferramentas, experimentou com eles e os usou para alimentar seu ego. Mas eu vou provar que o vínculo              entre treinador e DevMon é mais forte do que qualquer força artificial que você possa controlar!" + RESET);
        System.out.println(" ");
        System.out.println(RED +  "⚓ Comandante Byte:\n" +
                "\"Libertar os DevMons? Que pensamento ingênuo! Eles foram criados para servir, para lutar, para evoluir sob o meu comando. Não há lugar para sentimentos ou vínculos neste mundo. O que você chama de 'parceiro', eu vejo como um recurso descartável. E hoje, eu vou provar isso. Prepare-se, forasteiro. Seu DevMon não passará de mais um experimento no meu laboratório.\"" + RESET);
        System.out.println(" ");
        System.out.println(GREEN +"\uD83E\uDDD1 "+ nome + ": Eu não vou deixar isso acontecer. Você já causou sofrimento demais! Esta batalha não é só por mim ou pelo meu DevMon... É pelo futuro de DevmonCity!\"" + RESET);
        System.out.println(" ");
        System.out.println( RED + "⚓ Comandante Byte:\n" +
                "\"Veremos se sua determinação é suficiente para sobreviver ao meu Syntaxaur. Que comece o seu último desafio, justiceiro!\"" + RESET);
        System.out.println("-----------------------------------------------");
        TreinadorAD liderByte = new TreinadorAD("Líder Byte", "Masculino",
                new Devmon("Cobolin", 80, 100, 30, 100, "Elétrico"));
        Ginasio ginasio = new Ginasio("Code City", liderByte);

        ginasio.desafiar(novoJogador);

        if (novoJogador.getDevmonEscolhido().estaVivo()) {
            System.out.println( GREEN + "Você venceu o Ginásio e conquistou sua primeira insígnia!" + RESET);
        } else {
            Item revive = new Item("Revive", 1);
            System.out.println(YELLOW_BOLD_BRIGHT + "Você ainda tem uma chance. Olhando para a sua bolsa você encontra\n" +
                    " uma poção para reanimar o seu Devmon que está quase desacordado.\n" +
                    "Deseja usar? (S)" + RESET);
            String resposta = sc.next();
            System.out.println(resposta);
            if (resposta.equals("S")) {
                novoJogador.usarItem(revive);
                ginasio.desafiar(novoJogador);
            }
            if (novoJogador.getDevmonEscolhido().estaVivo()) {
                System.out.println(GREEN_BOLD + "Você venceu o comandante byte e conquistou sua primeira insígnia!" + RESET);
                System.out.printf("");
                System.out.println( GREEN_BOLD + "Você se tornou o novo lider de Devmon City!" + RESET);
                System.out.println(GREEN_BOLD +  "Em breve sua nova jornada começará!" + RESET);
            } else {
                System.out.println(RED + "Você perdeu para o Líder Byte. Treine mais e tente novamente." + RESET);
            }

        }



    }

}