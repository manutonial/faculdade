import java.util.Scanner;
public class Ex9 {
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.print("A extensao da rota eh (km): ");
       double ET = input.nextDouble();
       
       System.out.print("A velocidade media do cruzeiro (km/h): ");
       double Vm = input.nextDouble();
       
       System.out.print("A velocidade media automatica (km/h): ");
       double VmA = input.nextDouble();
       
       System.out.print("Intevalo do piloto automatico: ");
       double IntervaloA = input.nextDouble();
       
       double TempoViagem = ET / Vm;
       double EA = VmA * IntervaloA;
       double diferenca1 = ET - EA;
       double TRestante = Math.abs (TempoViagem - IntervaloA);
       double VmN = diferenca1 / TRestante;
       double ETA = ET / VmA;
       
       System.out.println("O tempo previsto para completar: " + TempoViagem + "horas");
       System.out.println("A extensao em piloto automatico: "  + EA + "km");
       System.out.println("A diferenca entre as rotas: " + diferenca1 + "km");
       System.out.println("O tempo restante: " + TRestante + "horas");
       System.out.println("A velocidade media necessaria" + VmN + "km/h");
       System.out.println("O tempo que demoraria no automatico: " + ETA);
    
    }
    
}
