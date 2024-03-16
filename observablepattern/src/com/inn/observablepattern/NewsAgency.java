package com.inn.observablepattern;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

	String news;
	List<Channels> observers = new ArrayList<>();
	
	void addObserver(Channels channel) {
		observers.add(channel);
	}
	
	void setNews(String news) {
		this.news=news;
		for (Channels channel :observers) {
			channel.update(news);
		}
	}
}
