package chapter06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.omg.CORBA.PUBLIC_MEMBER;

public class EnumBetterSingleton {
	public enum SelfEnumSingleton {
		connectionFactory;
		private Connection connection;
		private SelfEnumSingleton() {
			try {
				System.out.println("Enum Singleton Contructor");
				String url = "jdbc:sqlserver://";
				String username = "sa";
				String password = "";
				String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
				Class.forName(driverName);
				connection = DriverManager.getConnection(url, username, password);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		public Connection getConnection(){
			return connection;
		}
	}
	
	public static Connection getConnection(){
		return SelfEnumSingleton.connectionFactory.getConnection();
	}
}
