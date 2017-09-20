import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnections{
	private static String dbURL="jdbc:mysql://localhost:3306/EMP";
	private static String dbUser="root";
	private static String dbPassword="";
		
	
			
	public static Connection createConnection()
		{
			System.out.println("");
			Connection con =null;
			try
			{
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
				}
				catch(Exception e)
				{
					System.out.println(" unavle to load the the calss");
				}
				con=DriverManager.getConnection(dbURL,dbUser,dbPassword);

			}
			catch(SQLException sqe)
			{
				System.out.println("Error : while reating connetion to databse");
				sqe.printStackTrace();
			}
			return con;
		}
	
	}