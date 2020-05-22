package structure.graph;

import lombok.Data;

/**
 * @author: KongKongBaby
 * @create: 2020-05-17 22:19
 * @description: 图的结点
 **/

@Data
public class Vertex<T> {
    private T value;
    private boolean visited;

    public Vertex(T value) {
        this.value = value;
    }
}
