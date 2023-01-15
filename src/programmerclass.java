//inheritence
class employe{
     float salery=40000;
    void display(){
        System.out.println("the employe salery" + salery);
    }
}

public class programmerclass extends employe {
    float bonnes =10000;

    void programmersalery(){
        salery=salery+bonnes;

        System.out.println("the programmer salery" + salery);

    }

    public static void main(String[] args) {
        programmerclass obj= new programmerclass();
        obj.display();
       obj.programmersalery();
    }
}
