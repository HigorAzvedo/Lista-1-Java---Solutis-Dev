// Criar uma classe Java que receba uma palavra (String) retorne uma
// mensagem caso a
// palavra fornecida seja uma palavra que pode ser lida da esquerda pra direita
// ou da direita pra esquerda obtendo-se a mesma palavra. Ex.: Ana, arara, osso,
// etc.

public class Ex08 {

    public static void main(String[] args) {
        String palavra = "carro";
        String palavraInvertida = new StringBuilder(palavra).reverse().toString();

        if (palavra.equalsIgnoreCase(palavraInvertida)) {
            System.out.println("A palavra \"" + palavra + "\" é um palíndromo.");
        } else {
            System.out.println("A palavra \"" + palavra + "\" não é um palíndromo.");
        }
    }

}
