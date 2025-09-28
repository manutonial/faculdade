//um atleta faz atleta faz ate 5 saltos em distancia. Dos 5, o menor
//eh sempre descartado. Ao final, calculase a meida dos demais saltos

import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        double minimo, soma, salto;
        minimo = soma = leitor.nextDouble();
        
        for (int i = 1; i < 5; i++){
            
            salto = leitor.nextDouble();
            soma += salto;
            if (salto < minimo){
                minimo = salto;   
            }  
        }  
        soma = soma - minimo;
        double media = soma / 4;
        
        System.out.println("Menor salto: " + minimo);
        System.out.println("Media de saltos: " + media);
    }
}
