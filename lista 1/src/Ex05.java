// Faça um programa que solicite ao usuário um número de 1 a 7, e imprima na
// tela o dia da semana correspondente. Suponha que Segunda corresponde a 1 ,
// Terça corresponde a 2, e assim por diante. Utilizando Array.

public class Ex05 {
    public static void main(String[] args) {
        String[] dias = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
        
        int numero = 1;
        
        if (numero >= 1 && numero <= 7) {
            System.out.println("O dia da semana correspondente é: " + dias[numero - 1]);
        } else {
            System.out.println("Número inválido. Por favor, insira um número de 1 a 7.");
        }
    }
}
