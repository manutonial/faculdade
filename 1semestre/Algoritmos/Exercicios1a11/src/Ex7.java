import java.util.Scanner;
public class Ex7 
{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        double DistanciaTotal, VelocidadeMedia; 
        double IntervaloTempo; //Em minutos
        
        System.out.print("Digite a distancia total da viagem: ");
        DistanciaTotal = input.nextDouble();
        System.out.println("Distancia total = " + DistanciaTotal + "km");        
         
        System.out.print("Digite a velocidade media prevista: ");
        VelocidadeMedia = input.nextDouble();
        System.out.println("Velocidade media = " + VelocidadeMedia + "km/h");
        
        System.out.print("Digite o intervalo: ");
        IntervaloTempo = input.nextDouble();
        System.out.println("Intervalo = " + IntervaloTempo);
        
        double TempoPrevisto = DistanciaTotal / VelocidadeMedia;
        double DistanciaPercorrida = VelocidadeMedia * (IntervaloTempo / 60);
        double DistanciaRestante = DistanciaTotal - DistanciaPercorrida;
        double TempoRestante = TempoPrevisto - (IntervaloTempo/60);
        
        System.out.println("Tempo previsto para completar a viagem: " +TempoPrevisto + " horas");
        System.out.println("Distancia primeira parte: " + DistanciaPercorrida + "km");
        System.out.println("Distancia segunda parte: " + DistanciaRestante + "km");
        System.out.println("Ainda falta " +TempoRestante + " horas");
        
        
        
    }
    
}
