package AbstractExample;

abstract class bank{
    abstract void rateofintreast();
    public void display(){
            System.out.println("banks are have different rates");
   }
        }
        class sbi extends bank {
    public void rateofintreast(){
        System.out.println("sbi have 7% of interest");
    }
        }
        class icici extends bank{
    public void rateofintreast(){
        System.out.println("icici have 12% of interest");
    }
        }
        class tmb extends bank{
    public void rateofintreast(){
        System.out.println("tmb have 17% of interest");
    }
        }

public class Abstracpractice {
    public static void main(String[] args) {
        sbi obj=new sbi();
       // obj.display();
        obj.rateofintreast();
        icici def =new icici();
       // def.display();
        def.rateofintreast();
        tmb ob=new tmb();
       // ob.display();
        ob.rateofintreast();
    }
}
