import jdk.jfr.StackTrace;

public class Practice12 {
    public static void main(String[] args) {
        try {
            String s = null;

            System.out.println(s.length());
        }//NullPointerException
        catch (NullPointerException e){
            System.out.println("nothing");
            System.out.println(e);
        }
       // String s="abc";
       // int i=Integer.parseInt(s);//NumberFormatException
       // int a[]=new int[5];
        //a[10]=50; //ArrayIndexOutOfBoundsException
    }
}
