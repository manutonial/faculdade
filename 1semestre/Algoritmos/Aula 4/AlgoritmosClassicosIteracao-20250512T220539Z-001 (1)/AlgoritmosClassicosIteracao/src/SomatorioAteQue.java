/**
 * Algoritmo Classico de Somatorio de Uma Quantidade Indefinida de Numeros
 * (Até que algum critério de "parada" seja satisfeito.
 * Exemplo com leitura de N numeros inteiros informados pelo usuario. Aqui, o
 * criterio de parada definido é que o numero lido seja igual a ZERO.
 * 
 * @author Alexandro Adario <alexandro.adario@erechim.ifrs.edu.br>
 */
import java.util.Scanner;

public class SomatorioAteQue {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // A variavel soma vai armazenar a acumulação (somatorio) dos valores
        int soma = 0; // O ZERO é o elemento neutro da soma
        int valor; // variavel que ira receber cada numero informado
        
        // "leitor.nextInt()" fara a leitura do valor informado pelo usuario
        // e sera atribuido a "valor", e logo em seguida é verificado se esse
        // numero informado é DIFERENTE de ZERO. Se não for, a condicao do
        // "while" não é satisfeita e o laço encerra.
        while((valor=leitor.nextInt()) != 0 ) {         
            // comando classico de ACUMULACAO: usa o valor anterior de "soma",
            // adiciona um novo "valor" e armazena novamente em "soma"
            soma = soma + valor; 
        }
        System.out.println(soma);
    }
}