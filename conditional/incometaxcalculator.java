import java.util.*;
public class incometaxcalculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your income");
        int income= sc.nextInt();
        float tax;
        if(income<500000){
           tax=0;
        }
        else if(income>500000 && income<=1000000){
            tax = (float) (income*0.2); 
        }
        else{
            tax = (float) (income*0.2);
        }
        System.out.println("Your tax is "+ tax);
    }
}
