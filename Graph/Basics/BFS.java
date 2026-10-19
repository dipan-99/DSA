package Basics;
import java.util.*;

class BFS {
    static void bfs(List<List<Integer>> adj, int src) {
        int n = adj.size();
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        visited[src] = true;
        q.offer(src);

        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");

            for (int v : adj.get(u)) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(1).add(4);

        bfs(adj, 0);
    }
}