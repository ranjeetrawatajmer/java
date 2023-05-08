import java.util.*;
class Persentage
{
public static void main(String arr[])
{
int hindi,english,mathe,total;
float persentage;
System.out.println("calculate marks & persentage=");
Scanner ob=new Scanner(System.in);

System.out.print("Enter a hindi marks=");
hindi=ob.nextInt();

System.out.print("Enter a English marks=");
english=ob.nextInt();

System.out.print("Enter a Mathe marks=");
mathe=ob.nextInt();
 
total=hindi+english+mathe;
persentage=(total*100)/300;

System.out.println("TOTAL MARKS="+total);
System.out.println("PERSENTAGE="+persentage);
}
}