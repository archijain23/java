import java.util.Scanner;

public class bintodec {
    public static int Binary(int n){
        int pow=0;
       int dec=0;
        while(n>0){
            int LD=n%10;
            dec=dec+(LD*(int)Math.pow(2,pow));
            pow++;
            n=n/10;
        }
        return dec;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in); 
        System.out.println("Enter a binary number");
        int n=sc.nextInt();
        System.out.println(Binary(n));

    }
}
