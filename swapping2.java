import java.util.Scanner;
class Main
{
    public static void main (String arr[])
    {
        int a,b,c;
        Scanner ob = new Scanner(System.in);
        System.out.println("enter two no . ");
        a = ob .nextInt();
        b = ob .nextInt();
        c=a;
        a=b;
        b=c;
        
        System.out.println("swap=a="+a);
         System.out.println("b="   +b);
        
    }
}