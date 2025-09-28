import java.util.Scanner;
public class Ex22 {

    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Valor A: ");
        int A = leitor.nextInt();
        
        System.out.print("Valor B: ");
        int B = leitor.nextInt();
        
        System.out.print("Valor C: ");
        int C = leitor.nextInt();
        
        System.out.print("Valor D: ");
        int D = leitor.nextInt();
        
        if( (B > C) && (D > A) && ( (C + D) > (A + B) ) && (C > 0 && D > 0) && A % 2 == 0 )
        {
            System.out.println("Valores aceitos!!");
        }else
        {
            System.out.println("Valores invalidos!!");
        }
    }
    
}
