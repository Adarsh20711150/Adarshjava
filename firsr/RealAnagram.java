package firsr;
import java.util.*;
// import java.lang.Math;
import java.util.Arrays;


public class RealAnagram {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first string");
        String str=sc.nextLine();
        System.out.println("enter second string");
        String str2=sc.nextLine();

        char tempstr[] =str.toCharArray();
        Arrays.sort(tempstr);
        char tempstr2[]=str2.toCharArray();
        Arrays.sort(tempstr2);
        
        if(Arrays.equals(tempstr,tempstr2))
        {
            System.out.println("Anagram");
        }
        else 
        System.out.println("not anagram");
        
        sc.close();
    }
}
