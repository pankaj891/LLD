package com.inn.graphalgo.creategraph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.inn.graphalgo.model.Pair;

public class CreateGraph implements Graph {

	private int vertice = 0, edge = 0;
	public List<List<Pair>> adj = new ArrayList<>();
	Scanner myObj = new Scanner(System.in);

	public CreateGraph(int vertice, int edge) {
		this.vertice = vertice;
		this.edge = edge;
		for (int i = 0; i <= this.vertice; i++)
			adj.add(new ArrayList<Pair>());
	}

	@Override
	public CreateGraph createUndirectedGraph() {
		int i = 0;
		while (i < this.vertice) {
			System.out.println("Enter first edge vertex number");
			int u = myObj.nextInt();
			System.out.println("Enter second edge vertex number");
			int v = myObj.nextInt();
			if (u > this.vertice || v > this.vertice) {
				System.out.println("Wrong Input");
				break;
			}
			Pair firstPair = new Pair(v, -1);
			adj.get(u).add(firstPair);
			Pair secondPair = new Pair(u, -1);
			adj.get(v).add(secondPair);
			i++;
		}
		return this;
	}

	@Override
	public CreateGraph createDirectedGraph() {
		int i = 0;
		while (i < this.edge) {
			System.out.println("Enter source vertex number");
			int u = myObj.nextInt();
			System.out.println("Enter targer vertex number");
			int v = myObj.nextInt();
			if (u > this.vertice || v > this.vertice) {
				System.out.println("Wrong Input");
				break;
			}
			Pair firstPair = null;
			if (v == -1) {
				adj.get(u).add(null);
			}
			if (v != -1) {
				firstPair = new Pair(v, -1);
				adj.get(u).add(firstPair);
			}
			i++;
		}
		return this;
	}

	@Override
	public Graph createUndirectedWeightedGraph() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Graph createDirectedWeightedGraph() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printGraph() {
		for (int i = 0; i <= this.vertice; i++) {
			if (this.adj.get(i) == null)
				System.out.println(i + "=>" + null);
			else
				System.out.println(i + "=>" + this.adj.get(i));
		}
	}

}
