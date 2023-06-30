import java.util.*;

// import java.util.ArrayList;
// import java.util.Scanner;
//import java.util.ArrayList;
public class MyProgram {
    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        ArrayList <String> Atd = new ArrayList<>();
        Atd.add("Sunil");
        Atd.add("Rahul");
        Atd.add("Suraj");
        Atd.add("Rakesh");
        Atd.add("Mohan");


        System.out.println("take Attendance : ");
        String take = ob.next();

        for(int i=0;i<Atd.size();i++){
           String name = Atd.get(i);
            if(name.equals(take)){
            System.out.println("Present");
            break;
        
            }else{
                System.out.println("Apsent");
                break;
            }
           
        }
        
    }
}
