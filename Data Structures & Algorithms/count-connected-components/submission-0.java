class Solution {
    static class Edge{
        int src;
        int dest;
        Edge(int src,int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    public int countComponents(int n, int[][] edges) {
        ArrayList<Edge> graph[] = new ArrayList[n];

        for(int i= 0;i<n;i++){
            graph[i] = new ArrayList<>();
        }

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];

            graph[u].add(new Edge(u,v));
            graph[v].add(new Edge(v,u));
        }

        boolean vis[] = new boolean[n];
        int count = 0;
        for(int i = 0;i<graph.length;i++){
            if(!vis[i]){
                count++;
                countComponentsUtil(graph, vis,i);
            }
        }
        return count;
    }
    public static void countComponentsUtil(ArrayList<Edge> graph[], boolean[] vis,int curr){
        vis[curr] = true;

        for(int i = 0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);

            if(!vis[e.dest]){
                countComponentsUtil(graph, vis,e.dest);
            }
        }
    }
}
