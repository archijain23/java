import java.util.*;
public class combination {
    public static int factorial (int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact*=i;
        }
        return fact;
    }
    public static int combination(int n,int r){
        int nCr=factorial(n)/(factorial(r*factorial(n-r)));
    return nCr;}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n");
    int n=sc.nextInt();
    System.out.println("enter r");
    int r=sc.nextInt();
    System.out.println("answer:"+combination(n,r));
}
}
