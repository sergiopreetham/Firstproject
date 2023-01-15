//multiinheritance
class animal{
    void eat()
    {
        System.out.println("i can eat ");
    }
}
class dog extends animal{
    void bark()
    {
        System.out.println("i can bark");
    }
}
class babydog extends dog{
    void weep()
    {
        System.out.println("i can weep");
    }
}

public class multiinheritance {
    public static void main(String[] args) {
        animal Animal =new animal();
        Animal .eat();

        dog Dog =new dog();
        Dog.bark();

        babydog Babydog = new babydog();
        Babydog.weep();
        Babydog.eat();
        Babydog.bark();
    }
}
