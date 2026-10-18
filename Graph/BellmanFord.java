import java.util.*;

class BellmanFord {
    static class Edge {
        int u, v, weight;

        Edge(int u, int v, int weight) {
            this.u = u;
            this.v = v;
            this.weight = weight;
        }
    }

    static void bellmanFord(int V, List<Edge> edges, int src) {
        int INF = Integer.MAX_VALUE;
        int[] dist = new int[V];

        Arrays.fill(dist, INF);
        dist[src] = 0;

        // Relax all edges V - 1 times
        for (int i = 1; i < V; i++) {
            boolean updated = false;

            for (Edge e : edges) {
                if (dist[e.u] != INF &&
                    dist[e.u] + e.weight < dist[e.v]) {

                    dist[e.v] = dist[e.u] + e.weight;
                    updated = true;
                }
            }

            if (!updated) break;
        }

        // Check for a negative-weight cycle
        for (Edge e : edges) {
            if (dist[e.u] != INF &&
                dist[e.u] + e.weight < dist[e.v]) {
                System.out.println("Negative-weight cycle detected");
                return;
            }
        }

        for (int i = 0; i < V; i++) {
            if (dist[i] == INF) {
                System.out.println(i + " : INF");
            } else {
                System.out.println(i + " : " + dist[i]);
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;

        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(0, 1, 6));
        edges.add(new Edge(0, 2, 7));
        edges.add(new Edge(1, 2, 8));
        edges.add(new Edge(1, 3, 5));
        edges.add(new Edge(1, 4, -4));
        edges.add(new Edge(2, 3, -3));
        edges.add(new Edge(2, 4, 9));
        edges.add(new Edge(3, 1, -2));
        edges.add(new Edge(4, 0, 2));
        edges.add(new Edge(4, 3, 7));

        bellmanFord(V, edges, 0);
    }
}