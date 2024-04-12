import java.util.Stack;

public class EstatisticasPilhaNumeros {
    public static void estatisticasPilha(Stack<Integer> pilha) {
        // Verificar se a pilha está vazia
        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia.");
            return;
        }

        // Inicializar variáveis para armazenar o maior, o menor e a soma dos elementos
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int soma = 0;
        int tamanho = 0;

        // Calcular o menor, o maior e a soma dos elementos
        while (!pilha.isEmpty()) {
            int valor = pilha.pop();
            menor = Math.min(menor, valor);
            maior = Math.max(maior, valor);
            soma += valor;
            tamanho++;
        }

        // Calcular a média aritmética
        double media = (double) soma / tamanho;

        // Exibir os resultados
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media);
    }

    public static void main(String[] args) {
        // Exemplo de uso
        Stack<Integer> pilha = new Stack<>();
        pilha.push(3);
        pilha.push(1);
        pilha.push(4);
        pilha.push(2);
        pilha.push(5);

        // Calcular estatísticas da pilha
        estatisticasPilha(pilha);
    }
}

