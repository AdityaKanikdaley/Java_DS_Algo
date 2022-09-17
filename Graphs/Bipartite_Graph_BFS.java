package apniKaksha.Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// refer code: https://github.com/striver79/StriversGraphSeries/blob/main/bipartiteGraphJavaBfs
// refer tutorial: https://www.youtube.com/watch?v=nbgaEu-pvkU&list=PLgUwDviBIf0rGEWe64KWas0Nryn7SCRWw&index=9
// Time Complexity: O(N+E), N is the time taken and E is for traveling through adjacent nodes overall.
// Space Complexity: O(N+E) + O(N) + O(N) , space for adjacent list , array and queue

public class Bipartite_Graph_BFS {
    public static void main(String[] args) {
        int V = 8;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        /*
        // not bipartite example
        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(2).add(3);
        adj.get(3).add(2);

        adj.get(4).add(3);
        adj.get(3).add(4);

        adj.get(4).add(5);
        adj.get(5).add(4);

        adj.get(4).add(6);
        adj.get(6).add(4);

        adj.get(1).add(6);
        adj.get(6).add(1);
         */

        // bipartite example
        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(2).add(3);
        adj.get(3).add(2);

        adj.get(3).add(4);
        adj.get(4).add(3);

        adj.get(4).add(7);
        adj.get(7).add(4);

        adj.get(1).add(5);
        adj.get(5).add(1);

        adj.get(5).add(6);
        adj.get(6).add(5);

        adj.get(6).add(4);
        adj.get(4).add(6);

        System.out.println("Graph:");
        for (int i = 0; i < V; i++)
            System.out.println(i + " : " + adj.get(i).toString());

        if(checkBipartite(adj, V))
            System.out.println("Yes Bipartite");
        else
            System.out.println("Not Bipartite");
    }

    private static boolean checkBipartite(ArrayList<ArrayList<Integer>> adj, int n) {
        int[] color = new int[n];
        Arrays.fill(color, -1);

        for(int i = 0;i<n;i++)
            if(color[i] == -1)
                if(!bfsCheck(adj, i, color))
                    return false;

        return true;
    }

    private static boolean bfsCheck(ArrayList<ArrayList<Integer>> adj, int node, int[] color) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        color[node] = 1;
        while(!q.isEmpty()) {
            Integer curNode = q.poll();

            for(Integer it: adj.get(curNode)) {
                if(color[it] == -1) {
                    color[it] = 1 - color[curNode]; // color exactly opposite: 1->0, 0->1
                    q.add(it);
                }
                else if(color[it] == color[curNode]) { // if adj node's color == curNode -> return false as it should be opposite
                        return false;
                }
            }
        }

        return true;
    }
}
