/* 
Na MegaSena sempre sao sorteados 6 numeros. Alfredo aposta 1 cartao com 7 dezenas.
Faca um programa que conte o numero de acertos de Alfredo.
*/
import java.util.Scanner;

public class Ex07_MegaSena {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        //Sorteando numeros da mega sena
        int[] numerosMegaSena = new int[6];
        
        for(int i = 0; i < numerosMegaSena.length; i++){ 
            
            numerosMegaSena[i] = leitor.nextInt();
        }
        //Numeros que Alfredo selecionou
        int[] numerosAlfredo = new int[7];
        for(int i = 0; i < numerosAlfredo.length; i++) {
        
            numerosAlfredo[i] = leitor.nextInt();
        }
        
        int i = 0;
        int j = 0;
        
        int acertos = 0;
        
        for (i = 0; i < 6; i++) {
        
            for(j = 0; j < 7; j++) {
                
                if(numerosMegaSena[i] == numerosAlfredo[j]) {
                    
                    acertos++;
                    break;
                }
            }
        }
        System.out.println("Os acertos sao: " + acertos);
    }
}
