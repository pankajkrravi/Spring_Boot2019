import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_table {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/student_db", "root", "password");
			System.out.println("database opend successfull !!!!");
			statement = connection.createStatement();
			String create_query = "CREATE TABLE COMPANY " + "(ID INT PRIMARY KEY     NOT NULL,"
					+ " NAME           TEXT    NOT NULL, " + " AGE            INT     NOT NULL, "
					+ " ADDRESS        CHAR(50), " + " SALARY         REAL)";
			statement.executeUpdate(create_query);
			statement.close();
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			// e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("table created successfully !!!!!!!!!!!!!!!!!!!!!");
	}
}
