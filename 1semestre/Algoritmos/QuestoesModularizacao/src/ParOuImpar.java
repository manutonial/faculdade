
public class ParOuImpar {
    
    public static boolean ehPar(int numero) {
       if (numero % 2 == 0) {
           return true;
       } else {
           return false;
       }
      
    }
    
    public static void main(String[] args) {      
        System.out.println(ehPar(4));
        System.out.println(ehPar(7));
    }
    
}
