import java.util.*;
class Calculter
{
    public static void main(String arr[]) 
    {
        int a,n,b,r;
        char ch;
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter A 1St Number ");
        a=ob.nextInt();

        System.out.print("Enter A 2St Number ");
        b=ob.nextInt();
        System.out.println("select your opration= ");
        System.out.println("press + ");
        System.out.println("press - ");
        System.out.println("press * ");
        System.out.println("press / ");
        
        ch=ob.next().charAt(0); 
        switch (ch)
         {
            case '+':
              r=a+b;
              System.out.print("sum="+r);  
            break;
           
            case '-':
            r=a-b;
            System.out.print("sub="+r);  
             break;
            
             case '*':
             r=a*b;
             System.out.print("mul="+r);  
           break;
          
           case '/':
           r=a/b;
           System.out.print("divid="+r);  
            break;
          
          
          default:
          System.out.print("invalid");  
            break;
         }

    }
}