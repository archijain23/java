public class operations {
    public static int getIthbit(int n,int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
        }
        else return 1;
    }

    public static int setIthbit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }

    public static int clearIthbit(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    
    public static int updateIthbit(int n, int i,int newbit){
        // if(newbit==0){
        //     return clearIthbit(n,i);
        // }
        // else return setIthbit(n,i);

        n=clearIthbit(n ,i);
        int bitmask=newbit<<i;
        return n|bitmask;
    }
    public static int clearIbits(int n ,int i){
        int bitmask=(~0)<<i;
        return n&bitmask;
    }
public static int clearbitsinrange(int n,int i,int j){
    int a=(~0)<<(j+1);
    int b=(1<<i)-1;
    int bitmask=a|b;
    return n&bitmask;
}
public static boolean isPowerofTwo(int n){
  // if ((n&(n-1)) == 0){
   // return true;
   //}
   return ((n&(n-1)) == 0);
}

public static int countsetbits(int n){
    int count=0;
    while(n>0){
        if((n&1)!=0){
            count++;
        }
        n=n>>>1;
    }return count;
}

public static int Fastexpo(int a,int n){
    int ans=1 ;
    while(n>0){
        if((n&1)!=0){
            ans=ans*a;
        }
        a=a*a;
        n=n>>1;
    }return ans;
}
    public static void main(String[] args){
    //    System.out.println(getIthbit(5,1));
    //     System.out.println(setIthbit(5,1)); 
        System.out.println(Fastexpo(8,2));

    }
}
