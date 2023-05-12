import java.util.Scanner;
class table
{
    public static void main(String arr[])
    {
        int table,a=1,n;
        System.out.print("Enter table num=");
        Scanner ob=new Scanner(System.in);
        n=ob.nextInt();
        
        do
        {
        table=a*n;
        System.out.println(n + "x"+ a +"=" + table);  
        a++;
        }while(a<=10);
    }
}