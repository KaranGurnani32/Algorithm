package graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class GraphPractice {

    public int size;

    //using adjacency list
    public List<Integer>[] edges;

    public GraphPractice(int size) {
        this.size = size;
        edges = new LinkedList[size];
        for (int i = 0; i < edges.length; i++) {
            edges[i] = new LinkedList<>();
        }
    }


    public void addBiDirectionalEdge(int source, int destination) {
        this.edges[source].add(destination);
        this.edges[destination].add(source);
    }

    public void bfs(Integer source) {
        boolean[] visited = new boolean[size];
        int[] level = new int[size];

        Queue<Integer> queue = new LinkedList<>();

        queue.add(source);
        visited[source] = true;
        level[source] = 0;

        while (!queue.isEmpty()) {
            Integer elementToPrint = queue.remove();
            int currentLevel = level[elementToPrint];

            for (Integer neighbour: edges[elementToPrint]) {
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
        boolean[] visited = new boolean[size];

        Stack<Integer> stack = new Stack<>();

        stack.push(source);
        visited[source] = true;

        while (!stack.isEmpty()) {
            Integer elementToPrint = stack.pop();

            for (Integer neighbour: edges[elementToPrint]) {
                if (!visited[neighbour]) {
                    stack.push(neighbour);
                    visited[neighbour] = true;
                }
            }
            System.out.println(elementToPrint);
        }
    }
}

class GraphPracticeRunner {
    public static void main(String[] args) {
        GraphPractice graph = new GraphPractice(12);
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
