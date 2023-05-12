import java.util.Scanner;
class table
{
    public static void main(String arr[])
    {
        int table,a=1,n;
        System.out.print("Enter a table=");
        Scanner ob=new Scanner(System.in);
        n=ob.nextInt();

        while(a<=10)
        {
        table=a*n;
        System.out.println(n + "x"+ a +"=" + table);  
        a++;
        }
    }
}