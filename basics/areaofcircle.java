import java.util.*;

public class areaofcircle {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        float radius;
     
        System.out.print("Enter radius:\n");
        radius= sc.nextFloat();
      float area= 3.14f *radius*radius;
        System.out.print("The area of the circle is "+area);
        
    }
    
}
