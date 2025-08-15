import java.util.PriorityQueue;

public class weakestSoldier {
 
    public static class Row implements Comparable<Row>{ 
        int soldier, idx;

        public Row(int soldier, int idx){
            this.soldier= soldier;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row r2){
            if(this.soldier == r2.soldier){
                return this.idx - r2.idx;
            }else{
                return this.soldier - r2.soldier;
            }
        }
    }
    public static void main(String[] args) {
        
        int arr [][] = {{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        PriorityQueue<Row> pq = new PriorityQueue<>();
        int k = 2;

        //coutn the soldier
        for (int i = 0; i < arr.length; i++) {
            int count =0;
            for (int j = 0; j < arr[0].length; j++) {
                count += arr[i][j] == 1 ? 1 : 0; 
            }
            pq.add(new Row(count, i));
        }

        for (int i = 0; i < k; i++) {
            System.out.println("R"+pq.remove().idx);
        }

    }
}
