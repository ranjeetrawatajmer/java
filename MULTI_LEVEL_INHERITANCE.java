import java.util.*;
class A
{
    int a;
     Scanner ob=new Scanner(System.in);
    void getA()
    {
        System.out.print("ENTER A VALUE OF A= ");
        a=ob.nextInt();
    }   
    void showA()
    {
      System.out.println("A= "+a);
    }
    }
    class B extends A
    {
    int b;
    void getB()
    {
     System.out.print("ENTER A VALUE OF B= ");
     b=ob.nextInt();
    }
    void showB()
    {
     System.out.println("B= "+b);
    }
    }

    
    class C extends B
    {
      int c;
      void doTotal()
      {
          c=a+b;
      }
    void showC()
    {
     System.out.println("total="+c);
    }
    }


     class rawat
    {
     public static void main(String arr[])
     {
      C obj=new C();
      obj.getA();
      obj.getB();
      obj.showA();
      obj.showB();
      obj.doTotal();
      obj.showC();
     }
    }
