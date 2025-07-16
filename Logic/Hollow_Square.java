public class Hollow_Square{
    public static void pattern(int n){
        System.out.println("Pattern: Hollow Square");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1||j==n){
                    System.out.println("*");
                }else{
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        pattern(5);
    }
}