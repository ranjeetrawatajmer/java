class Time
{
    int h,m,s;
    Time()
    {
        h=0;
        m=0;
        s=0;
    }
    Time(int x,int y,int z)
    {
        h=x;
        m=y;
        s=z;
    }
   void show()
   {
     System.out.println(h+":"+m+ ":"+s);
    
   }
   Time adddTime(Time tmp)
    {
        Time ob=new Time();
        //ob.h=(this.h + tmp.h)+(this.m+tmp.m)/60;
        //////     (1 +  1)+(40 + 40)/60
        /////          2   + 80 /60
        /////          2  +  1
        /////            3
        ob.s=(this.s + tmp.s)%60;
        /////    (40  + 40)%60
        /////          80 % 60
        /////          20
        ob.m=(this.m+tmp.m )%60 + (this.s+tmp.s)/60;
        ob.h=this.h+tmp.h + (this.m+tmp.m)/60;
        return ob;
    }
}
class Rsr
{
   public static void main(String arr[]) 
   {
    Time d1=new Time(1,1,1);
    Time d2=new Time(1,1,1);
    Time d3=new Time();
    d3 = d1.adddTime(d2);
    d3.show();
   }
}