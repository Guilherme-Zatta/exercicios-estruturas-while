public class Z_Exercício02 {
    public static void main(String[] args) {
        //2. Utilizando (DoWhile), elaborar um programa que apresente o 
        //somatório dos valores pares existentes na faixa de 1 até 500.
        int contador = 1;
        int soma = 0;
 
        do {
            if (contador % 2 == 0) {
                soma = soma + contador;
                System.out.printf("valor soma:%d\n ", soma);
            }
            contador = contador + 1;
        } while (contador <= 500);
    }
}
