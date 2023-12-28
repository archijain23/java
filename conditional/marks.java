import java.util.*;
public class marks {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.print("enter your marks");
        int marks = s.nextInt();
        String result=(marks>33)?"pass":"fail";
     System.out.println(result);
    }
    
}
