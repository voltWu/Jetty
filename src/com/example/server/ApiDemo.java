package com.example.server;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ApiDemo   extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
		Map<String, String> paraMap = Tool.getAllParameter(request);
		String paraStr="";
		for (Map.Entry<String, String> entry : paraMap.entrySet()) 
		{  
			if(paraStr.length() >0)
			{
				paraStr+="&";
			}
			paraStr+=entry.getKey()+"="+entry.getValue(); 
		} 
		Tool.responseToClient(response,"ok,Parameter£º"+paraStr);
    }
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{	
		doGet(request, response);
	}
	
	
}
