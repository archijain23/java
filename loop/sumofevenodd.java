//program that reads a set of integers,and then prints the sum of the even and odd integers.
import java.util.*;
public class sumofevenodd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int evensum=0;
        int oddsum=0;
        int choice;
        do{
            System.out.println("Enter a number:");
            int n=sc.nextInt();
            if(n%2==0){
                evensum+=n;
            }
            else{
                oddsum+=n;
            }
            System.out.println("Do you want to continue?,press 1 for yes and 0 for no..");
             choice=sc.nextInt();
        }while(choice==1);
        System.out.println("Even number sum is "+evensum);
        System.out.println("Odd number sum is "+oddsum);
    }
}
