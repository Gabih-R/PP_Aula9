package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public static Connection obtemConexao1() throws SQLException {
		return DriverManager
				.getConnection("jdbc:mysql://localhost:3306/paises?user=gabriela&password=gabriela");
	}

	public static Connection fecharConexao() {
		return null;
	
		
	}

	public static Connection obtemConexao() {
		return null;
		
		
	}

}
