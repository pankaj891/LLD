package com.inn.graphalgo.creategraph;

public interface Graph {
	Graph createUndirectedGraph();
	Graph createDirectedGraph();
	Graph createUndirectedWeightedGraph();
	Graph createDirectedWeightedGraph();
	void printGraph();
}
