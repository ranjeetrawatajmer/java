import java.util.*;
class Student
{
    Scanner ob=new Scanner(System.in);
    String name;
    int rollNo,cls;
    void getInfo()
    {
       System.out.print("Enter name : ");
       name=ob.next();
       System.out.print("Enter Rollno : ");
       rollNo=ob.nextInt();
       System.out.print("Enter class : ");
       cls=ob.nextInt();
    }
}

class Marks extends Student
{
    int hindi,english,maths,socalscience;
     int max=400;
    void getmarks()
    {
       System.out.print("Enter marks of hindi : ");
       hindi=ob.nextInt();
       System.out.print("Enter marks of maths : ");
       maths=ob.nextInt();
       System.out.print("Enter marks of english : ");
       english=ob.nextInt();
       System.out.print("Enter marks of SocalScience : ");
       socalscience=ob.nextInt();
       System.out.println("maximum marks : "+max);
       System.out.println("******************(FINAL RESULT)******************");
    }
}


class Result extends Marks
{
    int total;
    float persentage;
    void Calculate()
    {
      total=hindi+maths+english+socalscience;  
      persentage=(total*100)/max;
      
    }
    void ShowResult()
    {
        System.out.println("Student Name = "+name);
        System.out.println("Student class = "+cls);
        System.out.println("Student Roll number = "+rollNo);
        System.out.println();
        System.out.println("Hindi = "+hindi);
        System.out.println("English = "+english);
        System.out.println("Maths = "+maths);
        System.out.println("Hindi = "+socalscience);
        System.out.println();
        System.out.println("Total Marks = "+total);
        System.out.println("Persentage = "+persentage);
        if(persentage>=60)
      {
          System.out.println("First Division");
      }
      else if(persentage<60 && persentage>=40)
      {
          System.out.println("Second Division");
      }
      else if(persentage<40 && persentage>35)
      {
          System.out.println("Third Division");
      }
      else
      {
          System.out.println("Fail");
      }
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

    }
}

class ranjeetji
{
   public static void main(String arr[]) 
   {
     Result obj=new Result();
     obj.getInfo();
     obj.getmarks();
     obj.Calculate();
     obj.ShowResult();
   }
}