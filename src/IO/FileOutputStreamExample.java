package IO;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.io.FileOutputStream;
public class FileOutputStreamExample {
    public static void main(String args[]){
        try{
            FileOutputStream fout=new FileOutputStream("C:\\Users\\sergi\\OneDrive\\Desktop\\preetha.txt");
            fout.write(68);
            fout.close();
            System.out.println("success...");
        }catch(Exception e){System.out.println(e);}
    }
}