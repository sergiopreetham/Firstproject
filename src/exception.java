//exception example
public class exception {
    public static void main(String[] args) {
        try {
            int a= 10/0;
        }
       catch (ArithmeticException e){
           System.out.println(e.getMessage ());
       }

        int b=5+6;
        System.out.println(b);
    }
}
