/**
 * Algoritmo Classico de Pesquisa de Maximo de um Conjunto de Numeros
 * Exemplo com leitura de 10 numeros inteiros informados pelo usuario.
 * 
 * @author Alexandro Adario <alexandro.adario@erechim.ifrs.edu.br>
 */
import java.util.Scanner;

public class Maximo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // A variavel maximo vai armazenar qual é o valor MAXIMO atual na busca
        int maximo;
        int valorAtual; // variavel que ira receber cada numero informado
        
        // Quando tivermos lido o PRIMEIRO dos numeros, por uma razao obvia de 
        // ser, por enquanto, o único, ele também é o MAIOR de todos
        maximo = leitor.nextInt();
        
        // Como um valor já foi lido, o loop for vai precisar ler um numero a 
        // menos, iniciando de 1, em vez de 0.
        for(int i= 1; i<10; i++) {
            // leitura do proximo numero
            valorAtual = leitor.nextInt();
            
            // Compara-se o valorAtual que acabou de ser lido com o número que,
            // até o momento, era o máximo. Se isso ocorrer, substituimos o
            // maximo pelo valorAtual
            if( valorAtual > maximo ) {
                maximo = valorAtual;
            }
        }
        System.out.println(maximo);
    }
}