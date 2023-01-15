class Student{
    private int rollno;
    private String name;
    private double cgpa;

    Student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void display(){
        System.out.println(rollno+ " " +name+ " " +cgpa);
    }
    public double findpercentage(){
        double percent=cgpa*10;
        return percent;
    }
}
    public class practice {
        public static void main(String[] args) {
            Student s1=new Student(1056,"karan");
            Student s2=new Student(202,"preetham");

            s1.display();
            s1.findpercentage();
            s1.setCgpa(8.8);
            //System.out.println("Percentage of "+ s1.getName() + " is " + s1.findpercentage());

            System.out.println(" update percentage of " + s1.getName()+ " is " +s1.findpercentage());

            s2.display();
            s2.findpercentage();
            s2.setCgpa(6.6);
            System.out.println(" update percentage of " + s2.getName()+ " is " +s2.findpercentage());



        }
}




