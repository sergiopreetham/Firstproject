import java.util.Scanner;

public class Review {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        char ch =sc.next().charAt(0);

        switch (ch){
            case '1':
                System.out.println("monday");
                break;
            case '2':
                System.out.println("tuesday");
                break;
            case '3':
                System.out.println("wednsday");
                break;
            case '4':
                System.out.println("thursday");
                break;
            case '5':
                System.out.println("friday");
                break;
        }

    }
}
