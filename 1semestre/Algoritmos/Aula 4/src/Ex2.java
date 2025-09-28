public class Ex2 {

    public static void main(String[] args) {
        
        //Faca um programa que exiba os numeros primeos de 2 a 100
        
        for (int i = 2; i <= 100; i++) {
            
            boolean divisor = false;
            
            for (int j = i - 1; j >= 2; j--) {
                
                if (i % j == 0){
                    divisor = true;
                    
                }
            }
            
            if (!divisor) {
                System.out.println(i);
                
            }
        }
    }
}
