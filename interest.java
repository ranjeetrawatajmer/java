import java.util.*;
class Interest
{
public static void main(String arr[])
{
int p,t,r;
float total_amount;

Scanner a=new Scanner(System.in);

System.out.print("enter princepal amoumt: ");
p=a.nextInt();

System.out.print("enter Rate: ");
r=a.nextInt();

System.out.print("enter time: ");
t=a.nextInt();

total_amount=(p*r*t)/100;
System.out.print("Total amount="+total_amount);
}
}