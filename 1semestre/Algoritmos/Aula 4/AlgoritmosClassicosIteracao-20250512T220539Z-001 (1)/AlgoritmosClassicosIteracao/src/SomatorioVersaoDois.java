
/**
 * Algoritmo Classico de Somatorio de Numeros
 * Exemplo com leitura de 10 numeros inteiros informados pelo usuario.
 * Nessa versao "dois", é mostrada uma pequena alteracao possivel de ser feita.
 * Em vez de iniciar a variavel "soma" com ZERO, ela já recebe o primeiro valor
 * a ser somado. Essa alteracao reduz 1 passo na execução, quando temos certeza
 * de que haverá ao menos 1 valor a ser somado.
 * 
 * @author Alexandro Adario <alexandro.adario@erechim.ifrs.edu.br>
 */
import java.util.Scanner;

public class SomatorioVersaoDois {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // A variavel soma vai armazenar a acumulação (somatorio) dos valores
        // O primeiro valor lido já é armazenado na variavel soma, o que elimina
        // a necessidade do passo de ZERÁ-LA
        int soma = leitor.nextInt(); 
        int valor; // variavel que ira receber cada numero informado
        
        // Como um valor já foi lido e colocado na variavel soma, o loop for vai
        // precisar ler um numero a menos,iniciando de 1, em vez de 0.
        for(int i= 1; i<10; i++) {
            valor = leitor.nextInt();
            // comando classico de ACUMULACAO: usa o valor anterior de "soma",
            // adiciona um novo "valor" e armazena novamente em "soma"
            soma = soma + valor; 
        }
        System.out.println(soma);
    }
}