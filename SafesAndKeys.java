import java.util.*;

public class SafesAndKeys {

    private static void dfs(List<List<Integer>> graph, int node, boolean[] visited) {
        visited[node] = true;
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(graph, neighbor, visited);
            }
        }
    }

    public static int countConnectedComponents(List<List<Integer>> graph) {
        int n = graph.size();
        boolean[] visited = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                count++;
                dfs(graph, i, visited);
            }
        }
        return count;
    }

    private static void addEdge(List<List<Integer>> graph, int u, int v) {
        graph.get(u-1).add(v-1);
    }

    public static void run(int n, int[] numbers) {

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int j =0; j<n; j++){
            addEdge(graph, numbers[j], j+1);
            addEdge(graph, j+1, numbers[j]);
        }

        int count = countConnectedComponents(graph);
        System.out.println(count);
    }

}
