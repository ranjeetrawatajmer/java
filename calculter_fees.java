import java.util.*;
class Calculter_student_fees
{
    public static void main(String arr[]) 
    {
        int c,month,total;
        char ch;
        System.out.println("select your opration= ");
        System.out.println("1=fees=100");
        System.out.println("2=fees=200");
        System.out.println("3=fees=300");
        System.out.println("4=fees=400");
		    System.out.println("5=fees=500");
        System.out.println("6=fees=600");
        System.out.println("7=fees=700");
        System.out.println("8=fees=800");
        System.out.println("9=fees=900");
        System.out.println("10=fees1000");
        System.out.println("11=fees=1100");
        System.out.println("12=fees=1200");
        System.out.print("Enter your class ");
        Scanner ob = new Scanner(System.in);
        
        c=ob.nextInt();

        System.out.print("Enter your month ");
        month=ob.nextInt();
       
        switch (c)
         {
            case 1:
              total=month*100;
              System.out.print("total_fees"+total);  
            break;
           
            case 2:
			total=month*200;
			System.out.print("total_fees"+total);   
             break;
            
             case 3:
			 total=month*300;
			 System.out.print("total_fees"+total);  
           break;
          
           case 4:
		   total=month*400;
		   System.out.print("total_fees"+total);  
            break;
          
			case 5:
			total=month*500;
			System.out.print("total_fees"+total);  
		  break;
		 
		  case 6:
		  total=month*600;
		  System.out.print("total_fees"+total);   
		   break;
		  
		   case 7:
		   total=month*700;
		   System.out.print("total_fees"+total);  
		 break;
		
		 case 8:
		 total=month*800;
		 System.out.print("total_fees"+total);  
		  break;
		
		  case 9:
		   total=month*900;
		   System.out.print("total_fees"+total);  
            break;
          
			case 10:
			total=month*1000;
			System.out.print("total_fees"+total);  
		  break;
		 
		  case 11:
		  total=month*1100;
		  System.out.print("total_fees"+total);   
		   break;
		  
		   case 12:
		   total=month*1200;
		   System.out.print("total_fees"+total);  
		   break;
          default:
          System.out.print("invalid");  
            break;
         }

    }
}