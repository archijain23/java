import java.util.*;

public class activity {
   public static void main(String args[]){
    int start[]={1,3,0,5,8,5};
    int end[]={2,4,6,7,9,9};
    //end time basis sorted

    int maxAct=0;

    ArrayList<Integer> ans=new ArrayList<>();
    ans.add(0);
    int lastend=end[0];
    for(int i=0;i<end.length;i++){
        if(start[i]>=lastend){
            //activity select
            maxAct++;
            ans.add(i);
            lastend=end[i];

        }
    }
    System.out.println("maximum activities="+maxAct);
    for(int i=0;i<ans.size();i++){
        System.out.println("A"+ans.get(i));
    }
   } 
}
