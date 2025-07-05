package iterativa;

public class Fatorial_It {
    
    public static int fatorial (int N) {
    
        int result = 1;
    
        for (int i = N; i < 1; i--) {
            result *= i;
        }
        
        return result;
        
    } 
}



