import java.util.Scanner;

public class Diario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        String[] alunos = new String [5];
        double[][] notas = new double [5][3];
        
        for (int n_aluno = 0; n_aluno < alunos.length; n_aluno++) {
            
            System.out.println("Nome do aluno " + n_aluno + ": ");
            alunos[n_aluno] = leitor.nextLine();
            
        }
        
        for (int n_aluno = 0; n_aluno < alunos.length; n_aluno++) {
             
            System.out.println("Notas do estudante " + alunos[n_aluno] );
            
            for (int n_nota = 0; n_nota < notas[n_aluno].length; n_nota++ ) {
                
                System.out.println("*** Nota " + n_nota + ": ");
                notas[n_aluno][n_nota] = leitor.nextDouble();
                
            }
        }
        
        //Media
        double[] media_aluno = new double[5];
        
        for (int n_aluno = 0; n_aluno < alunos.length; n_aluno++){
            
            double media = 0;
            for (int n_nota = 0; n_nota < notas[n_aluno].length; n_nota++ ) {
                media = media + notas[n_aluno] [n_nota];
            }
            media = media / notas[n_aluno].length;
            media_aluno[n_aluno] = media;
        }   
        
        //Media av
        double[] media_avaliacao = new double[3];
        
        //numero de avaliacoes (3)
        for (int n_nota = 0; n_nota < media_avaliacao.length; n_nota++){
            
            double media = 0;
            
            //itera sobre a quant de alunos (5)
            for (int n_aluno = 0; n_aluno < notas.length; n_aluno++ ) {
                media = media + notas[n_aluno] [n_nota];
            }
            media = media / media_avaliacao.length;
            media_aluno[n_nota] = media;
        }   
        
        //relatorio diario de notas
 
        for (int n_aluno = 0; n_aluno < notas.length; n_aluno++){
            
            System.out.printf("%-25s ", alunos[n_aluno]);

           
                for (int n_nota = 0; n_nota < notas[n_aluno].length; n_nota++ ) {
                System.out.printf("%4.1f ", notas[n_aluno][n_nota]);
            }
            System.out.printf("%4.1f \n", media_aluno[n_aluno]);
        }   
    }   
}
