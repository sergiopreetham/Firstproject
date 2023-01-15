class custamer {
    float salery = 50000;                                //single inheritance

    void display() {

        System.out.println("the custamer salery is : " + salery);
    }

}
public class Review9 extends custamer{
    float bonus=10000;

    void manager(){
       salery = salery + bonus;
        System.out.println("the manager saler is :" + salery);
    }
    public static void main(String[] args) {
        Review9 obj=new Review9();
        obj.display();
        obj.manager();


    }
}