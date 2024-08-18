// Crie uma classe e na função main() implemente um programa que lê um
//número inteiro do teclado e imprime todos os números primos menores que ele
//(divisíveis por 1 ou por ele mesmo).

public class Ex03 {
    public static void main(String[] args) {
        int numero = 28;

        System.out.println("Números primos menores que " + numero + ":");

        for (int i = 2; i < numero; i++) {
            boolean ePrimo = true;
            
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    ePrimo = false;
                    break;
                }
            }
            
            if (ePrimo) {
                System.out.print(i + " ");
            }
        }
    }
}

