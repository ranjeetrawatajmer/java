import java.util.*;
class Main
{
public static void main(String arr[])
{
int a,b,c;
Scanner ob=new Scanner(System.in);
System.out.println("three variable swapping:");
System.out.println("Enter two number:");

System.out.print("a= ");
a=ob.nextInt();
System.out.print("b= ");
b=ob.nextInt();
c=a;
a=b;
b=c;
        
System.out.println("befour swapping=");
System.out.println("a= "+a);
System.out.println("b= "+b);
}
}