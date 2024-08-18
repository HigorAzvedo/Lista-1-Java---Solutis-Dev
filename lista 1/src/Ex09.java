// Escreva uma classe para calcular a área de um círculo, sabendo que a área
// é A = PI * r2, onde o raio (r) deve ser informado pelo usuário e o resultado terá
// que ser arredondado.


public class Ex09 {
    public static void main(String[] args) {
        double raio = 10.0;
        double pi = 3.14159265358979323846;

        double area = pi * (raio * raio);
        long areaArredondada = Math.round(area);

        System.out.println("A área do círculo com raio " + raio + " é: " + areaArredondada);
    }
}

