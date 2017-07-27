package com.mygate.soa.cache;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LoadOnStartUpFS extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private final Logger log = Logger.getLogger(getClass().getName());
	private ServletContext servletContext;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		servletContext = config.getServletContext();
		try {
			SoaCache.init(servletContext);
			SoaCache.getInstance();
			loadLog4JConfig(servletContext.getRealPath("")+ "/WEB-INF/classes/log4j.xml");
		} catch (Exception e1) {
			log.error(e1.getMessage());
		}
	}
	
	private void loadLog4JConfig(String log4jFile) throws ServletException {
		try {
			DOMConfigurator.configure(log4jFile);
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}
	
	
}
