package Basics;
import java.util.*;

class KruskalMST {
    static class Edge implements Comparable<Edge> {
        int u, v, weight;

        Edge(int u, int v, int weight) {
            this.u = u;
            this.v = v;
            this.weight = weight;
        }

        public int compareTo(Edge other) {
            return Integer.compare(this.weight, other.weight);
        }
    }

    static class DSU {
        int[] parent, rank;

        DSU(int n) {
            parent = new int[n];
            rank = new int[n];

            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        boolean union(int a, int b) {
            int rootA = find(a);
            int rootB = find(b);

            if (rootA == rootB)
                return false;

            if (rank[rootA] < rank[rootB]) {
                parent[rootA] = rootB;
            } else if (rank[rootA] > rank[rootB]) {
                parent[rootB] = rootA;
            } else {
                parent[rootB] = rootA;
                rank[rootA]++;
            }

            return true;
        }
    }

    static void kruskal(int V, List<Edge> edges) {
        Collections.sort(edges);

        DSU dsu = new DSU(V);
        int totalWeight = 0;
        int edgesUsed = 0;

        for (Edge e : edges) {
            if (dsu.union(e.u, e.v)) {
                System.out.println(
                        e.u + " - " + e.v + " : " + e.weight);

                totalWeight += e.weight;
                edgesUsed++;

                if (edgesUsed == V - 1)
                    break;
            }
        }

        if (edgesUsed != V - 1) {
            System.out.println("Graph is disconnected; no spanning tree exists.");
        } else {
            System.out.println("MST weight = " + totalWeight);
        }
    }

    public static void main(String[] args) {
        int V = 4;

        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 6));
        edges.add(new Edge(0, 3, 5));
        edges.add(new Edge(1, 3, 15));
        edges.add(new Edge(2, 3, 4));

        kruskal(V, edges);
    }
}
