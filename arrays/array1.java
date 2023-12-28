import java.util.*;

public class array1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    
        int marks[]=new int[5];
        System.out.println("enter elments of array");
        for(int i=0;i<marks.length;i++){
         marks[i]=sc.nextInt();
        }
      for( int i=0;i<marks.length;i++){
        System.out.println("marks at "+i+" is "+ marks[i]);
      }
    }
    
}
