import java.util.*;
//printing reverse of a number
public class reverseofanumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       System.out.println("enter a number:");
       int n =sc.nextInt();
       while(n>0){
        int LD=n%10;
        System.out.print(LD);
        n=n/10;
       }
    }
    
}
