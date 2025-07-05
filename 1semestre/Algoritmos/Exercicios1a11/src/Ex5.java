import java.util.Scanner;
public class Ex5 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double Distancia, VelocidadeMedia;
        
        System.out.print("Digite a distancia em quilometros: ");
        Distancia = input.nextDouble();
        System.out.println("A distancia eh = " + Distancia);
        
        System.out.print("Digite a velocidade media ");
        VelocidadeMedia = input.nextDouble();
        System.out.println("A velocidade media eh = " + VelocidadeMedia + "km/h");
        
        double Tempo = Distancia / VelocidadeMedia;
        System.out.println("O tempo vai ser: " + Tempo +  " horas ");
        
        
       
    }
    
}
