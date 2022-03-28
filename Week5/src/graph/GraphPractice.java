package graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphPractice {
    private int size;

    // created new array of list
    // doubt why use list of array and then linked list
    // we can use integer then linked list
    private List<Integer>[] edges;

    GraphPractice(int size) {
        this.size = size;
        this.edges = new LinkedList[size];
        for (int i = 0; i < this.edges.length; i++) {
            edges[i] = new LinkedList<>();
        }
    }

    public void addBiDirectionalEdge(int source, int destination) {
        edges[source].add(destination);
        edges[destination].add(source);
    }

    public boolean isConnected(int source, int destination) {

        return this.edges[source].contains(destination);
    }

    public void bfs(Integer source) {
        boolean[] visited = new boolean[this.size];
        int[] level = new int[this.size];

        Queue<Integer> queue = new LinkedList<>();

        queue.add(source);
        visited[source] = true;
        level[source] = 0;

        
    }
}
