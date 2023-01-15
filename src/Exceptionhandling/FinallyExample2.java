package Exceptionhandling;

public class FinallyExample2 {

    public static void main(String[] args) {
        try{
            System.out.println("Starting of the program");
            int data = 25/0;
            System.out.println(data);
        }
        catch (ArithmeticException e){

            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("Rest of the code");
    }
}
