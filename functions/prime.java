public class prime {
    //code for n>=2
    public static boolean isprime(int n){
    boolean prime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
        prime=false;
        break;
       }
    }
    return prime;
}

 public static void main(String[] args){
    System.out.println(isprime(12));

 }
}
