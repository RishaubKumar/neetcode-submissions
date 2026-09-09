/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals.isEmpty()) return true;
        boolean canAttend = true;

        int activities[][] = new int[intervals.size()][3];
        for(int i =0;i<intervals.size();i++){
            activities[i][0] = i;
            activities[i][1] = intervals.get(i).start;
            activities[i][2] = intervals.get(i).end;
        }

        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));

        int lastEnd = activities[0][2];

        for(int i = 1;i<activities.length;i++){
            if(activities[i][1] >= lastEnd){
                canAttend = true;
                lastEnd = activities[i][2];
            }else{
                return false;
            }
        }
        return canAttend;
    }
}
