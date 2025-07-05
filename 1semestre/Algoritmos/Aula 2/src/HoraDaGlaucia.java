import java.util.Scanner;
public class HoraDaGlaucia {

    
    public static void main(String[] args) 
    {
      Scanner leitor = new Scanner (System.in);
       
      System.out.println("Diametro");
      double diametro = leitor.nextDouble();
      
      double raio = (diametro / 2);
      double AreaSuperficial = 4 * Math.PI * Math.pow (raio, 2);
      double Volume = (4.0 / 3.0) * Math.PI * Math.pow (raio, 3);
      double VolumeL = volumecm * 0.001;
      
      System.out.println("Area superficial: " + AreaSuperficial);
      System.out.println("Volume (L): " + VolumeL);
    }
    
}
