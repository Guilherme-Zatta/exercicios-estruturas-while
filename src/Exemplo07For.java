public class Exemplo07For {
    public static void main(String[] args) {
        //implrimir os números pares de 100 até 0 divisiveis por 2
        // para (inicializa contador; 
        //      condição; 
        //      incremento ou decremento contador) 
        //      executa o que esta aqui no bloco.
        for (int contador = 100; contador >=0; contador = contador - 1) {
            if (contador % 2 == 0){ //Condição para carregar apenas números divisiveis por 2
            System.out.println(contador);
            }
        }
    }
}