import java .util.*;
public class patterns {
    public static void hollowrectangle(int n,int m){   //n is the number of rows and m is the number of columns
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||i==n||j==1||j==m){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }

    }
    public static void rotated_half_pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void inverted_half_pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floyd_triangle(int n){
        int count=1;
        for ( int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }System.out.println();
        }
    }
    public static void zero_onetriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else System.out.print("0");
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
       //1st half
        for(int i=1;i<=n;i++){
            //stars-i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces- 2*n-i
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars-i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i=n;i>=1;i--){
            //stars-i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces- 2*n-i
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars-i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
  
      }
      public static void solidrhombus(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
      }
      public static void hollowrhombus(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n)
                System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
      }
public static void diamond(int n){
   //1st half
    for(int i=1;i<=n;i++){
        //spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=n;i>=1;i--){
        //spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }

}

    public static  void main(String[] args){
// hollowrectangle(10,10);
// System.out.println();
// rotated_half_pyramid(8);
// System.out.println();
// inverted_half_pyramid(9);
// System.out.println();
// floyd_triangle(5);
// System.out.println();
// zero_onetriangle(10);
// System.out.println();
//butterfly(6);
// solidrhombus(5);  
// hollowrhombus(5);
diamond(4);
 }
}
