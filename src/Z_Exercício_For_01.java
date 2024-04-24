public class Z_Exercício_For_01 {
    public static void main(String[] args) {
        //1. Utilizando (For), construir um programa que apresente a soma dos cem primeiros números naturais (1 + 2 + 3 +...+ 98 + 99 + 100).
        int resultado = 0;

        for (int contador = 1; contador <= 100; contador ++) {
            resultado = resultado + contador;
            System.out.println(resultado);
        }
    }
}
