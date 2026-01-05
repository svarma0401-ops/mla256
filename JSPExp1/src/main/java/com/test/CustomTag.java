package com.test;

import java.util.Date;

import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class CustomTag extends TagSupport{

	public int doStartTag() {
		
		JspWriter out = null;
		
		try {
			out = pageContext.getOut();
			out.println("This is simple custom tag api");
			out.println("Current Date and Time :" + new Date());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
}
