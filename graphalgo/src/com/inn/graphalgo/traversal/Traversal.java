package com.inn.graphalgo.traversal;

import java.util.List;

import com.inn.graphalgo.creategraph.CreateGraph;

public interface Traversal {
	List<Integer> traverse(CreateGraph graph,int start,int value);
}
