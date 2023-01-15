package Interface;

interface  Vechile{
    void changegear(int a);
    void speed(int a);
    void applyBrake(int brakes);
}
class Car implements Vechile{



    public void changegear(int gearValue){
        System.out.println("The number of gears in the car "+ gearValue);
    }

    public void speed(int speed){
        System.out.println("The speed in the car "+ speed);
    }

    public void applyBrake(int brakes){
        System.out.println("The number of gears in the car "+ brakes);
    }
}
public class interface1 {
    public static void main(String[] args) {
        Car car = new Car();

        car.speed(80);
        car.changegear(90);
        car.applyBrake(100);
    }
}

