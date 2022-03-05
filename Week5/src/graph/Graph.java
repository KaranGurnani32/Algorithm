package graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {
    private int size;

    //using adjacency list
    private List<Integer>[] edges;

    Graph(int size) {
        this.size = size;
        this.edges = new LinkedList[size]; // doubt
        for (int i = 0; i < this.edges.length; i++) {
            edges[i] = new LinkedList<>();
        }
    }

    //adds the corresponding edge to the graph
    public void addEdge(int source, int destination) {
        this.edges[source].add(destination);
    }

    public void addBiDirectionalEdge(int source, int destination) {
        this.edges[source].add(destination);
        this.edges[destination].add(source);
    }
    public boolean isConnected(int source, int destination) {
        return this.edges[source].contains(destination);
    }

    public void bfs(Integer source) {
        boolean[] visited = new boolean[this.size];

        //create an empty queue
        Queue<Integer> queue = new LinkedList<>();

        //add source to queue
        queue.add(source);
        visited[source] = true;

        while (!queue.isEmpty()) {
            Integer elementToPrint = queue.remove();

            for (Integer neighbour : edges[elementToPrint]) {
                if (!visited[neighbour]) {
                    queue.add(neighbour);
                    visited[neighbour] = true;
                }
            }
            System.out.println(elementToPrint);
        }
    }
}

class GraphRunner {
    public static void main(String[] args) {
        Graph graph = new Graph(12);
        graph.addBiDirectionalEdge(0, 1);
        graph.addBiDirectionalEdge(1, 2);
        graph.addBiDirectionalEdge(1, 3);
        graph.addBiDirectionalEdge(2, 5);
        graph.addBiDirectionalEdge(3, 6);
        graph.addBiDirectionalEdge(3, 4);
        graph.addBiDirectionalEdge(5, 6);
        graph.addBiDirectionalEdge(6, 7);
        graph.addBiDirectionalEdge(6, 8);
        graph.addBiDirectionalEdge(7, 10);
        graph.addBiDirectionalEdge(7, 9);
        graph.addBiDirectionalEdge(9, 11);

        System.out.println("BFS : ");
        graph.bfs(0);


    }
}
