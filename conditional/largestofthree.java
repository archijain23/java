import java.util.*;
public class largestofthree {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("enter first number");
        int a= s.nextInt();
         System.out.println("enter second number");
         int b= s.nextInt();
          System.out.println("enter third number");
          int c= s.nextInt();
          if( a>b && a>c){
            System.out.println(a+" is greatest");
          }
         else if(b>c){
            System.out.println(b+ " is greatest");
         }
         else System.out.println(c+" is greatest");
        }
    
}
