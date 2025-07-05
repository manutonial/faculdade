/**
 * Algoritmo Classico de Somatorio de Uma Quantidade Indefinida de Numeros
 * (Até que algum critério de "parada" seja satisfeito).
 * Nessa variação, vamos contar quantos numeros fora lidos e somados.
 * Esse é um caso importante quando, por exemplo, precisamos calcular uma média,
 * ou apenas identificar a quantidade de itens.
 * Exemplo com leitura de N numeros inteiros informados pelo usuario. Aqui, o
 * criterio de parada definido é que o numero lido seja igual a ZERO.
 * 
 * @author Alexandro Adario <alexandro.adario@erechim.ifrs.edu.br>
 */
import java.util.Scanner;

public class SomatorioComContagemAteQue {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // A variavel soma vai armazenar a acumulação (somatorio) dos valores
        int soma = 0; // O ZERO é o elemento neutro da soma
        int valor; // variavel que ira receber cada numero informado
        
        int contador = 0;
        
        // "leitor.nextInt()" fara a leitura do valor informado pelo usuario
        // e sera atribuido a "valor", e logo em seguida é verificado se esse
        // numero informado é DIFERENTE de ZERO. Se não for, a condicao do
        // "while" não é satisfeita e o laço encerra.
        while((valor=leitor.nextInt()) != 0 ) {
            // Esse é o comando básico para a contagem, um incremento na
            // variavel contador.
            contador++;
            // comando classico de ACUMULACAO: usa o valor anterior de "soma",
            // adiciona um novo "valor" e armazena novamente em "soma"
            soma = soma + valor; 
        }
        System.out.println(soma);
        System.out.println(contador);
    }
}