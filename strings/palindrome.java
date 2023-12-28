import java.util.*;

public class palindrome {
    public static boolean isPalindrome(String str){
        for(int i =0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }System.out.println("yay!! it is a palindrome");
        return true;
    }
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a word:");
    String str=sc.next();
    System.out.println(isPalindrome(str));
  // isPalindrome(str);
}
    
}
