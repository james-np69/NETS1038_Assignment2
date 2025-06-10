package com.va.week6.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.va.week6.model.Student;

public class StudentDao {

// method for inserting values to db using preparedstatement. 	
	public int registerStudent(Student student) throws ClassNotFoundException {

		// create SQL statement
		String INSERT_USERS_SQL = " INSERT INTO student" + " ( userName, userEmail,  password, preferredName, name) VALUES "
				+ "(?, ? ,?, ?, ?);";
		int result = 0;
		Class.forName("com.mysql.cj.jdbc.Driver");

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/week6", "root",
				"Class123")) {
			PreparedStatement ps = connection.prepareStatement(INSERT_USERS_SQL);
			ps.setString(1, student.getUserName());
			ps.setString(2, student.getUserEmail());
			ps.setString(3, student.getPassword());
			ps.setString(4, student.getPreferredName());
			ps.setString(5, student.getName());

			System.out.println(ps);
			result = ps.executeUpdate();
		} catch (SQLException e) {
			printSQLException(e);
			
		}
		return result;
	}

	private void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {

				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();

				}
			}

		}

	}
}
