package AbstractExample;

abstract class Animal{
    abstract  void makeSound();               //abstract
    public void eat(){
        System.out.println("I am Eating");
    }
}
class Dog extends  Animal{
    public void makeSound(){
        System.out.println("I am barking");
    }
}
class Cat extends  Animal{
    public void makeSound(){
        System.out.println("I will do meawwww");
    }
    public void wagTail(){
        System.out.println("I wag my tail");
    }
}


public class Abstract {
    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.makeSound();
        obj.wagTail();
        obj.eat();

        Dog obj1=new Dog();
        obj1.makeSound();
        obj1.eat();
    }
}

