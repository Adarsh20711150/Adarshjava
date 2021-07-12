package filehandeling;

public class Quest3 {
    public static void main(String[] args)
    {
        int a[]={1,2};
        try
        {
            System.out.println(a[3]);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("Accessing value out of bonds");
        }
        finally
        {
            System.out.println("No matter what, finally will always be executed");
        }
    }
}
