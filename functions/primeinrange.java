import java.util.Scanner;

public class primeinrange {

    public static boolean isprime(int n){
       for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
        return false;
        }
       }
    return true;
}
public static void primerange(int n){
    for(int i=2;i<=n;i++){
        if(isprime(i)==true){
            System.out.println(i);
        }
    }
}
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter range");
        int n= sc.nextInt();
        primerange(n);

    }
}
