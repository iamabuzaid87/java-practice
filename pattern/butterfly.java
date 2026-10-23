package pattern;

public class butterfly {
    public static void butterfly (int n) {
        for (int i = 1; i <= n; i++){
            System.out.print("*");
            for (int j = 6; j >= 2; j++) {
                System.out.print(" ");
                for( i=i; i<=n; i++) {
                    System.out.print("*");


                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        butterfly(4);
    }
}
