public class Z_Execício01 {
    public static void main(String[] args) {
        //Utilizando (While), construir um programa que apresente a soma 
        //dos cem primeiros números naturais (1 + 2 + 3 +...+ 98 + 99 + 100).
        int contador = 1;

        while (contador <= 100) {
            System.out.printf("%d \n", (contador));
            contador = contador + 1;
        }
    }
}
