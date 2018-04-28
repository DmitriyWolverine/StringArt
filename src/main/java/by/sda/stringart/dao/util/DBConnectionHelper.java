package by.sda.stringart.dao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public final class DBConnectionHelper {
	
	//TODO: replace print stack trace to logger output
	
	private static final String DB_CONFIG = "db_config";
	private static final String DB_URL	  = "db.url";
	private static final String DB_LOGIN  = "db.login";
	private static final String DB_PASS   = "db.pass";
	private static final String DB_DRIVER = "db.driver";

	private DBConnectionHelper() {
		super();
	}

	public static Connection connect() {

		Connection connection = null;

		try {
			ResourceBundle rb = ResourceBundle.getBundle(DB_CONFIG);
			String url = rb.getString(DB_URL);
			String login = rb.getString(DB_LOGIN);
			String pass = rb.getString(DB_PASS);
			Class.forName(rb.getString(DB_DRIVER));
			connection = DriverManager.getConnection(url, login, pass);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} 
		return connection;
	}

	public static void disconnect(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}

