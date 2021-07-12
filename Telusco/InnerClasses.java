package Telusco;

// import java.util.Scanner;


/*
*
*
Inner class and its types
i> Member Class / Non-Static Class
ii> Static Class
iii> Anonymous Class
*
*
*/












class Outer{  //Outer.class file
    int a;//  Member variable
    static int i=10;
    
    public void show()//  Member method
    {

    }

   public static class Inner{   // Member Class  // Outer$Inner.class file
        public void display()
        {
            System.out.println("inside the display method of the inner class ");
        }
    }
}
public class InnerClasses { //InnerClasses.class file
    public static void main (String[] args)
    {   
        Outer obj=new Outer();
        obj.show();
        System.out.println("In the main class");
        // Inner obj1=new Outer();
        // Outer.Inner obj1= obj.new Inner();// if Inner is a non static class
        Outer.Inner obj1= new Outer.Inner();// if Inner is a static class
        obj1.display();
        System.out.println(Outer.i);
    }
}
