
// Write a program to create a graph & implement the adjacency list representation of the graph
// Apply DFS and BFS on the given graph.
import java.util.*;

public class Graph {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int node = scanner.nextInt();
        ArrayList<Integer> gp[] = new ArrayList[node];

        for (int i = 0; i < node; i++) {
            gp[i] = new ArrayList<>();
        }

        System.out.println("Enter source and des, : ");
        int s = scanner.nextInt();
        int d = scanner.nextInt();

        while (s != -1 && d != -1) {
            addEdge(s, d, gp);
            System.out.println("Enter source and des, : ");
            s = scanner.nextInt();
            d = scanner.nextInt();
        }

        System.out.println("Enter node of find  Adj. node : ");
        int curr = scanner.nextInt();

        System.out.print("Adj of " + curr + " ::---> ");

        for (int i = 0; i < gp[curr].size(); i++) {
            System.out.println(gp[curr].get(i) + " ");
        }
        System.out.println();
    }

    public static void addEdge(int s, int d, ArrayList<Integer> gp[]) {
        gp[s].add(d);
        if (d != s)
            gp[d].add(s);
    }
}
