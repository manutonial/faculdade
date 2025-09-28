import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);

        System.out.print("Digite o salario atual: ");
        double Salario = Leitor.nextDouble();

        double Bonificacao;
        if (Salario <= 500.00) {
            Bonificacao = Salario * 0.12;
        } else if (Salario <= 1200.00) {
            Bonificacao = Salario * 0.05;
        } else {
            Bonificacao = 0.0;
        }

        double SalarioComBonificacao = Salario + Bonificacao;

        double AuxilioEscolar;
        if (SalarioComBonificacao <= 600.00) {
            AuxilioEscolar = 150.00;
        } else {
            AuxilioEscolar = 100.00;
        }

        double NovoSalario = SalarioComBonificacao + AuxilioEscolar;

        System.out.println("Salario atual: R$" + Salario);
        System.out.println("Bonificacao: R$" + Bonificacao);
        System.out.println("Auxilio escolar: R$" + AuxilioEscolar);
        System.out.println("Novo salario: R$" + NovoSalario);
    }
}
