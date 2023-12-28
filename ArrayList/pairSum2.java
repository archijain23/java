import java.util.*;

public class pairSum2 {
    public static boolean pairSum(ArrayList<Integer> list,int target){
        int n=list.size();
        int bp=-1;
        for(int i=0;i<n;i++){
          if(list.get(i)>list.get(i+1)){//breaking point
            bp=i;
            break;
          }
        }
        int lp=bp+1;
        int rp=bp;
        while(lp!=rp){
            //case1
            if((list.get(lp)+list.get(rp))==target){
                return true;
            }
            if((list.get(lp)+list.get(rp))<target){
                lp=(lp+1)%n;
            }
            else{
                rp=(n+rp-1)%n;
            }

        }
        return false;
    }
    public static void main(String[] args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(11);
       list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        
        System.out.println(pairSum(list,16));

    }
}
