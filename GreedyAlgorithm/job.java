import java.util.*;
public class job {
    static class Job{
        int profit;
        int deadline;
        int id;

        public Job(int i,int d,int p){
            id=i;
            deadline=d;
            profit=p;
        }
    }

    private int deadline;

    public static void main(String args[]){
        int jobsInfo[][]={{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs= new ArrayList<>();
         for(int i=0;i<jobsInfo.length;i++){
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
         }

         //sorting arraylist of objects
         Collections.sort(jobs, (obj1 , obj2) -> obj2.profit-obj1.profit);

         ArrayList<Integer> seq=new ArrayList<>();
         int time =0;
         for(int i=0;i<jobs.size();i++){
            Job curr=jobs.get(i);
            if(curr.deadline>time){
              seq.add(curr.id);
              time++;
            }
         }
System.out.println("max jobs:"+seq.size());
for(int i=0;i<seq.size();i++){
    System.out.print(seq.get(i)+" ");
}

    }
}