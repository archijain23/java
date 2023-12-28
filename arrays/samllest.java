import java.util.*;

public class samllest {
 public static int getsmallest(int number[]){
    int smallest= Integer.MAX_VALUE;
    for(int i=0;i<number.length;i++){
        if(number[i]<smallest){
            smallest=number[i];
        }
    }return smallest;
 }   
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int number[]=new int[5];
    System.out.println("enter 5 numbers");
    for(int i=0;i<number.length;i++){
        number[i]=sc.nextInt();
    }
    System.out.println("Smallest number is "+getsmallest(number));
 }
}
