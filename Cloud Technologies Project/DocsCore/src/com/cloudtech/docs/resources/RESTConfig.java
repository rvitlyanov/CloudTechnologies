package com.cloudtech.docs.resources;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("api")
public class RESTConfig extends Application {
	private Set<Class<?>> classes;
	
	public RESTConfig() {
		classes = new HashSet<>();
		classes.add(PageResource.class);
	}
}
