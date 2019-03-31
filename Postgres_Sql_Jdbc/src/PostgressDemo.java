import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgressDemo {
	public static void main(String[] args) throws SQLException {
		Connection connection=null;
		try {
			Class.forName("org.postgresql.Driver");
			connection =DriverManager.getConnection("jdbc:postgresql://localhost:5432/student_db","root", "password");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.exit(0);
		}
		System.out.println("Opend Postgres Database !!!");
		connection.close();
	}
}
