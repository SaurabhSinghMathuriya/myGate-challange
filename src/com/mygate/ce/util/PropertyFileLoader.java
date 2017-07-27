package com.mygate.ce.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFileLoader {

	private PropertyFileLoader() {

	}

	public static Properties loadProperties(final String name) throws IOException {
		return getPropertiesFromClasspath(name);
	}

	private static Properties getPropertiesFromClasspath(String propFileName) throws IOException {
		Properties props = new Properties();
		InputStream inputStream = PropertyFileLoader.class.getClassLoader().getResourceAsStream("/" + propFileName);
		if (inputStream == null) {
			throw new FileNotFoundException("property file '" + propFileName+ "' not found in the classpath");
		}
		props.load(inputStream);
		return props;
	}
}