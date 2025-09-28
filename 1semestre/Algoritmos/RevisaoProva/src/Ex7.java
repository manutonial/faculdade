import java.util.Scanner;

public class Ex7 
{
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Distancia total da viagem(km): ");
        double DistanciaT = leitor.nextDouble();
        
        System.out.print("Velocidade media prevista(km/h): ");
        double Vm = leitor.nextDouble();
        
        System.out.print("Intervalo para lanche(min): ");
        double Intervalo = leitor.nextDouble();
        
        double TempoP = DistanciaT / Vm;
        double IntervaloH = Intervalo / 60.0;
        double Distancia1 = Vm * IntervaloH;       
        double DistanciaR = DistanciaT - Distancia1;
        double TempoR = DistanciaR / Vm;
        
        System.out.println("O tempo previsto eh: " + TempoP );
        System.out.println("A distancia percorrida na primeira parte foi:" + Distancia1);
        System.out.println("A distancia restante eh: " + DistanciaR);
        System.out.println("O tempo restante eh: " + TempoR);
        
     
              
        
    }
    
}
