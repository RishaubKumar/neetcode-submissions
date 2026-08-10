class Solution {
        static class Point implements Comparable<Point>{
                int x;
                        int y;
                                int distsq;
                                        public Point(int x,int y ,int d){
                                                    this.x = x;
                                                                this.y = y;
                                                                            this.distsq = d;
                                                                                    }
                                                                                            @Override
                                                                                                    public int compareTo(Point p){
                                                                                                                return this.distsq - p.distsq; // this is sorted distance in ascending order;
                                                                                                                        }
                                                                                                                            }
                                                                                                                                public int[][] kClosest(int[][] points, int k) {
                                                                                                                                        PriorityQueue<Point> pq = new PriorityQueue<>();
                                                                                                                                                int[][] ans = new int[k][2];

                                                                                                                                                        for(int i = 0;i<points.length;i++){
                                                                                                                                                                    int x = points[i][0];
                                                                                                                                                                                int y = points[i][1];
                                                                                                                                                                                            int dissqt = x*x + y*y; // if square is greater than the square root  is also greater

                                                                                                                                                                                                        pq.add(new Point(x,y,dissqt));
                                                                                                                                                                                                                }
                                                                                                                                                                                                                        for(int i = 0;i<k;i++){
                                                                                                                                                                                                                                    Point p =  pq.poll();
                                                                                                                                                                                                                                                // pq.remove();

                                                                                                                                                                                                                                                            ans[i][0] = p.x;
                                                                                                                                                                                                                                                                        ans[i][1] = p.y;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                        return ans;
                                                                                                                                                                                                                                                                                            }
}