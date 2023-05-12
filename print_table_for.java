import java.util.Scanner;
class table
{
    public static void main(String arr[])
    {
        int table,a,n;
        System.out.print("Enter table num=");
        Scanner ob=new Scanner(System.in);
        n=ob.nextInt();
2
        for(a=1;a<=10;a++)
        {
        table=a*n;
        System.out.println(n + "x"+ a +"=" + table);  
        
        }
    }
}