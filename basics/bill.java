import java.util.*;
public class bill {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the price of pencil:");
        float a= sc.nextFloat();
        System.out.print("enter the price of pen:");
        float b= sc.nextFloat();
        System.out.print("Enter the price of eraser:");
        float c= sc.nextFloat();
        float sum=a+b+c;
        float GST=(18*sum)/100;
        System.out.print("Your bill including GST is "+ (sum+GST));

    }
    
}
