
/**
 * Algoritmo Classico de Contagem de Numeros Utilizando Criterios
 * Exemplo com leitura de 10 numeros inteiros informados pelo usuario.
 * Aqui o criterio é contar apenas numeros que sejam POSITIVOS (>0)
 *
 * @author Alexandro Adario <alexandro.adario@erechim.ifrs.edu.br>
 */
import java.util.Scanner;

public class ContagemComCriterios {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // A variavel contador vai armazenar a quantidade de valores
        int contador = 0; // O ZERO é o elemento neutro da soma
        int valor; // variavel que ira receber cada numero informado

        for (int i = 0; i < 10; i++) {
            valor = leitor.nextInt();
            
            // Nese comando condicional é especificado o CRITERIO para realizar
            // a contagem do valor.
            if (valor > 0) {
                // comando classico de CONTAGEM: incremento simples (++)
                contador++;
            }
        }
        System.out.println(contador);
    }
}