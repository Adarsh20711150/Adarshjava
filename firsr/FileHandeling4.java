package firsr;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileHandeling4 {
    public static void main(String[] args)
    {
        try 
        {
            File myobj= new File("C:\\Users\\Adarsh Rana\\Desktop\\java\\new\\firsr\\adarsh_rana.txt");
            Scanner myreader =new Scanner (myobj);
            while(myreader.hasNextLine())
            {
                String data=myreader.nextLine();
                System.out.println(data);
            }
            myreader.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
