package apniKaksha.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// refer for tutorial: https://www.youtube.com/watch?v=UeE67iCK2lQ&list=PLgUwDviBIf0rGEWe64KWas0Nryn7SCRWw&index=6
// refer for code: https://takeuforward.org/data-structure/breadth-first-searchbfs-level-order-traversal/
// Time Complexity : O(N+E), where N = Nodes , E = travelling through adjacent nodes
// Space Complexity : O(N+E) + O(N) + O(N), where Space for adjacency list, visited array, queue data structure

public class BFS {
    public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] vis = new boolean[V];

        for (int i = 0; i < V; i++) {

            if (!vis[i]) {
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                vis[i] = true;

                while (!q.isEmpty()) {
                    Integer node = q.poll();
                    bfs.add(node);

                    for (Integer it : adj.get(node)) {
                        if (!vis[it]) {
                            vis[it] = true;
                            q.add(it);
                        }
                    }
                }
            }
        }

        return bfs;
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V = 7;
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(1).add(6);
        adj.get(1).add(0);
        adj.get(2).add(1);
        adj.get(2).add(4);
        adj.get(6).add(1);
        adj.get(6).add(4);
        adj.get(4).add(6);
        adj.get(4).add(2);
        adj.get(3).add(5);
        adj.get(5).add(3);

        System.out.println("Graph:");
        for (int i = 0; i < V; i++)
            System.out.println(i + " : " + adj.get(i).toString());

        ArrayList<Integer> ans = bfsOfGraph(V, adj);
        System.out.println("Answer BFS: " + ans);
    }
}
