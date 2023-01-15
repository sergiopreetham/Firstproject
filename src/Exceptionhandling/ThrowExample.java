package Exceptionhandling;
public class ThrowExample {

    public static void main(String[] args) {
        try {
            validateAge(19);
        }
           catch (ArithmeticException e){
               System.out.println(e.getMessage());
           }
        finally {
            System.out.println("rest of the code print ");
        }
        System.out.println("Rest of code");
    }
    public  static void validateAge(int age){
        if(age<18){
            throw new ArithmeticException("Person is not eligible to vote");
        }
        else {
            System.out.println("Person is elgible to vote");
        }
    }
}

