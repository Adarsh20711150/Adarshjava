package Telusco;

public class Enhancedforloop {
    public static void main(String[] args)
    {
        int a[]={1,2,3,4};
        for(int i=0;i<4;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println();
        for(int k:a)
        {
            System.out.println(k);
        }
        System.out.println();
        int d[][]=  {           //2d array having same sized arrays inside it
                                //same no of columns in all rows
                        {1,2,3,4},
                        {2,3,4,5},
                        {3,4,5,6}
                    };

        for(int k[]: d)
        {
            for(int l: k)
            {
                System.out.print(" "+l);
            }
            System.out.println();
        }
    }
}
