

public class increasing {
    public static  void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
        return;
    }
    printInc(n-1);
    System.out.print(n+" ");
    }

    public static void main(String[] ars){
        printInc(5);

    }
    
}
