package chapter06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public enum EnumSingleton {
	connectionFactory;
	private Connection connection;
	/*
	 * 枚举enum和静态代码块特性相似，使用枚举时，构造方法会被自动调用
	 * 但是却暴漏了枚举类，违反职责单一原则
	 * EnumBetterSingleton
	 */
	private EnumSingleton() {
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
