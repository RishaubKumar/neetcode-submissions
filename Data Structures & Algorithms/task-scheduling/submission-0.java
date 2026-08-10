class Solution {
    public class Interval implements Comparable<Interval>{
        int freq;
        int exe;
        public Interval(int f,int e){
            freq = f;
            exe = e;
        }
        public int compareTo(Interval i){
            return i.freq - this.freq;
        }
    }
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character , Integer> hm = new HashMap<>();

        for(int i = 0;i<tasks.length;i++){
            hm.put(tasks[i],hm.getOrDefault(tasks[i],0)+1);
        }
        PriorityQueue<Interval> pq = new PriorityQueue<>();

        for(Character ch : hm.keySet()){
            int f = hm.get(ch);
            pq.add(new Interval(f,0));
        }
        Queue<Interval> q = new LinkedList<>();
        int time = 0;

        while(!q.isEmpty() || !pq.isEmpty()){
            time++;
            while(!q.isEmpty() && q.peek().exe <= time){
                pq.add(q.poll());
            }
            if(!pq.isEmpty()){
                Interval curr = pq.poll();
                curr.freq--;
                
                if(curr.freq >0){
                    curr.exe = time+n+1;
                    q.add(curr);
                }
            }
            
        }
        return time;
    }
}
