package graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    private int size;

    //using adjacency list
    private List<Integer>[] edges;

    Graph(int size) {
        this.size = size;
        this.edges = new LinkedList[size];
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
        int[] level = new int[this.size];

        //create an empty queue
        Queue<Integer> queue = new LinkedList<>();

        //add source to queue
        queue.add(source);
        visited[source] = true;
        level[source] = 0;

        while (!queue.isEmpty()) {
            Integer elementToPrint = queue.remove();
            int currentLevel = level[elementToPrint];

            for (Integer neighbour : edges[elementToPrint]) {
                if (!visited[neighbour]) {
                    level[neighbour] = currentLevel + 1;
                    queue.add(neighbour);
                    visited[neighbour] = true;
                }
            }
            System.out.println(elementToPrint);
        }
        System.out.println("Level = ");
        printArray(level);
    }

    private void printArray(int[] level) {
        for (int element : level) {
            System.out.println(element);
        }
    }

    public void dfs(Integer source) {
        boolean[] visited = new boolean[this.size];

        //create empty queue
        Stack<Integer> stack = new Stack<>();

        //add source to queue
        stack.push(source);
        visited[source] = true;

        while (!stack.isEmpty()) {
            Integer elementToPrint = stack.pop();

            for (Integer neighbour : edges[elementToPrint]) {
                if (!visited[neighbour]) {
                    stack.push(neighbour);
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

        System.out.println("DFS : ");
        graph.dfs(0);
    }
}
//
//    Integer[] ret = new Integer[s.length()];
//    Queue<Integer> q = new LinkedList();
//        for (int i = 0; i < s.length(); i++) {
//        if (String.valueOf(s.charAt(i)).equals(c)) {
//        q.offer(i);
//        }
//        }
//        Set<Integer> vis = new HashSet();
//        int dist = 0;
//        while (!q.isEmpty()) {
//        int size = q.size();
//        for (int x = 0; x < size; x++) {
//        int temp = q.poll();
//        if (temp < 0 || temp >= s.length() || vis.contains(temp) || ret[temp] != null) {
//        continue;
//        }
//        ret[temp] = dist;
//        q.offer(temp + 1);
//        q.offer(temp - 1);
//        }
//        dist++;
//        }
//        int[] convert = new int[ret.length];
//        for (int i = 0; i < ret.length; i++) convert[i] = ret[i];
//        return convert;
//        }
