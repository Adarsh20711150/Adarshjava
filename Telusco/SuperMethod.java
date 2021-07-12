package Telusco;


class A
{
    public A()
    {
        System.out.println("In A");
    }
    public A(int i)
    {
        System.out.println("in A int");
    }
}
class B extends A
{
    public B()
    {
        super();//always written in the first of the constructor 
        System.out.println("In B");
    }
    public B(int i)
    {
        super(i); //default is super(); but we can make it parametrized according to our needs
        //now it will call only the parametrized constructor
        System.out.println("in B int");
    }
}
public class SuperMethod {
    public static void main(String[] args)
    {
        A obj1=new A(5);//constructor is automatically called at the time of object creation

        System.out.println();
        B obj2=new B(5);
        // obj2.B();
        //Since B is a child class of super class A
        //so the constructor of A is called first and then the constructor of B called automatically
        //Even with the parametrized constructor of the extending class the non parametrized constructor of the 
        //parent / super class will be called.



        // Why calling only non-parametrized constructor no the parametrized one?
        //
        // So the reason is that every constructor in the child class has a method called super();
        // therfore the super is called always before the sub class constructor;
        // the default super(); method in the constructor of the sub class is non-parametrized
        // therefore only called non parametrized 
        // if we mention parameter in the super class then will call the paraametrized one


    }
    


}
