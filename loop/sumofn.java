
import java.util.*;
public class sumofn {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number ");
        int n=sc.nextInt();
        int i=1,sum=0;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("the sum is:"+sum);
        
    }
    
}
