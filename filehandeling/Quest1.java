package filehandeling;

public class Quest1 {
    public static void main(String[] args)
    {
        int ar[]={1,2,3,4};
        try
        {
            System.out.println(ar[7]);
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("Index is out of bounds");
        }


    }
    
}
