package it.unibo.generics.graph.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import it.unibo.generics.graph.api.Graph;

public class ImplGraph<N> implements Graph<N> {
   
    private final Map<N, Set<N>> graph;
    
    public ImplGraph() {
        this.graph = new HashMap<N, Set<N>>();
    }

    @Override
    public void addNode(final N node) {
        if(node != null && graph.containsKey(node)) {
            this.graph.putIfAbsent(node, new HashSet<N>());
        }
    }

    @Override
    public void addEdge(final N source, final N target) {
        if(source != null && target != null) {
            this.graph.get(source).add(target);
        }
    }

    @Override
    public Set<N> nodeSet() {
        return new HashSet<>(this.graph.keySet());
    }

    @Override
    public Set<N> linkedNodes(final N node) {
        if(this.graph.equals(node)) {
            return new HashSet<>(this.graph.get(node));
        }
        return null;
    }

    @Override
    public List<N> getPath(final N source, final N target) {
     // TODO !!!!!!
        /*   ArrayList<N> lista;
        if(source != null && target != null) {
            
        }
    */
        return null;
    }
    
}
