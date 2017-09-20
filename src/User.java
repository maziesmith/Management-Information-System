import java.sql.SQLException;

abstract public class User {	

	protected int username;
	protected String password;
	
	
	public String getpassword() 
	{
		return password;
	}
	
	public void setpassword(String password) 
	{
		this.password = password;
	}
	
	public int getusername() 
	{
		return username;
	}
	
	public void setusername(int username) 
	{
		this.username = username;
	}
	
	public void loqout()
	{
		
	}
	
	 public void login(String user_name,String user_pass)
	 {
		 
	 }
	 
	 public void forgotpassword()
	 {
		 
	 }
	 
	 abstract void update();
	 
	 abstract void view(String x) throws SQLException;

	void view() {
		// TODO Auto-generated method stub
		
	}

	void update(String a, String x, String y, String z) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	

}
