import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
        int a[] = { 2, 4, 6, 8,10,12,14,16,18,20};

        System.out.println("Enter the number you want to search with the index");
        int b = input.nextInt();

        int position = linearSearch(a,b, a.length);

        if(position ==-1) {
            System.out.println("No such number in an array.");
            System.out.println("The position is " + position+".");
        }
        else
            System.out.println("The " + a[position] + " is at position "+ position+"." );
    }

    static int linearSearch(int []list, int value, int num) {
        int i;
        for(i = 0; i < num;i++){
            if (value == list[i])
                return i;
        }
        return -1;
    }

}
