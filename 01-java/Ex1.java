import java.util.Scanner;

/* 1 - Escrever um algoritmo que lê a hora de início e hora de término de um jogo, 
ambas subdivididas em dois valores distintos: horas e minutos. Calcular e escrever a duração do jogo, também em 
horas e minutos, considerando que o tempo máximo de duração de um jogo é de 24 horas e que o jogo pode iniciar 
em um dia e terminar no dia seguinte.*/



public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite no formato horas a hora de inicio do jogo: "); //entrada da hora
        int horaInicio = scanner.nextInt();
        System.out.println("Digite no formato de minutos os minutos de início do jogo: "); //entrada dos minutos
        int minutoInicio = scanner.nextInt();

        // Entrada do horario de fim de jogo
        System.out.println("Digite a hora que o jogo terminou do jogo:"); 
        int horaTermino = scanner.nextInt();
        System.out.println("Digite os minutos que o jogo terminou: ");
        int minutoTermino = scanner.nextInt();

        // converte p/minutos
        int inicioMinutos = horaInicio * 60 + minutoInicio;
        int terminoMinutos = horaTermino * 60 + minutoTermino;

        // calcula a duracao total em min
        int duracaoEmMinutos;
        if (terminoMinutos >= inicioMinutos) {
            duracaoEmMinutos = terminoMinutos - inicioMinutos;
        } else {
            duracaoEmMinutos = 1440 - inicioMinutos + terminoMinutos; // 1140 = 24 horas.
        }

        // Calcula min para horas
        int duracaoHoras = duracaoEmMinutos / 60;
        int duracaoMinutos = duracaoEmMinutos % 60;

        System.out.println("A duração do jogo foi de " + duracaoHoras + " horas e " + duracaoMinutos + " minutos.");

        scanner.close();
    }
}
