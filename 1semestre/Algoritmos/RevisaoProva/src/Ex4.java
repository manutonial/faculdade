import java.util.Scanner;

public class Ex4 
{ 
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Distancia percorrida (km): ");
        double DistanciaP = leitor.nextDouble();
        
        System.out.print("Periodo do tempo (m): ");
        double Tempo = leitor.nextDouble();
        
        double Vm = DistanciaP / (Tempo / 60);
        System.out.println("A velocidade media foi: " +Vm);
    }
    
}
