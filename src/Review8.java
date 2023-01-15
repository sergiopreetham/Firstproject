class Coffee
{
    private String order()
    {
        System.out.println("Coffee");
        return null;

    }
    public String getName(){
        return order();
    }
}

public class Review8
{
    public static void main(String args[])
    {
        Coffee c = new Coffee();
        c.getName();

    }
}