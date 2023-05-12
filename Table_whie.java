import java.util.scanner;
class table
{
    public static void main(string arr[])
    {
        int table,a=1,n;
        system.out.print("Enter a table=");
        scanner ob=new scanner(system.in);
        n=ob.nextInt();

        while(a<=10)
        {
        table=a*n;
        system.out.println(n "x" a "=" +table);  
        a++;
        }
    }
}