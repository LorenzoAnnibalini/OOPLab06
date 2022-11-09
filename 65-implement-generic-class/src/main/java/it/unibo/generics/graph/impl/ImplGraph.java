package it.unibo.generics.graph.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import it.unibo.generics.graph.api.Graph;

enum Colore {BIANCO, GRIGIO, NERO};

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
    
        Map <N,List<N>> mappaBFS = new HashMap<>();
        Map <N,Colore> mappaColori = new HashMap<>();
        List<N> queue = new ArrayList<>();
        LinkedList<N> tmp;
        N nodoTMP;
        
        //preparo la mappaBFS e la mappaColori per ogni nodo
        for (N nodo : this.nodeSet()){
            mappaBFS.put(nodo,new LinkedList<>());
            mappaColori.put(nodo, Colore.BIANCO);
        }

        //aggiungo source
        queue.add(source);
        mappaColori.put(source, Colore.GRIGIO);
        mappaBFS.put(source, new LinkedList<>());

        //TODO !!!!!!!!!!

        return null;
    }
    
}
