import java.util.Scanner;
public class Ex29 
{
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("O animal eh: 1 - ave; 2- mamifero");
        int animal = leitor.nextInt();
        
        System.out.println("A dieta dele eh: 1 - onivoro; 2 - carnivoro");
        int dieta = leitor.nextInt();
            
        switch (animal)
        {
            case 1:
                switch(dieta)
                {
                    case 1: System.out.println("O animal eh um pombo");
                    break;
                    
                    case 2: System.out.println("O animal eh uma aguia");
                    break;
                    
                    default: System.out.println("Opcao invalida");
                } break;
            case 2:
                switch(dieta)
                 {
                    case 1: System.out.println("O animal eh um porco");
                    break;
                    
                    case 2: System.out.println("O animal eh onca");
                    break;
                    
                    default: System.out.println("Opcao invalida");
                } break;  
                
            default: 
                System.out.println("Opcao invalida, use 1 pra ave e 2 pra mamifero");
            
        
        } 
        
            
    }
    
}
