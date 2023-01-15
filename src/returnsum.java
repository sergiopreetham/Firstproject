public class returnsum {
    public static void main(String[] args) {
        int x=10;
        int y=9;

       int result= add(x,y);
        System.out.println("the value of addition " + result);

        int subresult= sub(x,y);
        System.out.println("the value of subration " + subresult);

        int sresult=mul(x, y);
        System.out.println(sresult);
    }

    public static int add (int x,int y) {
        int sum=x+y;
        return sum;

    }

    public static int sub(int x,int y) {
        int diff=x-y;
        return diff;

    }
    public static int mul(int x,int y){

        int mul=x*y;
        return mul;
    }
}
