package graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

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
        boolean[] visited = new boolean[this.size];

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
