import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateQuery  extends DBconnections
{
	
	
	 public static void  updateQuery(String Query)
	 {
		 System.out.println("this is updating");
		 Connection con= createConnection();
			Statement st = null;
			
			try
			{
				st = con.createStatement();
			} 
			catch (SQLException e)
			{
				
				e.printStackTrace();
			}
			
			try 
			{

				System.out.println("hahahahahhahahahahhahah");
				st.executeUpdate(Query);
				
			} 
			catch (SQLException ex) 
			{
				ex.printStackTrace();
			}

			
	 }
}