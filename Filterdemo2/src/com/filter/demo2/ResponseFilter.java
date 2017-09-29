package com.filter.demo2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


/**
 * Servlet Filter implementation class ResponseFilter
 */
//@WebFilter("/ResponseFilter")
public class ResponseFilter implements Filter {

    /**
     * Default constructor. 
     */
    public ResponseFilter() {
       
    }


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//		HttpServletResponse resp = (HttpServletResponse) response;
//		PrintWriter out = resp.getWriter();
//		out.print("This is printed by the Response Filter<br>");
//		chain.doFilter(request, response);
//		out.print("This is also printed by the Response Filter");
		
		request.setAttribute("message", "Printed from the Source Servlet");
		PrintWriter out = response.getWriter();
		out.print("This is printed by the Response Filter<br>");
		chain.doFilter(request, response);
		out.print("This is also printed by the Response Filter");
	}


	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}


}
