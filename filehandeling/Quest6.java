package filehandeling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Quest6 {
    public static void main(String[] args)    
    {
        File fileobj=new File("C:\\Users\\Adarsh Rana\\Desktop\\java\\new\\firsr\\adarsh.txt");
        if(fileobj.exists())
        {
            try
            {
                Scanner filescan=new Scanner(fileobj);
                int no_of_lines=0;
                // int no_of_characters=0;
                while(filescan.hasNext())
                {
                    String line=filescan.nextLine();
                    no_of_lines++;
                    
                }
                filescan.close();
                System.out.println("Total number of lines: "+no_of_lines);
                System.out.println("Total number of characters: "+ (fileobj.length()-2*no_of_lines));//every character is of one byte and every enter is of 2 byte.
            }
            catch(FileNotFoundException e)
            {
                System.out.println("File does not exist");
            }
        }
        else 
        {
            System.out.println("File does not exists");
        }
    }
}
