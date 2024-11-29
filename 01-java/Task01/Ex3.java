public class Ex3 {

/* 3 - Você foi contratado para criar um programa em Java que converta uma temperatura fornecida 
em graus Celsius para graus Fahrenheit. Utilize as fórmulas de conversão apropriadas para realizar 
essa tarefa. O programa deve declarar uma constante (celsiusTemperature) com o valor da temperatura em graus 
Celsius e, em seguida, calcular e exibir a correspondente temperatura em graus Fahrenheit. */
    public static void main(String[] args) {

        double celsiusTemperature = 25.0; 
        double fTemp = (celsiusTemperature * 9/5) + 32; //formula celsius p/ fahr
        
        System.out.println();
        System.out.println("A temperatura em Celsius: " + celsiusTemperature + " graus Celsius");
        System.out.println("A temperatura correspondente em Fahrenheit: " + fTemp + " graus Fahrenheit ");
    }
}
