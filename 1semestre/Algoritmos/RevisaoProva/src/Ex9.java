import java.util.Scanner;  

public class Ex9 
{
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Rota fixa(km): ");
        double RotaF = leitor.nextDouble();
        
        System.out.print("Velocidade media(km/h): ");
        double Vm = leitor.nextDouble();
        
        System.out.print("Velocidade media automatica(km/h): ");
        double VmA = leitor.nextDouble();
        
        System.out.print("Intervalo automatica(h): ");
        double IntervaloA = leitor.nextDouble();
        
        double TempoP = RotaF / Vm;
        double PilotoA = VmA * IntervaloA;
        double Diferenca = RotaF - PilotoA;
        double TempoR = TempoP - IntervaloA;
        double VmN = Diferenca / TempoR;
        double TempoA = RotaF / VmA;
        
        System.out.println("O tempo previsto eh: " +TempoP);
        System.out.println("O trecho em piloto automatico eh: " +PilotoA);
        System.out.println("A diferenca entre as rotas: " + Diferenca);
        System.out.println("O tempo restante de viagem: " + TempoR);
        System.out.println("A velocidade media necessaria: " + VmN);
        System.out.println("O tempo que hipotetico da rota automatica: " + TempoA);
        
    }
    
}
