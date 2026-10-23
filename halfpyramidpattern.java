public class halfpyramidpattern {
  public static void main(String[] args) {
      //half rotated pyramid

        for (int i = 1; i <= 4; i++) {

            // spaces
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print("  ");
            }

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
    

