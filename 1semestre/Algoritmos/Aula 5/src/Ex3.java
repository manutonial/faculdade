/* 
Escreva um programa em Java que leia em 10 numeros inteiros, e armazene em um vetor
Em seguida, leia mais um numero e verifique se ele e igual a um dos 10 numeros
armazenados no vetor
*/

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int[] numeros = new int[10];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = leitor.nextInt();
        }
        
        System.out.println("Digite o valor a ser procurado: ");
        int valor = leitor.nextInt();
        
        int i;
        for (i = 0; i < 10; i++) {
            
            if ( valor == numeros[i]) {
            
                break; //antecipa o fim do laco for
            }
        }
        
        if (i < 10) {
            
            System.out.println("Elemento encontrado no indice " + i);
        }else{
        
            System.out.println("Elemento nao encontrado");
        }
    }  
}
