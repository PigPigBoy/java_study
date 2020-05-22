package structure.graph;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author: KongKongBaby
 * @create: 2020-05-17 22:21
 * @description: 无向图
 **/

public class Graph<T> {
    private Vertex<T>[] vertices; //仅保存所有的顶点
    private int currentSize; // 当前有多少个顶点
    private int[][] adjMat; // 二维数组存放点与点之间的关系

    public Graph(int size) {
        vertices = new Vertex[size];
        adjMat = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                adjMat[i][j] = i == j ? 1 : 0;
            }
        }
    }

    // 增加点
    public void addVertex(Vertex<T> vertex) {
        // 不允许加入重复的顶点
        for (int i = 0; i < vertices.length; i++) {
            if (null != vertices[i] && vertices[i].getValue().equals(vertex.getValue())) {
                System.out.println("添加顶点失败！该顶点已存在！");
                return;
            }
        }
        vertices[currentSize++] = vertex;
    }

    // 增加边 传入两个顶点
    public void addEdge(Vertex<T> v1, Vertex<T> v2) {
        if (v1.getValue().equals(v2.getValue())) {
            System.out.println("添加边失败！两点为同一个顶点!");
            return;
        }
        int i1 = -1;
        int i2 = -1;
        for (int i = 0; i < vertices.length; i++) {
            if (vertices[i].getValue().equals(v1.getValue()))
                i1 = i;
            if (vertices[i].getValue().equals(v2.getValue()))
                i2 = i;
        }
        if (i1 == -1) {
            System.out.println("添加边失败！图中不存在\"" + v1.getValue() + "\"顶点");
            return;
        }
        if (i2 == -1) {
            System.out.println("添加边失败！图中不存在\"" + v2.getValue() + "\"顶点");
            return;
        }
        adjMat[i1][i2] = adjMat[i2][i1] = 1;
    }

    // 深度遍历(栈)
    public void dfs() {
        // 顶点放到栈里去
        Stack<Vertex<T>> stack = new Stack<>();
        // 从第0个顶点开始遍历，先将之入栈并且置为已读状态
        stack.push(vertices[0]);
        vertices[0].setVisited(true);

        System.out.println(vertices[0].getValue());
        // k = A顶点   v = A顶点对应的行下标row
        Map<Vertex<T>,Integer> map = new HashMap<>();
        int row = 0;
        map.put(vertices[row],row);
        tag:
        while (!stack.empty()) {
            for (int i = row + 1; i < vertices.length; i++) {
                if (adjMat[row][i] == 1 && !vertices[i].isVisited()) {
                    stack.push(vertices[i]);
                    vertices[i].setVisited(true);
                    map.put(vertices[i],i);

                    row = i;
                    continue tag;
                }
            }
            // 如果没有找到相通的
            Vertex<T> peek = stack.peek();
            if (null == peek) {
                return;
            }
            System.out.println(peek.getValue());
            stack.pop();
            // C出栈了  此时row重置为B对应的
            row = map.get(stack.peek());
        }
    }

    // 广度遍历(队列)
    public void bfs() {
    }

    // 打印
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("该图一共有" + vertices.length + "个顶点，分别是：");
        for (int i = 0; i < vertices.length; i++) {
            sb.append(vertices[i].getValue() + " ");
        }
        sb.append("\n该图二维矩阵如下: \n\t");
        for (int i = 0; i < vertices.length; i++) {
            sb.append(vertices[i].getValue() + "\t");
        }
        for (int i = 0; i < adjMat.length; i++) {
            sb.append("\n" + vertices[i].getValue() + "\t");
            for (int j = 0; j < adjMat.length; j++) {
                sb.append(adjMat[i][j] + "\t");
            }
        }
        return sb.toString();
    }
}
