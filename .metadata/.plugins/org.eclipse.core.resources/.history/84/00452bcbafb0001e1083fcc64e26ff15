package com.inn.observablepattern;

public class ObserverPattern {

	public static void main(String[] args) {
		NewsAgency newsAgency = new NewsAgency();
		Channels channel = new NewsChannel();
		newsAgency.addObserver(channel);
		newsAgency.setNews("pankaj");
		System.out.println("==> : "+channel.getNews());
	}
}
