package apniKaksha.Graphs;

import java.util.ArrayList;

public class Bipartite_Graph_DFS {
    public static void main(String[] args) {
        int V = 8;
        ArrayList <ArrayList< Integer >> adj = new ArrayList <> ();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList <> ());

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

        System.out.println("Graph:");
        for (int i = 0; i < V; i++)
            System.out.println(i + " : " + adj.get(i).toString());

        if (checkBipartite(adj, V))
            System.out.println("It is a Bipartite Graph");
        else
            System.out.println("It is not a Bipartite Graph");
    }

    static boolean checkBipartite(ArrayList < ArrayList < Integer >> graph, int n) {
        int[] color = new int[n];

        for (int i = 0; i < n; i++) {
            color[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            if (color[i] == -1) {
                if (!dfsCheck(graph, i, color)) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean dfsCheck(ArrayList < ArrayList < Integer >> graph, int node, int[] color) {
        for (Integer it: graph.get(node)) {
            if (color[it] == -1) {
                //Color of variable neighbor is the inverted color of variable node
                color[it] = 1 - color[node];

                if (!dfsCheck(graph, it, color))
                    return false;
            } else if (color[it] == color[node]) {
                return false;
            }
        }
        return true;
    }
}
