import java.util.Stack;

public class InverterPalavras {
    public static String inverterPalavras(String texto) {
        String[] palavras = texto.split(" "); 
 // Dividir o texto em palavras
        StringBuilder textoInvertido = new StringBuilder();

        for (String palavra : palavras) {
            Stack<Character> pilha = new Stack<>(); 
 // Pilha para armazenar as letras da palavra
            for (char letra : palavra.toCharArray()) {
                pilha.push(letra);  // Empilhar as letras da palavra
            }

            StringBuilder palavraInvertida = new StringBuilder();
            while (!pilha.isEmpty()) {
                palavraInvertida.append(pilha.pop());  
// Desempilhar as letras e formar a palavra invertida
            }

            textoInvertido.append(palavraInvertida).append(" ");  
// Adicionar a palavra invertida ao texto final
        }

        return textoInvertido.toString().trim(); 
 // Remover espaços em branco extras e retornar o texto final
    }

    public static void main(String[] args) {
        String texto = "ESTE EXERCÍCIO É MUITO FÁCIL.";
        String textoInvertido = inverterPalavras(texto);
        System.out.println(textoInvertido); 
 // Saída: ETSE OICÍCREXE É OTIUM LICÁF
    }
}
