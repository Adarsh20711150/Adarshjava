package Telusco;


 class Calculator{
    public int calculators(int a, int b)
    {
        return a+b;
    }
    public int calculators(int a, int b, int c)
    {
        return a+b+c;
    }
}
public class Overloading {
    public static void main(String[] args)
    {
        Calculator obj=new Calculator();
        System.out.println(obj.calculators(4,5));
        System.out.println(obj.calculators(9,5,6));
    }
}
