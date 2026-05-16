import java.util.*;

public class BFSGraph {

    public static void bfs(int[][] graph, int start) {

        int n = graph.length;
        boolean[] visited = new boolean[n];

        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while(!queue.isEmpty()) {

            int node = queue.poll();
            System.out.print(node + " ");

            for(int i = 0; i < n; i++) {

                if(graph[node][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        int[][] graph = new int[n][n];

        System.out.println("Enter adjacency matrix:");

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter starting node: ");
        int start = sc.nextInt();

        System.out.println("BFS Traversal:");

        bfs(graph, start);

        sc.close();
    }
}