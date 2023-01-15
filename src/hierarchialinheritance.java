
class Animal1{                  //hierarchial inheritance
    void eat(){
        System.out.println(" i can eat");
    }

}
class dog1 extends Animal1{
    void bark(){
        System.out.println("i can bark");

    }
}
class cat extends Animal1{
    void maow1(){
        System.out.println(" i can say maow");
    }
}
public class hierarchialinheritance {
    public static void main(String[] args) {
        cat ob= new cat();
        ob.eat();
        ob.maow1();

        Animal1 obj=new Animal1();
        obj.eat();

        dog1 ob1=new dog1();
        ob1.bark();

    }


}
