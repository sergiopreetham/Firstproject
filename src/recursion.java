//recurtion
public class recursion {
    public static void main(String[] args) {
        int p =5,f;
        f=factorial(p);
        System.out.println(f);

    }

    public static  int factorial(int p) {
        if (p==0){
            return 1;
        }
        return p*factorial(p-1);
    }
}
