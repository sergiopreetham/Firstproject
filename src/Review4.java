//methods

public class Review4 {
    static  int Boxload(int length, int breath, int width) {          //method diffinition &method header
        int vol = length + breath + width;                            //method body
        return vol;
    }
    public static void main(String[] args) {

        int volume=Boxload(25, 12, 5);                //argument passing
        System.out.println(volume);

        System.out.println("vol is " + volume);
        int volm= Boxload(5,10,15);
        System.out.println(volm);

    }
}