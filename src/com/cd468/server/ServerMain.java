package com.cd468.server;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;
public class ServerMain {
	public static void main(String[] args)
	{
		Server server = new Server(8016);
		String version = Server.getVersion();
		try
		{
			WebAppContext context = new WebAppContext();
			context.setContextPath("/");
			context.setResourceBase("web");
			server.setHandler(context);
			// start server
			server.start();
			System.out.println("server version:"+version+". started successful");
		}
		catch(Exception ex)
		{
			System.out.println("server version:"+version+". started failed. exception message:"+ex.getMessage());
		}
	}

}
