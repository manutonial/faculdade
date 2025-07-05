/**
 * Algoritmo Classico de Produtorio de Numeros
 * Exemplo com leitura de 10 numeros inteiros informados pelo usuario.
 * 
 * @author Alexandro Adario <alexandro.adario@erechim.ifrs.edu.br>
 */
import java.util.Scanner;

public class Produtorio {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // A variavel soma vai armazenar a acumulação (Produtorio) dos valores
        // É interessante que seja um tipo de dados MAIOR, pois o produto tende
        // a aumentar o valor rapidamente, por isso o "long"
        long produto = 1; // O UM é o elemento neutro da multiplicacao
        int valor; // variavel que ira receber cada numero informado
        
        for(int i= 0; i<10; i++) {
            valor = leitor.nextInt();
            // comando classico de ACUMULACAO: usa o valor anterior de "soma",
            // adiciona um novo "valor" e armazena novamente em "soma"
            produto = produto * valor; 
        }
        System.out.println(produto);
    }
}