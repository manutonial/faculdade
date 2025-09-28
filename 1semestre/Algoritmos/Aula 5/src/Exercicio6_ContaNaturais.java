/* Escreva um programa em Java que leia 100 numeros natrais, cujos valores estao
no intervalo [1,10], e onte quantos numeros cada valor ( 1 a 10 ) existem. 
*/

import java.util.Scanner;

public class Exercicio6_ContaNaturais {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int[] vetor = new int[100];
        for(int i = 0; i < 100; i++) {
            
            vetor[i] = leitor.nextInt();    
        }
        
        //iniciando os contadores
        int[] cont = new int[10];
        for (int i = 0; i < 10; i++) {
            
            //garantindo que inicie em 0
            cont[i] = 0;
        }
        
        //realizar a contagem
        for (int i = 0; i < 100; i++) {
        
            int numero = vetor[i];
            cont[numero - 1]++;
        }
        
        //exibir os contadores
        System.out.println("Contagem: ");
        for (int i = 0; i < 10; i++) {
            
            System.out.println( (i + 1) + ": " + cont[i]);
        }
    }
}
