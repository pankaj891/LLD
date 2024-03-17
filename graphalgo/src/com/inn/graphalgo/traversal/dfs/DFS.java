package com.inn.graphalgo.traversal.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.inn.graphalgo.creategraph.CreateGraph;
import com.inn.graphalgo.creategraph.Graph;
import com.inn.graphalgo.model.Pair;
import com.inn.graphalgo.traversal.Traversal;

public class DFS implements Traversal {

	private Boolean[] visited;

	@Override
	public List<Integer> traverse(CreateGraph graph, int start, int value) {
		visited = new Boolean[graph.adj.size()];
		Arrays.fill(visited, false);
		List<Integer> output = new ArrayList<>();
		dfs(start, graph,output);
		return output;
	}

	private void dfs(int start, CreateGraph graph,List<Integer> output) {
		this.visited[start] = true;
		output.add(start);
		List<Pair> pairs = graph.adj.get(start);
		for (Pair pair : pairs) {
			if (pair != null) {
				int v = pair.getV();
				if (!this.visited[v])
					dfs(v, graph,output);
			}
		}
	}

}
