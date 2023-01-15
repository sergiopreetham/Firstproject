class dispay{
    //function overloading

    void dispay(int rollno)
        {
        System.out.println("first display function");
        System.out.println("the rollno" + rollno);
    }
    void dis(int rollno,int age)
        {
        System.out.println("second display function");
        System.out.println(" the rollno " +rollno);
        System.out.println("the age " + age);

    }
    void dis(int rollno,int age,int dob)
        {
        System.out.println("third display function");
        System.out.println("the rollno" + rollno);
        System.out.println("the age " + age);
        System.out.println("the dob " + dob);

    }
}
public class classABC {
    public static void main(String[] args) {
        dispay ob=new dispay();
        ob.dispay(1);
        ob.dis(1,2);
        ob.dis(1,2,4);

    }
}
