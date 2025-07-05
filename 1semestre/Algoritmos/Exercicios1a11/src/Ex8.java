import java.util.Scanner;
public class Ex8 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       
        System.out.print("Digite a extensao total (km): ");
        double ET = input.nextDouble();
        
        System.out.print("Velocidade media padrao (km/h): ");
        double VmP = input.nextDouble();
        
        System.out.print("Velocidade media ajustada (km/h): ");
        double VmA = input.nextDouble();
        
        
        double TempoPrevisto = ET / VmP;
        double TempoEfetivo = ET / VmA;
        double Diferenca = Math.abs (TempoPrevisto - TempoEfetivo);
        double DistanciaPossivel = VmA * TempoPrevisto;
        double Diferenca2 = ET - DistanciaPossivel;
        
        
        System.out.println("O tempo previsto para completar a viagem: " + TempoPrevisto + " horas");
        System.out.println("O tempo efetivo: " + TempoEfetivo + " horas");
        System.out.println("A diferenca entre ambas situacoes: " + Diferenca + " horas");
        System.out.println("Distancia possivel: " + DistanciaPossivel + " km");
        System.out.println("Diferenca entre extensao total e distancia possivel: " + Diferenca2 + " km");
        
       
    }
}
