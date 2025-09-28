/**
 * Algoritmo Classico de Somatorio de Numeros
 * Exemplo com leitura de N numeros inteiros informados pelo usuario.
 * Inicialmente o usuario informa quantos (N) numeros serao lidos.
 * 
 * @author Alexandro Adario <alexandro.adario@erechim.ifrs.edu.br>
 */
import java.util.Scanner;

public class SomatorioNnumeros {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // A variavel soma vai armazenar a acumulação (somatorio) dos valores
        int soma = 0; // O ZERO é o elemento neutro da soma
        int valor; // variavel que ira receber cada numero informado
        
        // quantidade de numeros que serao lidos. Esse dado será usado como
        // limite da execucao do loop for.
        int N = leitor.nextInt();
        for(int i= 0; i<N; i++) {
            valor = leitor.nextInt();
            // comando classico de ACUMULACAO: usa o valor anterior de "soma",
            // adiciona um novo "valor" e armazena novamente em "soma"
            soma = soma + valor; 
        }
        System.out.println(soma);
    }
}