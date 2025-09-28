import java.util.Scanner;

public class Ex5 
{
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner (System.in);
        
        System.out.print("Distancia (km): ");
        double Distancia = leitor.nextDouble();
        
        System.out.print("Velocidade media apresentada (km/h): ");
        double Vm = leitor.nextDouble();
        
        double Tempo = Distancia / Vm;
        System.out.println("Tempo (h):" + Tempo);
        
        
        
        
    }
    
}
