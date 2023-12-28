public class power {
    public static int Power(int x,int n){
        if(n==0){
            return 1;
        } 
        return x*Power(x,n-1);
    }
    public static int optimisedpower(int x,int n){
        
        if(n==0){
            return 1;}
            int half=optimisedpower(x,n/2);
            int halfsq=half*half;
            if(n%2!=0){
                halfsq=x*halfsq;
            }
        
        return halfsq;
    }
    public static void main(String[] args){
        System.out.println(optimisedpower(2,2));
    }
    
}
