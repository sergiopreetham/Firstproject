public class Review7 {
    String stdName;         //parameter  constructer
    int stuId;
    Review7(int id,String name){
        stuId=id;
        stdName=name;
    }

    public void hh(){
        System.out.println("the student id & name :" + stuId + " "+ stdName);
    }

    public static void main(String[] args) {
        Review7 obj=new Review7(27198789,"preetham");
        Review7 obj1=new Review7(253322,"chandru");
       // System.out.println("the student id & name :" + obj.stuId + " "+ obj.stdName);
        obj.hh();
        obj1.hh();

    }
}
//constructor doesn't have return type
//constructor should be like class name
