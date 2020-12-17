package com.cloudtech.docs.core;

public class Page {
	int pageNumber;
	String content = "";

	public Page() {
	}

	public Page(int pageNumber) {
		setPageNumber(pageNumber);
	}

	public Page(int pageNumber, String content) {
		setPageNumber(pageNumber);
		setContent(content);
	}

	public void append(String content) {
		if (content != null) {
			this.content = this.content.concat(content);
		}
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		if (pageNumber < 1) {
			throw new IllegalArgumentException();
		}
		this.pageNumber = pageNumber;
	}
}
