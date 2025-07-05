import java.util.Scanner;

public class LacoDoWhile {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        //Laco pos teste (do while)
        double Valor = leitor.nextDouble();
        
        do {
            double Raiz = Math.sqrt (Valor);
            System.out.println("raiz = " + Raiz);
            
            Valor = leitor.nextDouble();
        }while ( Valor >= 0.0);
        
    }
    
}
