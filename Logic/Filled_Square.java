
public class Filled_Square {
    public static void pattern(int n){
        System.out.println("Pattern: Filled Square");
        for(int i=1; i<=n; i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args){
        pattern(5);
        
    }
    

}
