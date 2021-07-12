package firsr;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileHandeling3 {
    public static void main(String[] args)
    {
        try
        {
            FileWriter myWriter = new FileWriter("C:\\Users\\Adarsh Rana\\Desktop\\java\\new\\firsr\\adarsh_rana.txt");
            myWriter.write("Java is porminent programming language of the millenium.");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }
        catch (IOException e)
        {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
