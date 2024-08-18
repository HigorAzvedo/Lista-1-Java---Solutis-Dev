// Faça um programa que receba 2 valores e retorne o maior entre eles.

public class Ex02 {
    public static void main(String[] args) {
        int valor1 = 18; 
        int valor2 = 25; 
        int maior;

        if(valor1 > valor2){
            maior = valor1;
            
        }else{
            maior = valor2;
            
        }
        System.out.println("O maior valor é: " + maior);
    }
}