import java.util.*;

class DFS {
    static void dfs(
            List<List<Integer>> adj,
            int u,
            boolean[] visited) {
        visited[u] = true;
        System.out.print(u + " ");

        for (int v : adj.get(u)) {
            if (!visited[v]) {
                dfs(adj, v, visited);
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

        boolean[] visited = new boolean[V];
        dfs(adj, 0, visited);
    }
}