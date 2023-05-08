import java.util.*;
class Swapping
{
public static void main(String arr[])
{
int a,b;
Scanner ob=new Scanner(System.in);
System.out.println("two variable swapping:");
System.out.println("Enter two number:");

System.out.print("a= ");
a=ob.nextInt();
System.out.print("b= ");
b=ob.nextInt();
a=a+b;
b=a-b;
a=a-b;

System.out.println("befour swapping=");
System.out.println("a= "+a);
System.out.println("b= "+b);
}
}