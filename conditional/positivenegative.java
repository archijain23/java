import java.util.*;

public class positivenegative {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    System.out.print("Enter an integer ");
    int a= sc.nextInt();
    if(a>0){
        System.out.print("POSITIVE");
    }
    else if(a==0){
        System.out.print("neither positive nor negative");
    }
    else{
        System.out.print("NEGATIVE");
    }
    }
    
}
