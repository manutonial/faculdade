/**
 * Algoritmo Classico de Decomposicao de String em char
 *  
 * @author Alexandro Adario <alexandro.adario@erechim.ifrs.edu.br>
 */
import java.util.Scanner;

public class DecomposicaoStringEmChar {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        // A variavel soma vai armazenar a String informada pelo usuario;
        String texto = leitor.nextLine();
        // identifica-se o comprimento total da String
        int tamanho = texto.length();
        
        // O loop for vai executar N vezes de acordo com o tamanho da String.
        for(int i= 0; i<tamanho; i++) {
            // A cada iteração do loop, vai obter 1 caractere da String
            Character caractere = texto.charAt( i );
            System.out.println( caractere ); 
        }
    }
}