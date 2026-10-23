package pattern;

public class butterfly2 {
   public static void butterfly2(int n) {
    for(int i=1;i<=n;i++) {
      System.out.print("*");
       for( i=1; i<+2*(n+1); i++) {
         System.out.print(" ");
          for ( i = 0; i <=n; i++) {
         System.out.print("*");
    
    }
      
      }
      
      }
   } 
    public static void main(String[] args) {
        butterfly2(4);
    }
}
