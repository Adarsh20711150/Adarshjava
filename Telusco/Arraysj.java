package Telusco;

import java.util.Scanner;
/*
*
*
Arrays Theory
i>1D Arrays
ii> 2D Arrays
iii> jagged Arrays
*
*
*/
class Student
{
    int rollno;
    String name;
}

public class Arraysj {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int nums[]=new int[4]; //default value of all the indeces is "0";
        for(int i=0;i<4;i++)
        System.out.println(nums[i]);
        // System.out.println(nums[4]);//array out of bound exception
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        Student s4=new Student();
        Student s[]={s1,s2,s3,s4};
        System.out.println("Enter the details of four students");
        for(int i=0;i<4;i++)
        {
            System.out.println("Name: ");
            s[i].name=sc.next();
            sc.nextLine();
            System.out.println("RollNo: ");
            s[i].rollno=sc.nextInt();
        }


        System.out.println("\n \n Details of the students are \n \n \n");
        for(int i=0;i<4;i++)
        {
            System.out.println("Name: "+s[i].name+"  RollNo: "+s[i].rollno);
        }
        
        sc.close();
    }
}
