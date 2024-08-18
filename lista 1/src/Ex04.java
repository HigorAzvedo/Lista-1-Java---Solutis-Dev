// Pretende-se escrever um programa que leia do teclado uma distância
// expressa em milhas, converte-a para quilômetros e apresenta o resultado no
// console. (fórmula de conversão: 1 milha = 1.609 km).

public class Ex04 {
    public static void main(String[] args) {
        double milhas = 8;
        
        double quilometros = milhas * 1.609;
        
        System.out.println("A distância em quilômetros é: " + quilometros);
    }
}