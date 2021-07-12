package filehandeling;

import java.io.File;


public class Quest4 {
    public static void main(String[] args)
    {
        File myobj=new File("C:\\Users\\Adarsh Rana\\Desktop\\java\\new\\firsr\\adarsh.txt");
        if(myobj.exists())
        {
            System.out.println("File exists");
            System.out.println("File is writable: "+myobj.canWrite());
            System.out.println("File is readable: "+myobj.canRead());
            System.out.println("Size of file in bytes: "+myobj.length());
            System.out.println("Is file a directory: "+myobj.isDirectory() );
        }
        else
        System.out.println("File does not exists");

        
    }
}
