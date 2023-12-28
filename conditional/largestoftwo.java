import java.util.*;
public class largestoftwo{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        if(a>b) {
            System.out.print(a +" is greater");
        }
        else {
            System.out.print(b+" is greater");
        }
    }
}