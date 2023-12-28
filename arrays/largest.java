import java.util.*;

public class largest {
    public static int getlargest(int numbers[]){
         int largest= Integer.MIN_VALUE;
         for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
         }return largest;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int numbers[]=new int[5];
        System.out.println("enter 5 numbers");
        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println("the largest number is "+getlargest(numbers));
    }
}
