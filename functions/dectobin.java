import java.util.Scanner;

public class dectobin {
    public static void decbin(int dec){
       int num=dec;
        int pow=0;
      int bin=0;
      while(dec>0){
        int rem=dec%2;
        bin=bin+(rem*(int)Math.pow(10,pow));
        pow++;
        dec=dec/2;
      }
    System.out.print(bin);
    }
    public static void main(String[] args){
        System.out.println("enter a decimal number");
Scanner sc= new Scanner(System.in); 
        int n=sc.nextInt();
        decbin(n);
    }
    
}
