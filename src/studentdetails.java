public class studentdetails {
    //constructer
    int id;
    String name;
    String address;

    studentdetails()
    {
        System.out.println(" i am the student");
    }
    studentdetails(int i,String n)
    {
        id=i;
        name=n;
    }
    studentdetails(String Add)
    {
        address =Add;

    }

    public void display(){

        System.out.println(id + " " +name);
        System.out.println(address);
    }

    public static void main(String[] args) {
        studentdetails s1 =new studentdetails(256235,"chandru");
        System.out.println("the student 1detail is :" + s1.id + " , " + s1.name );
        studentdetails s2=new studentdetails(1,"preetham");
        System.out.println("the student 1 details :" + s2.id + " , " + s2.name);
        studentdetails s3 =new studentdetails("cena");
        System.out.println( s3.name+"  " + s3.address);
        studentdetails s4= new studentdetails(1,"tamil");
        System.out.println(s4.id+ " " +s4.name);
    }

}
