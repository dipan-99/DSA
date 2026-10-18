import java.util.*;

class Dijkstra {
    static void dijkstra(
            int V, List<List<int[]>> adj, int src) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        // {distance, vertex}
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        pq.offer(new int[] { 0, src });

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int d = current[0];
            int u = current[1];

            if (d != dist[u])
                continue;

            for (int[] edge : adj.get(u)) {
                int v = edge[0];
                int weight = edge[1];

                if (dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.offer(new int[] { dist[v], v });
                }
            }
        }

        System.out.println(Arrays.toString(dist));
    }

    public static void main(String[] args) {
        int V = 4;
        List<List<int[]>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Undirected weighted graph
        adj.get(0).add(new int[] { 1, 4 });
        adj.get(1).add(new int[] { 0, 4 });

        adj.get(0).add(new int[] { 2, 1 });
        adj.get(2).add(new int[] { 0, 1 });

        adj.get(2).add(new int[] { 3, 2 });
        adj.get(3).add(new int[] { 2, 2 });

        adj.get(3).add(new int[] { 1, 1 });
        adj.get(1).add(new int[] { 3, 1 });

        dijkstra(V, adj, 0);
    }
}