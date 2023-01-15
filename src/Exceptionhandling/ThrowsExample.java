package Exceptionhandling;

import java.io.IOException;

public class ThrowsExample {
    public static void main(String[] args){
        try {
            fun();
        }
        catch (IOException e){
            System.out.println("Exception caught");

        }

    }
    public static void fun() throws IOException{
        System.out.println("iam happy");
        throw new  IOException ("demo program");
    }

}
