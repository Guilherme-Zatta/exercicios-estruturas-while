public class Z_Exercício06 {
    public static void main(String[] args) {
        //6. Elaborar um programa que apresente os valores de conversão de graus Celsius em graus Fahrenheit, de dez em dez graus, 
        //iniciando a contagem em dez graus Celsius e finalizando em cem graus Celsius. O programa deve apresentar os valores das duas temperaturas. 
        //Para converter grau Celsius para Fahrenheit, basta multiplicar a temperatura em graus Celsius por 1,8 e somar 32.
        int celsius = 10;
        int limite = 100;
        int incremento = 10;

        System.out.println("\nTemperatura de 10°C até 100°C com corversão em Fahrenheit:");
        System.out.println("\nCelsius\tFahrenheit");

        int somatoria = 32;
        while (celsius <= limite) {
            double fahrenheit = (celsius * 1.8) + somatoria;
            System.out.printf("%d\t%.2f%n", celsius, fahrenheit);
            celsius += incremento;
        }
    }
}