package com.filter.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class FirstFilter
 */
@WebFilter("/FirstFilter")
public class FirstFilter implements Filter {

    public FirstFilter() {
   
    }

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		request.setAttribute("message", "hello");
		PrintWriter out = response.getWriter();
		out.print("This is before the request is sent to the servlet");
		chain.doFilter(request, response);
		out.print("This is after the servlet sends the response to the client");
	}
	
	
	public void destroy() {

	}

	public void init(FilterConfig fConfig) throws ServletException {
	
	}

}
