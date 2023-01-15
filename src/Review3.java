
class box{
    String user;
    String book;
    int card;
    String remainderMessage;
}

//class & object

public class Review3 {
    public static void main(String[] args) {
        box obj=new box();
        obj.user="preetham";
        obj.book="author name is brooks";
        box obj3=new box();
        obj3.card=12345685;
        obj.remainderMessage="the message was your due date is 27 ";

        System.out.println(obj.user);
        System.out.println(obj.book);
        System.out.println(obj3.card);
        System.out.println(obj.remainderMessage);


    }
}
