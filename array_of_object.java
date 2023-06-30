import java.util.*;
class Employ
{
    String empName;
    int code;
    int salary;
    Scanner ob=new Scanner(System.in);
    void set()
    {
        System.out.print("ENTER A NAME=");
        empName=ob.nextLine();
        System.out.print("ENTER A CODE=");
        code=ob.nextInt();
        System.out.print("ENTER A SALARY=");
        salary=ob.nextInt();
    }
    void show()
    {
        System.out.println("ENTER A NAME="+empName);
        System.out.println("ENTER A CODE="+code);
        System.out.println("ENTER A SALARY="+salary);
    }


}
class EmployArray 
{    
  public static void main(String a[])
  {
      Employ emp[]=new Employ[2];
  for(int i=0;i<=1;i++)
  {
   emp[i]=new Employ();
   emp[i].set();
  }
   for(int i=0;i<=1;i++)
   {
   emp[i].show();
  }
}
}