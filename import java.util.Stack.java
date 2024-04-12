import java.util.Stack;

public class PalindromoChecker {
    public static boolean verificarPalindromo(String palavra) {
        // Criar uma pilha para armazenar os caracteres da palavra
        Stack<Character> pilha = new Stack<>();

        // Adicionar os caracteres da palavra à pilha
        for (char letra : palavra.toCharArray()) {
            pilha.push(letra);
        }

        // Construir a palavra reversa desempilhando os caracteres da pilha
        StringBuilder palavraReversa = new StringBuilder();
        while (!pilha.isEmpty()) {
            palavraReversa.append(pilha.pop());
        }

        // Verificar se a palavra original é igual à palavra reversa
        return palavra.equals(palavraReversa.toString());
    }

    public static void main(String[] args) {
        String palavra = "radar";
        if (verificarPalindromo(palavra)) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }
    }
}

