// Escreva uma classe que conte a quantidade de vogais, espaços em
// brancos e consoantes de uma cadeia de caracteres.

public class Ex010 {
    public static void main(String[] args) {
        String cadeia = "Estou aprendendo a desenvolver em Java";
        int vogais = 0, espacos = 0, consoantes = 0;

        for (char c : cadeia.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vogais++;
            } else if (c == ' ') {
                espacos++;
            } else if (Character.isLetter(c)) {
                consoantes++;
            }
        }

        System.out.println("Vogais: " + vogais);
        System.out.println("Espaços em branco: " + espacos);
        System.out.println("Consoantes: " + consoantes);
    }
}
