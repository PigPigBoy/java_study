package structure.graph;

import org.junit.Test;

/**
 * @author: KongKongBaby
 * @create: 2020-05-17 22:46
 * @description:
 **/

public class TestGraph {

    private static Graph<String> graph = new Graph<>(5);
    static {
        Vertex<String> A = new Vertex<>("A");
        Vertex<String> B = new Vertex<>("B");
        Vertex<String> C = new Vertex<>("C");
        Vertex<String> D = new Vertex<>("D");
        Vertex<String> E = new Vertex<>("E");

        graph.addVertex(A);
        graph.addVertex(B);
        graph.addVertex(C);
        graph.addVertex(D);
        graph.addVertex(E);

        graph.addEdge(A,B);
        graph.addEdge(A,C);
        graph.addEdge(B,C);
        graph.addEdge(B,D);
        graph.addEdge(B,E);
    }


    @Test
    public void print(){
        System.out.println(graph.toString());
    }

    @Test
    public void dfs(){
        graph.dfs();
    }
}
