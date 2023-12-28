import java.util.*;
public class reverse {
    public static void reverse(int number[]){
        int first=0,last=number.length-1;
    //swap
    while(first<last){
    int temp=number[last];
    number[last]=number[first];
    number[first]=temp;
    first++;
    last--;
    }
}
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       
        int numbers[]=new int[5];
        System.out.println("enter elements of an array");
        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }
        reverse(numbers);
        System.out.println("reverse of the array");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
