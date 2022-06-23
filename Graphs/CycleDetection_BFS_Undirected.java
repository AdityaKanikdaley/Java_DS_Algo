package apniKaksha.Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// refer code: https://takeuforward.org/data-structure/detect-a-cycle-in-undirected-graph-breadth-first-search/
// refer tutorial: https://www.youtube.com/watch?v=A8ko93TyOns&list=PLgUwDviBIf0rGEWe64KWas0Nryn7SCRWw&index=8
// Time Complexity: O(N+E), N is the time taken and E is for traveling through adjacent nodes overall.
// Space Complexity: O(N+E) + O(N) + O(N) , space for adjacent list , array and queue

public class CycleDetection_BFS_Undirected {
    static class Node {
        int first;
        int second;
        public Node(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        Arrays.fill(vis, false);
        for (int i = 0; i < V; i++)
            if (!vis[i])
                if (checkForCycle(adj, i, vis))
                    return true;

        return false;
    }

    static boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, int start, boolean[] vis) {
        Queue<Node> q = new LinkedList<>(); //BFS
        q.add(new Node(start, -1));
        vis[start] = true;

        while (!q.isEmpty()) {
            int node = q.peek().first;
            int prev = q.peek().second;
            q.remove();

            for (Integer it : adj.get(node)) {
                if (!vis[it]) {
                    q.add(new Node(it, node));
                    vis[it] = true;
                } else if (prev != it) return true;
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

