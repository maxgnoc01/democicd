package com.fsoft.cicd.models;

public class Models {
	private int id;
	private String content;
	
	public Models(int id, String content) {
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
