package firsr;


import java.io.File;
import java.io.IOException;

public class FileHandeling2 {
    public static void main(String[] args)
    {
        File myobj=new File("C:\\Users\\Adarsh Rana\\Desktop\\java\\new\\firsr\\adarsh.txt");
        if(myobj.exists())
        {
            System.out.println("File name: "+myobj.getName());
            System.out.println("Absolute path: "+ myobj.getAbsolutePath());
            System.out.println("Writeable: "+myobj.canWrite());
            System.out.println("Readable: "+myobj.canRead());
            System.out.println("File size in bytes: "+ myobj.length());
        }
        else 
        {
            System.out.println("The file does not exists.");
        }
    }
}
