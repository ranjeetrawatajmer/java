class Time
{
    int h,m;
    Time()
    {
        h=0;
        m=0;
    }
    Time(int x,int y)
    {
        h=x;
        m=y;
    }
   void show()
   {
     System.out.println(h+" : "+m);
    
   }
   Time adddTime(Time tmp)
    {
        Time ob=new Time();
        ob.h=(this.h + tmp.h)+(this.m+tmp.m)/60;
        //////     (1 +  1)+(40 + 40)/60
        /////          2   + 80 /60
        /////          2  +  1
        /////            3
        ob.m=(this.m + tmp.m)%60;
        /////    (40  + 40)%60
        /////          80 % 60
        /////          20
        return ob;
    }
}
class MyTime
{
   public static void main(String arr[]) 
   {
    Time d1=new Time(1,40);
    Time d2=new Time(2,40);
    Time d3=new Time();
    d3 = d1.adddTime(d2);
    d3.show();
   }
}