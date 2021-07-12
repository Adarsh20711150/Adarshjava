package Telusco;



public class TwodimensionalArray {
    public static void main(String[] args)
    {
        int a[]={1,2,3,4};
        int b[]={2,3,4,5};
        int c[]={3,4,5,6};
        System.out.println("2d Array");

        int d[][]=  {           //2d array having same sized arrays inside it
                                //same no of columns in all rows
                        {1,2,3,4},
                        {2,3,4,5},
                        {3,4,5,6}
                    };
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(d[i][j]+" ");
            }
            System.out.println();
        }
        
        int e[][]={            //jagged array
                    {1,2},
                    {2,3,4},
                    {3,4,5,6,7},
                    {4,5,6}
                };
        System.out.println("\n");
        System.out.println("Jagged Array:");       
        for(int i=0;i<e.length;i++)
        {
            for(int j=0;j<e[i].length;j++)
            {
                System.out.print(e[i][j]+" ");
            }
            System.out.println();
        }
    }
}
