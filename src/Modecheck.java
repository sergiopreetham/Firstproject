class ReserchStudent{
    private String name;
    private int year;
    private String researcharea;
    private static final int annualfee=10000;

    public ReserchStudent(String name,int year,String researcharea){
        this.name=name;
        this.year=year;
        this.researcharea=researcharea;
    }
    public String getName(){
        return "Name : "+  name+ "\n" + "Fees : " +computefee();
    }
    public float computefee(){
        return ReserchStudent.annualfee*this.year;

    }
    public float computefee(float annualfee){
        return annualfee*this.year;
    }
    public void display(){
        System.out.println(getName());

    }

}
class Student1{
    private String name;
    private int year;
    private static final int annualfee=10000;

    public Student1(String name,int year){
        this.name=name;
        this.year=year;
    }
    public String getName(){
        return "Name : "+  name+ "\n" + computefee() ;
    }
    public int computefee(){

        return Student1.annualfee*this.year;
    }
    public int computefee(int annualfee) {

        return annualfee * this.year;
    }
    public void display(){
        System.out.println(getName());

    }

}


public class Modecheck {
    public static void main(String[] args) {
        Student1 s1=new Student1("preetham",2);
         s1.display();
        System.out.println(s1.computefee(1000));


        ReserchStudent s2=new ReserchStudent("chan",3,"Mechanical enineering");
        s2.display();
        System.out.println(s2.computefee(2000));




    }
}