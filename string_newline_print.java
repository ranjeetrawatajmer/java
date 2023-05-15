import java.util.*;
class sl
{
    public static void main(String arr[]) 
    {
      String st;
      int len,i;

      System.out.print("ENTER A STRING: ");
      Scanner ob = new Scanner(System.in);
      st= ob.next();
      len= st.length();
      for(i=0;i<len;i++)
      {
        System.out.println(st.charAt(i));
    }
      }
      
}