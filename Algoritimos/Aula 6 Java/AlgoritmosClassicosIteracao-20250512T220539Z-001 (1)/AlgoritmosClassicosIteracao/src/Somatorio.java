/**
 * Algoritmo Classico de Somatorio de Numeros
 * Exemplo com leitura de 10 numeros inteiros informados pelo usuario.
 * 
 * @author Alexandro Adario <alexandro.adario@erechim.ifrs.edu.br>
 */
import java.util.Scanner;

public class Somatorio {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // A variavel soma vai armazenar a acumulação (somatorio) dos valores
        int soma = 0; // O ZERO é o elemento neutro da soma
        int valor; // variavel que ira receber cada numero informado
        
        for(int i= 0; i<10; i++) {
            valor = leitor.nextInt();
            // comando classico de ACUMULACAO: usa o valor anterior de "soma",
            // adiciona um novo "valor" e armazena novamente em "soma"
            soma = soma + valor; 
        }
        System.out.println(soma);
    }
}