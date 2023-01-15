import java.util.Scanner;


    public class sumofarray {
        public static void main(String[] args) {
            int arr[]=new int[10];
            Scanner sc=new Scanner(System.in);
            for (int i=0;i<10;i++){
                arr[i]= sc.nextInt();
            }
            int sum=0;
            for (int i=0;i<10;i++)
            {
                sum=sum+arr[i];
            }
            System.out.println("the element value is "  + sum);
        }
    }