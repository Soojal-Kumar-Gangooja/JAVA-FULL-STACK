import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.DriverManager;

public class Main {

	public static void main(String[] args){

		PreparedStatement preSt = null;
		Statement st = null;

		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb","root","root")){

			Class.forName("com.mysql.cj.jdbc.Driver");
			

		}catch(Exception e){

			System.out.println( e.getMessage() );

		}

	}

}