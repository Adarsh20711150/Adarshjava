package Telusco;

class Demo
{
    int a=3;
    int b=2;
    static int c=1;
    static String d;
    static {      //static blocks are made so that 
                 // the static bloc is executed only once
        d="Adarsh Rana";
    }

    public Demo()
    {
        System.out.println("in the Demo");
    }
    public void show()
    {
        System.out.println(a+" : "+b+" : "+c);
    }
}
public class StaticKeyword {
    public static void main(String[] args)
    {
       Demo obj=new Demo();
        obj.show();
        System.out.println("in the main");
        System.out.println(obj.a);
        System.out.println(obj.b);
        // System.out.println(obj.c);
        System.out.println(Demo.c);
        System.out.println(Demo.d);
        // System.out.println(obj.d);
        //static method 
        // static variable 
        // static block 
        //some properties of static keyword 

        /*
        first of all 
        static variable is not loaded in heap for each object 
        instead it loads in a class loader which is same for all the objects
        since class loads only once and object is allocated heap 
        every time it is called.

        a static varibale is required when we want to set a variable value same 
        for all the objects like CEO of a company for all the employees.
        it is prety much same as the static word in c where it is not loaded for every 
        function stack.

        Since static variables and methods are not loaded in heap instead loaded in class
        loader so they can be called even without object of the class.
        just with the name of class 
                            for eg. className.static_variable_method();

        before any method and object the class  is loaded so 
        first static method, variable is called then oter things
        */
        /*
        second thing is static block 
        it is a block of code which is used to define or initialize the static  keywords.
        
        */

        /*
        static methods are the methods witch are called without any object so 
        the static before the main means it can be called without any object 
        Strings[] args means that it takes strings as arguments 

        In java the main method with string arguments is called before anything
        so main method with String[] args is the entry point for the program

        */
    }
}
