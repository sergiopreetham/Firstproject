import java.util.Scanner;
//jump statement- break

// find the sum of all input number entered
public class Review2 {
    public static void main(String[] args) {
       double  n,sum =0.0;
       Scanner sc =new Scanner(System.in);
        System.out.println("Enter the nearest Number :");

        while (true){
            n=sc.nextDouble();
            if (n<0.0){
               break;
            }
            sum=sum+n;

        }
        System.out.println(sum);

    }
}
