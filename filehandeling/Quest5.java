package filehandeling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Quest5 {
    public static void main(String[] args)    
    {
        File fileobj1=new File("C:\\Users\\Adarsh Rana\\Desktop\\java\\new\\firsr\\adarsh.txt");    
        try{
        Scanner fileobj2=new Scanner(fileobj1);
        int lineNumber=1;
        while(fileobj2.hasNext())
        {
            String line=fileobj2.nextLine();
            System.out.println(lineNumber+":"+line);
            lineNumber++;
        }
        fileobj2.close();
    }
    catch(FileNotFoundException e)
    {
        System.out.println("File is not found");
    }
    }
}
