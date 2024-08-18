// Os motoristas se preocupam com a quilometragem obtida por seus
// automóveis. Um
// motorista monitorou vários tanques cheios de gasolina registrando a
// quilometragem dirigida e a quantidade de combustível em litros utilizados para
// cada tanque cheio. Desenvolva um aplicativo Java que receba como entrada
// os quilômetros dirigidos e os litros de gasolina consumidos (ambos com
// inteiros) para cada tanque cheio. O programa deve calcular e exibir o consumo
// em quilômetros/litro para cada tanque cheio e imprimir a quilometragem
// combinada e a soma total de litros de combustível consumidos até esse ponto.
// Todos os cálculos de média devem produzir resultados de ponto flutuante.

public class Ex012 {
    public static void main(String[] args) {
        int[] quilometros = { 550, 725, 1113 }; 
        int[] litros = { 55, 73, 95 }; 

        float quilometragemCombinada = 0;
        float totalLitros = 0;

        for (int i = 0; i < quilometros.length; i++) {
            float consumo = (float) quilometros[i] / litros[i];
            quilometragemCombinada += quilometros[i];
            totalLitros += litros[i];

            System.out.println("Tanque " + (i + 1) + ":");
            System.out.println("Quilometragem: " + quilometros[i] + " km");
            System.out.println("Litros de gasolina: " + litros[i] + " L");
            System.out.println("Consumo: " + consumo + " km/L");
            System.out.println();
        }

        System.out.println("Quilometragem combinada: " + quilometragemCombinada + " km");
        System.out.println("Soma total de litros de combustível: " + totalLitros + " L");
    }

}
