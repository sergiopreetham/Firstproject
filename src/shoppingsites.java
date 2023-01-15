class shopping{
    void makepayment(String name,long password){
        System.out.println("its is internet banking");
    }
    void makepayment(long mobileNo,String password){
        System.out.println("its is UPI");
    }
    void makepayment(long cardNo,int cvv,String name){
        System.out.println("its is debit");
    }
}

public class shoppingsites {
    public static void main(String[] args) {
        shopping obj=new shopping();
        obj.makepayment("preetham",742458556);
        System.out.println();
        obj.makepayment(7402666946L,"15*&566");
        obj.makepayment(254785544541L,455,"preetham");

    }
}
