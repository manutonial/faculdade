import java.util.Scanner;
public class EstadosDaMateria {
     
    public static void main(String[] args) 
  {
       Scanner leitor = new Scanner(System.in);
       
       System.out.print("Informe o numero da substancia: ");
       int numero = leitor.nextInt();
       
       System.out.print("Informe a temeperatura: ");
       double temperatura = leitor.nextDouble();
       
       switch(numero)
       {
           case 1:
           System.out.println("A substancia eh o cloroformio");
           
           if(temperatura <= -63.5) 
           {
            System.out.println("Estado solido");
           }
           else
           { 
             if(temperatura >= 61.2)
             {
                System.out.println("Estado gasoso");
             }
             else
             {
                System.out.println("Estado liquido");
             }
           
           } 
           break;       
           
           case 2:
           System.out.println("A substancia eh o propano");
           
           if(temperatura <= -190) 
           {
            System.out.println("Estado solido");
           }
           else
           { 
             if(temperatura >=-45)
             {
                System.out.println("Estado gasoso");
             }
             else
             {
                System.out.println("Estado liquido");
             }
            
           }
           break;
           
           case 3:
           System.out.println("A substancia eh o eter etilitico");
           
           if(temperatura <= -116) 
           {
            System.out.println("Estado solido");
           }
           else
           { 
             if(temperatura >= 35)
             {
                System.out.println("Estado gasoso");
             }
             else
             {
                System.out.println("Estado liquido");
             }
            
           }break;
       
       }
    }
}    
    
   

