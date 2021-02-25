package graph;

import Linear.Stack;

public class TopoLogical {
    private Stack<Integer> order;

    public TopoLogical(Digraph G) {
        DirectedCycle cycle = new DirectedCycle(G);
        if (!cycle.hasCycle()) {
            DepthFirstOrder depthFirstOrder = new DepthFirstOrder(G);
            order = depthFirstOrder.reversePost();
        }
    }

    private boolean isCycle() {
        return order == null;
    }

    public Stack<Integer> order() {
        return order;
    }
}
