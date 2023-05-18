import java.util.*;
class ZZ
{
    public static void main(String arr[])
    {
        int size,i=0,j,c=0;
        int a[];
        Scanner ob= new Scanner(System.in);
         System.out.print("enter size no : ");
        size = ob.nextInt();
        a= new int[size];
        System.out.println("Enter Element : ");
        for( i=0; i<a.length;i++)
        {
            a[i] = ob.nextInt();
        }
        System.out.print("enter serch no : ");
        j= ob.nextInt();
            for(i=0; i<a.length; i++)
            {
                if(j==a[i])
                {
                    c++;
                }
            }
            
         System.out.println("search no count = "+c);
    }
}