package com.gverde.gverde.model;

public class Greeting {

	private final long id;
	private final String content;
    private String name;

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}