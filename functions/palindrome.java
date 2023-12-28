import java.util.*;
public class palindrome {
    public static int reverse(int n){
        int rev=0;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
return rev;
    }
    public static boolean palindrome(int n){
        if(n==reverse(n)){
            return true;
        }
        else return false;
    }
    
    public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    System.out.println("enter a number");
    int n=input.nextInt();
    if(palindrome(n)){
        System.out.println(n+" is a palindrome");
    }
    else System.out.println(n+" is not a palindrome");

    }
}
