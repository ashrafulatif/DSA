import java.util.ArrayList;
import java.util.Collections;

public class jobSequenceProblem {
    
    static class Job {
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p){
            id= i;
            profit= p;
            deadline= d;
    }
 }

    public static void main(String[] args) {
        

        int jobInfo [][] = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs = new ArrayList<>();

        //add jobifo into job as obj
        for (int i =0; i< jobInfo.length; i ++){
            jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }

        //sort
        Collections.sort(jobs, (obj1, obj2)-> obj2.profit - obj1.profit);

         ArrayList<Integer> seq = new ArrayList<>();
        int time =0;

        for (int i=0; i<jobs.size();i++){
            Job cur = jobs.get(i);
            if (time<cur.deadline){
                seq.add(cur.id);
                time++;
            }
        }


        System.out.println("max jobs: "+ time);

        for (int i=0; i< seq.size(); i ++){
            System.out.print(seq.get(i)+" " );
        }
    }
}
