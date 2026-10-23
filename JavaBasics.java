import java.util.Scanner;
public class JavaBasics {
public static void main(String args []){
 Scanner fc = new Scanner(System.in);
// prime sum
int n = fc.nextInt();

int primesum = 0;
int nonprimesum = 0;

for (int i = 1; i <= n; i++) {

    int count = 0;

    for (int j = 1; j <= i; j++) {
        if (i % j == 0) {
            count++;
        }
    }

    if (count == 2) {
        primesum += i;
    } else {
        nonprimesum += i;
    }
}

System.out.println("Prime sum = " + primesum);
System.out.println("Non-prime sum = " + nonprimesum);


}
}







 














 
  
  
  

    