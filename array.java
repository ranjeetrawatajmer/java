import java.util.*;
class ARRAY
{
    public static void main(String arr[]) 
    {
    int a[]=new int[10],i;
    Scanner ob=new Scanner(System.in);
    System.out.println("enter a number: ");
    for(i=0;i<10;i++)
    {
        a[i]=ob.nextInt();
     
    }

    System.out.println("you entered number: ");
    for(i=0;i<10;i++)
    {
        
      System.out.println(a[i]);
    }
    }
      
}