import java.util.*;

public class evenodd {
    public static void EvenorOdd(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number ");
        }
    }
    public static void main(String[] args){
        EvenorOdd(15);
        EvenorOdd(6);
        EvenorOdd(9);
    }
}
