package pkg.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class DisplayAuthors {

	static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	String DATABASE_URL = "jdbc:mysql://127.0.0.1:3306/test";

	private Connection connection;
	private Statement statement;

	public DisplayAuthors() {
		try {
			Class.forName(JDBC_DRIVER);

			connection = DriverManager.getConnection(DATABASE_URL);

			statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery("SELECT * FROM user");

			// process query results
			StringBuffer results = new StringBuffer();
			ResultSetMetaData metaData = resultSet.getMetaData();
			int numberOfColumns = metaData.getColumnCount();

			for (int i = 1; i <= numberOfColumns; i++)
				results.append(metaData.getColumnName(i) + "\t");

			results.append("\n");

			while (resultSet.next()) {

				for (int i = 1; i <= numberOfColumns; i++)
					results.append(resultSet.getObject(i) + "\t");

				results.append("\n");
			}
			System.out.println(results.toString());
		}

		// detect problems interacting with the database
		catch (SQLException sqlException) {
			JOptionPane.showMessageDialog(null, sqlException.getMessage(),
					"Database Error", JOptionPane.ERROR_MESSAGE);

			System.exit(1);
		}

		// detect problems loading database driver
		catch (ClassNotFoundException classNotFound) {
			JOptionPane.showMessageDialog(null, classNotFound.getMessage(),
					"Driver Not Found", JOptionPane.ERROR_MESSAGE);

			System.exit(1);
		}

		// ensure statement and connection are closed properly
		finally {

			try {
				statement.close();
				connection.close();
			}
			// handle exceptions closing statement and connection
			catch (SQLException sqlException) {
				JOptionPane.showMessageDialog(null, sqlException.getMessage(),
						"Database Error", JOptionPane.ERROR_MESSAGE);

				System.exit(1);

			}
		}

	} // end DisplayAuthors constructor

	public static void main(String[] args) {

		new DisplayAuthors();

	}

}
