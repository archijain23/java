import java.util.*;
import java.io.*;
// code for printing (a+2 to the power 0*b),(a+( 2pow 0*b)+(2 pow 1*b)),........(a+(2 pow 0*b)+(2 pow 1*b)+...(2 pow n-1*b))
class solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++){
                int pow=0;int sum=0;
                while(pow<=j){
                    int count=(int)Math.pow(2,pow);
                    sum=sum+count;
                    pow++;
                    
                }
                System.out.print(a+(b*sum)+" ");
            }System.out.println();
        }
        in.close();
        
    }
}

