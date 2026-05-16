import java.util.Scanner;

public class DFSGraph {

    static void dfs(int[][] graph, boolean[] visited, int node) {

        visited[node] = true;
        System.out.print(node + " ");

        for(int i = 0; i < graph.length; i++) {

            if(graph[node][i] == 1 && !visited[i]) {
                dfs(graph, visited, i);
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

        boolean[] visited = new boolean[n];

        System.out.print("Enter starting node: ");
        int start = sc.nextInt();

        System.out.println("DFS Traversal:");

        dfs(graph, visited, start);

        sc.close();
    }
}