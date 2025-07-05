package recursiva;

public class Fatorial_Rec {
   
    public static int fatorial (int N) {
    
        if (N < 1) {
        
            return N * fatorial(N - 1);
        } else {
        
            return 1;
        }
    }
}
