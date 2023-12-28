import java.util.*;
public class product {
    
    public static int multiply(int a, int b){
        int product=a*b;
       return product;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a:");
        int x=sc.nextInt();
        System.out.println("enter b:");
        int y=sc.nextInt();
        System.out.println("the product is "+ multiply(x,y));
    }
}
