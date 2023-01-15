import java.util.Scanner;

public class calculation {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first value ");
        int x= sc.nextInt();
        System.out.println("enter the second value ");
        int y= sc.nextInt();

        System.out.println("Addition program");
        int addition=add (x,y);
        System.out.println("the additon value is " + addition);

        System.out.println("subraction program");
        int subraction=sub (x,y);
        System.out.println("the subraction value "+ subraction);

        System.out.println("multiplication program");
        int multiplication = multiple(x,y);
        System.out.println("the multiple value " + multiplication);

        System.out.println("division program");
        int division =divide(x,y);
        System.out.println("the division value " + division);


    }

    public static int add(int x,int y){
        int sum =x+y;
       return sum;

    }

    public static int sub(int x,int y){
        int diff =x-y;
        return diff;
    }
    public static int multiple(int x,int y) {
        int mul = x * y;
        return mul;


    }

    public static int divide(int x,int y) {

        int div = x/y;
        return div;
    }
}