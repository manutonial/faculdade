/**
 * Algoritmo Classico de Somatorio de Uma Quantidade Indefinida de Numeros
 * até que seja atingido um valor LIMITE para o somatorio.
 * Exemplo com leitura de N numeros inteiros informados pelo usuario. Aqui, o
 * usuario informa inicialmente o limite maximo a ser atingido.
 * 
 * @author Alexandro Adario <alexandro.adario@erechim.ifrs.edu.br>
 */
import java.util.Scanner;

public class SomatorioComLimiteMaximo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // A variavel soma vai armazenar a acumulação (somatorio) dos valores
        int soma = 0; // O ZERO é o elemento neutro da soma
        int valor; // variavel que ira receber cada numero informado
        
        int limite = leitor.nextInt();
        
        // A cada nova "acumulacao", a variável soma é testada para verificar se
        // o limite foi ultrapassado. Quando isso ocorre o loop while encerra.
        while(soma < limite) {   
            valor = leitor.nextInt();
            // comando classico de ACUMULACAO: usa o valor anterior de "soma",
            // adiciona um novo "valor" e armazena novamente em "soma"
            soma = soma + valor; 
        }
        System.out.println(soma);
    }
}