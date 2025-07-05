import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double vetor[] =  new double [10];
        
        for (int i = 0; i < vetor.length; i++){
            
            vetor[i] = leitor.nextDouble();
        }    
          // exibir o quadrado e o cubo dos elementos do array
          
          for ( double elemento : vetor) {
              
              System.out.println(Math.pow(elemento,2) + " " + Math.pow(elemento,3));
           
          }
        
    }
   
}
