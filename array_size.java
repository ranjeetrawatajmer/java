import java.util.*;
class yy
{
    public static void main(String arr[]) 
    {
    int Size,i;
    
    Scanner ob=new Scanner(System.in);
    System.out.print("enter a size= ");
    Size=ob.nextInt();
    String a[]=new String[Size];
    System.out.println("enter a Element= ");

    for(i=0;i<a.length;i++)
    {
      a[i]=ob.next();
    }
    
    System.out.println("you entered= ");
    for(i=0;i<a.length;i++)
    {        
    System.out.println(a[i]);
    }
    }
      
}