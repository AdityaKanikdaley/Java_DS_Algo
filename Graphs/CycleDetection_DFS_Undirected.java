package apniKaksha.Graphs;

import java.util.ArrayList;

// refer tutorial: https://www.youtube.com/watch?v=Y9NFqI6Pzd4&list=PLgUwDviBIf0rGEWe64KWas0Nryn7SCRWw&index=8
// Time Complexity: O(N+E), N is the time taken and E is for traveling through adjacent nodes overall.
// Space Complexity: O(N+E) + O(N) + O(N) , space for adjacent list , array and recursive stack

public class CycleDetection_DFS_Undirected {
    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {

        // here we are considering 0 based indexing for graph. So we make visited[V] not visited[V+1]
        boolean[] vis = new boolean[V]; // in java by-default all are false at initialization
//        Arrays.fill(vis, false);

        // as it's 0 based indexing, we go from 0 to <V not 1 to <= V
        for (int i = 0; i < V; i++)
            if (!vis[i])
                if (checkForCycle(i, -1, vis, adj))
                    return true;

        return false;
    }

    static boolean checkForCycle(int node, int parent, boolean[] vis, ArrayList<ArrayList<Integer>> adj) {
        vis[node] = true;
        for (int it : adj.get(node)) {
            if (!vis[it]) {
                if (checkForCycle(it, node, vis, adj))
                    return true;
            } else if (it != parent) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(i, new ArrayList<>());

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

        boolean ans = isCycle(V, adj);
        System.out.print("Cycle detected: ");
        if (ans)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
