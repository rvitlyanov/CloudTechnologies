package com.cloudtech.docs.core;

import java.util.List;

public class Document {
	public List<Page> pages;
	
	public void addPage() {
		pages.add(new Page(pages.size()));
	}
	
	public void addPage(String content) {
		pages.add(new Page(pages.size(), content));
	}
	
	public Page getPage(int page) {
		return pages.get(page-1);
	}
	
	public void removePage(int pageNumber) {
		pages.remove(--pageNumber);
	}
	
	public void updatePage(int pageNumber, String content) {
		pages.get(pageNumber - 1).append(content);
	}
	
}
