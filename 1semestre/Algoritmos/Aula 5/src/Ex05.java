/* Escreva um programa que leia 10 numeros inteiros. Como saida deve retornar se existe algum igual.*/

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int[] numeros = new int[10];
        
        for (int i = 0; i < numeros.length; i++) {
        
            numeros[i] = leitor.nextInt();
        }
        
        int i = leitor.nextInt();
        int j = leitor.nextInt();
        
        // 0 ao 8
        for (i = 0; i < 9; i++) {
            
            // inicialmente 1 a 9
            for (j = i + 1; j < 10; j++) {
            
                if (numeros[i] == numeros[j]) {
                   
                    break;
                }
            }
            if (j < 10) {
            
                break;
            }
        }
        if (i < 9) {
        
            System.out.println("Encontrei uma duplicata em " + i + " e " + j);
        } else {
        
            System.out.println("Nenhuma duplicata encontrada");
        }
    }
}   
