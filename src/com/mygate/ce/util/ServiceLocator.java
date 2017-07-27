package com.mygate.ce.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

@SuppressWarnings("rawtypes")
public class ServiceLocator {

	private static ServiceLocator serviceLocatorRef = null;

	
	private static Hashtable dataSourceCache = null;

	static {
		serviceLocatorRef = new ServiceLocator();
	}

	/** Private Constructor for the ServiceLocator */
	private ServiceLocator() {
		dataSourceCache = new Hashtable();
	}

	/**
	 * The ServiceLocator is implemented as a Singleton. The getInstance()
	 * method will return the static reference to the ServiceLocator stored
	 * inside of the ServiceLocator Class.
	 */
	public static ServiceLocator getInstance() {
		return serviceLocatorRef;
	}

	/**
	 * The getDBConn() method will create a JDBC connection for the requested
	 * database. It too uses a cachin algorithm to minimize the number of JNDI
	 * hits that it must perform.
	 */
	@SuppressWarnings("unchecked")
	public Connection getPooledDBConn() throws ServiceLocatorException {
		/* Getting the JNDI Service Name */
		Connection conn = null;
		String serviceName = "jdbc/myGate";
		try {
			/* Checking to see if the requested DataSource is in the Cache */
			if (dataSourceCache.containsKey(serviceName)) {
				DataSource ds = (DataSource) dataSourceCache.get(serviceName);
				conn = ((DataSource) ds).getConnection();
				return conn;
			} else {
				/*
				 * The DataSource was not in the cache. Retrieve it from JNDI
				 * and put it in the cache.
				 */
				Context ctx = new InitialContext();
				DataSource newDataSource = (DataSource) ctx.lookup("java:comp/env/" + serviceName);
				dataSourceCache.put(serviceName, newDataSource);
				conn = newDataSource.getConnection();
				return conn;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	/**
	 * The getDBConn() method will create a JDBC connection for the requested
	 * database. It too uses a cachin algorithm to minimize the number of JNDI
	 * hits that it must perform.
	 */
	@SuppressWarnings("unchecked")
	public Connection getPooledSlaveDBConn() throws ServiceLocatorException {
		/* Getting the JNDI Service Name */
		Connection conn = null;
		String serviceName = "jdbc/slaveDB";
		try {
			/* Checking to see if the requested DataSource is in the Cache */
			if (dataSourceCache.containsKey(serviceName)) {
				DataSource ds = (DataSource) dataSourceCache.get(serviceName);
				conn = ((DataSource) ds).getConnection();
				return conn;
			} else {
				/*
				 * The DataSource was not in the cache. Retrieve it from JNDI
				 * and put it in the cache.
				 */
				Context ctx = new InitialContext();
				DataSource newDataSource = (DataSource) ctx.lookup("java:comp/env/" + serviceName);
				dataSourceCache.put(serviceName, newDataSource);
				conn = newDataSource.getConnection();
				return conn;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
	
	@SuppressWarnings("unchecked")
	public Connection getPooledReportsDBConn() throws ServiceLocatorException {
		/* Getting the JNDI Service Name */
		Connection conn = null;
		String serviceName = "jdbc/reports";
		try {
			/* Checking to see if the requested DataSource is in the Cache */
			if (dataSourceCache.containsKey(serviceName)) {
				DataSource ds = (DataSource) dataSourceCache.get(serviceName);
				conn = ((DataSource) ds).getConnection();
				return conn;
			} else {
				/*
				 * The DataSource was not in the cache. Retrieve it from JNDI
				 * and put it in the cache.
				 */
				Context ctx = new InitialContext();
				DataSource newDataSource = (DataSource) ctx.lookup("java:comp/env/" + serviceName);
				dataSourceCache.put(serviceName, newDataSource);
				conn = newDataSource.getConnection();
				return conn;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	/**
	 * This method closes the Connection object
	 * @param conn Connection object
	 */
	public void closeConnection(final Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException ex) {

			}
		}
	}
	

	
	/**
	 * This method closes the Statement object
	 * @param stmt	Statement object
	 */
	public void closeStatement(final Statement stmt) {
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException ex) {

			}
		}
	}

	/**
	 * This method closes the Resultset object
	 * @param rs	Resultset object
	 */
	public void closeResultSet(final ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException ex) {

			}
		}
	}

	

}
