import java.util.*;
class parent
{
    int a,b;
    void setAB()
    {
        Scanner ob=new Scanner(System.in);
        System.out.print("ENTER A VALUE OF A= ");
        a=ob.nextInt();
        System.out.print("ENTER A VALUE OF b= ");
        b=ob.nextInt();
    }
    void showAB()
    {
        System.out.println("A= "+a);
        System.out.println("B= "+b);
    }
    }
    class child extends parent
    {
        int sum,sub,mul,diwaid,re;
        void Calculte()
    {
    sum=a+b;
    sub=a-b;
    mul=a*b;
    diwaid=a/b;
    re=a%b;
    }
    void showTotal()
    {
     System.out.println("sum= "+sum);
     System.out.println("sub= "+sub);
     System.out.println("mul= "+mul);
     System.out.println("diwaid= "+diwaid);
     System.out.println("re= "+re);
    }
}
    class My
    {
        public static void main(String arr[])
        {
            child obj=new child();
            obj.setAB();
            obj.showAB();
            obj.Calculte();
            obj.showTotal();
        }
    }
