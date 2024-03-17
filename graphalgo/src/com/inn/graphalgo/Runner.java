package com.inn.graphalgo;

import java.util.List;

import com.inn.graphalgo.creategraph.CreateGraph;
import com.inn.graphalgo.traversal.Traversal;
import com.inn.graphalgo.traversal.dfs.DFS;

public class Runner {

	public static void main(String[] args) {
//		Graph graph = new CreateGraph(3,3);
//		Graph undirectedGraph = graph.createUndirectedGraph();
//		undirectedGraph.printGraph();
		CreateGraph graphDirected = new CreateGraph(5,8);
		CreateGraph directedGraph = graphDirected.createDirectedGraph();
		directedGraph.printGraph();
		Traversal dfs = new DFS();
		List<Integer> traverse = dfs.traverse(directedGraph, 5, 0);
		System.out.print("=> "+traverse);
	}

}
