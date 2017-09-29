package com.custom.tag;

import java.io.IOException;
import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CurrentDate extends SimpleTagSupport{
	
	public void doTag() throws JspException, IOException {
		
		JspWriter out = getJspContext().getOut();
		out.print(new Date().toString());
		
	}

}
