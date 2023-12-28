import java.util.*;
public class assignment1 {
    public static boolean check(int nums[]){
        for(int i=0;i<nums.length;i++){
            int key=nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(key==nums[j]){
                    return true;
                }
                
            }
        }return false;
    }
    public static void main(String[] args){
        int nums[]={1, 2,3,4,5,6,7,8,9};
        System.out.println(check(nums));
    }  
    
}
