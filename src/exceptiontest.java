//execution practice
public class exceptiontest {
    public static void main(String[] args) {
        String str= null;
        String input= "pree";
        try{
            System.out.println(str);
        }
        catch (NullPointerException g){
            System.out.println(g.getMessage());
        }
        System.out.println(input);


    }
}
