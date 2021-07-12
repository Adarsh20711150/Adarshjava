package firsr;

import java.util.*;
// import java.util.Arrays;

public class SastaAnagram {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first string");
        String str=sc.nextLine();
        System.out.println("Enter second string");
        String str2=sc.nextLine();

        char tempstr[]=str.toCharArray();
        char tempstr2[]=str2.toCharArray();

        int count=0;
        
        if(str.length()==str2.length())
        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<str2.length();j++)
            {
                if(tempstr[i]==tempstr2[j])
                count++;
            }
        }
        if(count==str.length())
        System.out.println("Anagram");
        else
        System.out.println("not Anagram");
        sc.close();

    }
}
