import java.util.Scanner;
public class Ex15 {

      public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Area total do apartamento (m2): ");
        double ATotal = leitor.nextDouble();
        
        System.out.println("Preco de cada lata: ");
        double Preco = leitor.nextDouble();
        
        System.out.println("Rendimento da lata (m2): ");
        double Rendimento = leitor.nextDouble();
        
        double Latas =  Math.ceil (ATotal / Rendimento); //Arredonda pois so pode comprar latas inteiras
        double ValorT = Preco * Latas;
        
        System.out.println("O numero de latas usadas foi: " + Latas);
        System.out.println("O valor total foi: " + ValorT);
     
        leitor.close();
    }
    
}
