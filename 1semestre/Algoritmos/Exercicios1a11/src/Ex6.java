import java.util.Scanner;
public class Ex6 
{
   public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       
       double VelocidadeMedia, Tempo;
       
       System.out.print("Diga a velocidade media: ");
       VelocidadeMedia = input.nextDouble();
       System.out.println("A velocidade media eh = " + VelocidadeMedia + "Km/h");
       
       System.out.print("Digte o tempo: ");
       Tempo = input.nextDouble();
       System.out.println("O tempo eh = " + Tempo + "Horas" );
       
       double Distancia = VelocidadeMedia * Tempo;
       System.out.println("A distancia eh = " + Distancia);
               
    }
    
}
