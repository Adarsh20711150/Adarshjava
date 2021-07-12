package Telusco;

// varags stands for variable number of arguments
class Calc
{
    // public int add(int i, int j)
    // {
    //     return i+j;
    // }
    public int add(int ... e)// the arguments from the main class will be in the form of an ARRAY
    // i.e. {1,2,3,4}
    {//now it doesn't matter how many arguments you pass it will perform more than good
        int sum=0;
        for(int i:e)
        {
            sum=sum+i;
        }
        return sum;
    }
}
public class Varags {
    public static void main(String[] args)
    {
        Calc obj =new Calc();
        // System.out.println(obj.add(2,3));//if i want to increase the number of arguments and want to add them 
        // or want to perform certain operations on them 
        // then we have to modify the method in the class
        System.out.println(obj.add(1,2,3,4));

    }
}
