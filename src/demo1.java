import java.util.Scanner;
public class demo1 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);


                int num1 = scanner.nextInt();

                int num2 = scanner.nextInt();


                int lower = Math.min(num1, num2);

                // Initialize the HCF to 1
                int hcf = 1;

                // Iterate from the lower number down to 1
                // and check if both numbers are divisible by the current number
                for (int i = lower; i > 0; i--) {
                    if (num1 % i == 0 && num2 % i == 0) {
                        // If both numbers are divisible, set the HCF to the current number
                        hcf = i;
                        break;
                    }
                }

                // Print the HCF
                System.out.println( hcf);
            }
        }
