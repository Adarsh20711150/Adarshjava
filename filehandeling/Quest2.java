package filehandeling;


class MyException extends Exception
    {
        public MyException(String s)
        {
            super(s);
        }
    }

public class Quest2 {
    public static void main(String[] args)
    {
        int balance_amount=10000;
        int transactio_amount=1200;
        try
        {
        throw new MyException("Transaction amount is more than balance");
        }
        catch( MyException e)
    {
        System.out.println("Caught");
        System.out.println(e.getMessage());
    }
    }
    


    
}
