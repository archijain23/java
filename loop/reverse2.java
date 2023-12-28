import java.util.*;
public class reverse2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int rev=0;
        while(n>0){
            
         int  LD=n%10;
            rev=(rev*10)+LD;
            n=n/10;
        }
System.out.println(rev);
    }
    
}
