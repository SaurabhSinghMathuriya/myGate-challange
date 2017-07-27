package com.mygate.soa.cache;

import java.util.Properties;

import javax.servlet.ServletContext;

import org.apache.log4j.Logger;

import com.housejoy.soa.cache.RefCache;
import com.mygate.ce.constant.ApplicationConstant;
import com.mygate.ce.util.PropertyFileLoader;

public class SoaCache {
	private static SoaCache cache = null;
	private static Logger log = Logger.getLogger(SoaCache.class);
	private static Object obj = new Object();
	public static String WEB_APP_ROOT;
	public static String TEMPLATE_ROOT;
	private static Properties applicationConfiguration = new Properties();
	
	public static void init(ServletContext servletContext) throws Exception {
		try {
			WEB_APP_ROOT = servletContext.getRealPath("");
			log.info("********************************************************");
			log.info(" Initializing the application ...");
			log.info(WEB_APP_ROOT + " WEB_APP_ROOT ");
			TEMPLATE_ROOT = WEB_APP_ROOT + "/templates";
			applicationConfiguration = PropertyFileLoader.loadProperties("application.properties");
			ApplicationConstant.ENVIRONMENT = applicationConfiguration.getProperty("ENVIRONMENT");
			ApplicationConstant.VERSION = applicationConfiguration.getProperty("VERSION");
			log.info("VERSION:"+ApplicationConstant.VERSION);
			ApplicationConstant.APP_PATH = WEB_APP_ROOT;
			ApplicationConstant.Template_Path = TEMPLATE_ROOT;			
			RefCache.setContext(servletContext);
			createCache();
			log.info(" Initializing RefCache in SOA Project is completed ...");
			log.info("********************************************************");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	private SoaCache() {
	}
	private static void createCache() {
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	public static SoaCache getInstance() {
		synchronized (obj) {
			if (cache == null) {
				cache = new SoaCache();
			}
		}
		return cache;
	}
}