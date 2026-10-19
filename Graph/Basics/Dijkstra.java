package Basics;
import java.util.*;

class Dijkstra {
    static void dijkstra(List<List<int[]>> adj, int src) {
        int V = adj.size();
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        // Each entry is {distance, vertex}
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        pq.offer(new int[] { 0, src });

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int d = cur[0];
            int u = cur[1];

            if (d != dist[u])
                continue;

            for (int[] edge : adj.get(u)) {
                int v = edge[0];
                int w = edge[1];

                if (dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    pq.offer(new int[] { dist[v], v });
                }
            }
        }

        System.out.println(Arrays.toString(dist));
    }

    public static void main(String[] args) {
        int V = 5;
        List<List<int[]>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 0, 1, 4);
        addEdge(adj, 0, 2, 1);
        addEdge(adj, 1, 3, 1);
        addEdge(adj, 2, 3, 2);
        addEdge(adj, 3, 4, 3);

        dijkstra(adj, 0);
    }

    static void addEdge(List<List<int[]>> adj, int u, int v, int w) {
        adj.get(u).add(new int[] { v, w });
        adj.get(v).add(new int[] { u, w });
    }
}