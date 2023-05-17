import java.util.*;
class x
{
    public static void main(String arr[]) 
    {
    int a[]=new int[5];
    int i=0;
    float avg;
    int sum=0,oc=0,ec=0;
    Scanner ob=new Scanner(System.in);
    for(i=0;i<=4;i++)
    {
      System.out.print("enter a no: ");
      a[i]=ob.nextInt();
    }
        for(i=0;i<=4;i++)
        {
          sum=sum+a[i];
          if(a[i]%2==0)
          ec++;
          else
          oc++;

        }
        avg=sum/5;
        System.out.println("sum= "+sum);
        System.out.println("even= "+ec);
        System.out.println("odd= "+oc);
        System.out.println("avg= "+avg);
      
    
    }
      
}