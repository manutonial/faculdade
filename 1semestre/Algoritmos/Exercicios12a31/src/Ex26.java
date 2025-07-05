import java.util.Scanner;
public class Ex26 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o 1 valor: ");
        int Val1 = leitor.nextInt();
        
        System.out.print("Digite o 2 valor: ");
        int Val2 = leitor.nextInt();
        
        System.out.print("Digite o 3 valor: ");
        int Val3 = leitor.nextInt();
        
        if (Val1 <= Val2 && Val2 <= Val3) { 
            System.out.println(Val1 + " " + Val2 + " " + Val3);
        } else if (Val1 <= Val3 && Val3 <= Val2) { 
            System.out.println(Val1 + " " + Val3 + " " + Val2);
        } else if (Val2 <= Val1 && Val1 <= Val3) { 
            System.out.println(Val2 + " " + Val1 + " " + Val3);
        } else if (Val2 <= Val3 && Val3 <= Val1) { 
            System.out.println(Val2 + " " + Val3 + " " + Val1);
        } else if (Val3 <= Val1 && Val1 <= Val2) { 
            System.out.println(Val3 + " " + Val1 + " " + Val2);
        } else { 
            System.out.println(Val3 + " " + Val2 + " " + Val1);
        }
    }
}