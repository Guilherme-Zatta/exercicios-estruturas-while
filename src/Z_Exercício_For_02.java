public class Z_Exercício_For_02 {
    public static void main(String[] args) {
        //2. Utilizando FOR, elaborar um programa que apresente o somatório dos valores pares existentes na faixa de 1 até 500.
        int resultado = 0;
        
        for (int somatorio = 0; somatorio <=500; somatorio++) {
            if (somatorio % 2 == 0) {
                resultado = resultado + somatorio;
                System.out.println(resultado);
            }
        }


    }
}
