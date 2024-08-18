// Escreva um programa que tenha duas palavras como entrada, e a saída
// imprima as palavras em ordem alfabética (utilize o método compareTo da
// classe String),. Informe também, qual das palavras tem o maior número de
// caracteres.

public class Ex011 {
    public static void main(String[] args) {
        String palavra1 = "pera"; 
        String palavra2 = "abacaxi"; 

        
        if (palavra1.compareToIgnoreCase(palavra2) < 0) {
            System.out.println("Ordem alfabética: " + palavra1 + ", " + palavra2);
        } else {
            System.out.println("Ordem alfabética: " + palavra2 + ", " + palavra1);
        }

        if (palavra1.length() > palavra2.length()) {
            System.out.println("A palavra com mais caracteres é: " + palavra1);
        } else if (palavra2.length() > palavra1.length()) {
            System.out.println("A palavra com mais caracteres é: " + palavra2);
        } else {
            System.out.println("As palavras têm o mesmo número de caracteres.");
        }
    }
}
