public class Ex1 {
    
    public static void main(String[] args) {
        
        //Apresente a tabuada dos 10 primeiros numeros do 2 ao 10, no formato "2 x 1 = 2"
        
        for(int i = 2; i <= 10; i++) {
            
            for(int j = 1; j <= 10; j++) {
                
                int mult = i * j;
                
                System.out.printf("%d x %d = %d  \n", i, j, mult);
            
            }
        }   
    }
}
