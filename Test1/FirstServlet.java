package com.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet {

	ServletConfig conf;

	// LifeCycle Methods

	public void init(ServletConfig conf) {
		this.conf = conf;
		System.out.println("Creating Object of First Servlet...");
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Servicing...");
	}

	public void destroy() {
		System.out.println("Going to Destroy Servlet Object....");
	}

	// Non LifeCycle methods

	public ServletConfig getServletConfig() {
		return this.conf;
	}

	public String getServletInfo() {
		return "This Servlet is created by Shivam";
	}

}
