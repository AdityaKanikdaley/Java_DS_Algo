package apniKaksha.Graphs;

import java.util.ArrayList;

// refer code: https://takeuforward.org/data-structure/depth-first-search-dfs-traversal-graph/
// refer tutorial: https://www.youtube.com/watch?v=uDWljP2PGmU&list=PLgUwDviBIf0rGEWe64KWas0Nryn7SCRWw&index=7
// Time Complexity : O(N+E), where N = Nodes , E = travelling through adjacent nodes
// Space Complexity : O(N+E) + O(N) + O(N), where Space for adjacency list, visited array, queue data structure

public class DFS {
    public static void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> storeDfs) {
        storeDfs.add((node));
        vis[node] = true;

        for(Integer it : adj.get(node))
            if(!vis[it])
                dfs(it, vis, adj, storeDfs);
    }

    public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> storeDfs = new ArrayList<>();

        // here we are considering 0 based indexing for graph. So we make visited[V] not visited[V+1]
        boolean[] vis = new boolean[V];
        // as it's 0 based indexing, we go from 0 to <V not 1 to <= V
        for(int i=0; i<V; i++)
            if(!vis[i])
                dfs(i, vis, adj, storeDfs);

        return storeDfs;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V = 7;
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(1).add(6);
        adj.get(2).add(1);
        adj.get(2).add(4);
        adj.get(6).add(1);
        adj.get(6).add(4);
        adj.get(4).add(2);
        adj.get(4).add(6);
        adj.get(3).add(5);
        adj.get(5).add(3);

        System.out.println("Graph:");
        for (int i = 0; i < V; i++)
            System.out.println(i + " : " + adj.get(i).toString());

        ArrayList<Integer> ans = dfsOfGraph(V, adj);
        System.out.println("Answer DFS: " + ans);
    }
}
