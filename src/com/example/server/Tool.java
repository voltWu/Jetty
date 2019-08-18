package com.example.server;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Tool {
	static public boolean IsEmpty(String value)
	{
		boolean isEmpty = value== null || value.length()==0;
		return isEmpty;
	}
	public static Map<String, String> getAllParameter(HttpServletRequest request)
	{
	    Map<String, String> parameters = new HashMap<String, String>();
	    try
	    {
	      Enumeration<String> propertyNames = request.getParameterNames();
	      if(propertyNames!=null)
	      {
		      while (propertyNames.hasMoreElements())
		      {
		        String parameterName = propertyNames.nextElement();
		        if(! IsEmpty(parameterName))
		        {
		        	parameters.put(parameterName, request.getParameter(parameterName));
		        }
		      }
	      }
	    }
	    catch (Exception e)
	    {	      
	    }
	    return parameters;
	  }
	public static void responseToClient(HttpServletResponse response, Object result)
	{
		if (result != null) 
		{
		    ServletOutputStream out = null;	
	        response.setContentType("text/html; charset=UTF-8");
	        response.setHeader("Pragma", "No-cache");
	        response.setHeader("Cache-Control", "no-cache");
	        response.setDateHeader("Expires", 0L);
	        try
	        {
	        	
	        	out = response.getOutputStream();
	        	out.write(result.toString().getBytes("UTF-8"));
	        }	        
	        catch (Exception e)
	        {
	        	try
	        	{
	        		out.close();
	        	} catch (Exception ex) 
	        	{
	        	}
	        }
	        finally
	        {
	        	try
	        	{
	        		out.close();
	        	} 
	        	catch (IOException e) 
	        	{
	        	}
	        }
		}
	}

}
