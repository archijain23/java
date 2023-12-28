import java .util.*;
public class evenodd {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number");
        int a = s.nextInt();
        // if(a%2==0){
        //     System.out.println("Even");
        // }
        // else{System.out.println("odd");}
        //ternary operator
        String result=((a%2)==0)?"even":"odd";
        System.out.println(result);
    }
}
