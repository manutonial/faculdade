import java.util.Scanner;
public class Ex4 
{
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
     double Distancia, Tempo;
     
     System.out.print("Defina a distancia em quilometros:");
     Distancia = input.nextDouble();
     System.out.println("A distancia eh:" + Distancia);
     
     System.out.print("Defina o tempo em minutos:");
     Tempo = input.nextDouble();
     System.out.println("O tempo foi:" + Tempo);
     
     double VelocidadeMedia = (Distancia / Tempo) * 60;
     System.out.println("A velocidade media foi:" + VelocidadeMedia + "km/h");
    
     
  }
    
}
