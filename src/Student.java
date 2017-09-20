import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student extends User {
	private int s_rollno;
	private String s_name;
	private String s_fathername;
	private String s_mothername;
	private String s_dob;
	private String s_gender;
	private String  s_mobileno;
	private String s_fathermobileno;
	private String s_emailid;
	private String s_degree;
	
	private String s_year;
	private String s_password;
	
	
	
	public int gets_rollno() {
		return s_rollno;
	}
	
	public void sets_rollno(int s_rollno) {
		this.s_rollno = s_rollno;
	}
	
	public String gets_name() {
		return s_name;
	}
	
	public void sets_name(String s_name) {
		this.s_name = s_name;
	}

	public String gets_fathername() {
		return s_fathername;
	}

	public void sets_fathername(String s_fathername) {
		this.s_fathername = s_fathername;
	}

	public String gets_mothername() {
		return s_mothername;
	}

	public void sets_mothername(String s_mothername) {
		this.s_mothername = s_mothername;
	}

	public String gets_dob() {
		return s_dob;
	}

	public void sets_dob(String s_dob) {
		this.s_dob = s_dob;
	}

	public String gets_gender() {
		return s_gender;
	}

	public void sets_gender(String s_gender) {
		this.s_gender = s_gender;
	}

	public String gets_mobileno() {
		return s_mobileno;
	}

	public void sets_mobileno(String s_mobileno2) {
		this.s_mobileno = s_mobileno2;
	}

	public String gets_fathermobileno() {
		return s_fathermobileno;
	}

	public void sets_fathermobileno(String s_fathermobileno) {
		this.s_fathermobileno = s_fathermobileno;
	}

	public String gets_emailid() {
		return s_emailid;
	}

	public void sets_emailid(String s_emailid) {
		this.s_emailid = s_emailid;
	}

	public String gets_degree() {
		return s_degree;
	}

	public void sets_degree(String s_degree) {
		this.s_degree = s_degree;
	}


	public String gets_year() {
		return s_year;
	}

	public void sets_year(String s_year) {
		this.s_year = s_year;
	}
	
	public void update()
	{
		
	}
	
	public void view()
	{
		
	}
	
	public void register_courses()
	{
		
	}

	public String gets_password() {
		return s_password;
	}

	public void sets_password(String s_password) {
		this.s_password = s_password;
	}
	
	public void addstudent(Student s) throws SQLException 
	{
		//int s_rollno = s.gets_rollno();
		String student_query = "insert into student1(Student_Name,Father_Name,Mother_Name,DOB,Gender,Year,Student_Mob_No,Father_Mob_No,Student_email_id,Degree)values('"+s.s_name+"', '"+s.s_fathername+"', '"+s.s_mothername+"', '"+s.s_dob+"', '"+s.s_gender+"', '"+s.s_year+"', '"+s.s_mobileno+"','"+s.s_fathermobileno+"','"+s.s_emailid+"','"+s.s_degree+"')";
		UpdateQuery.updateQuery(student_query);
		String i = "select Roll_No from student1 where Student_Name = '"+s.s_name+"'";
	
		DBconnections db = new DBconnections();
		Connection con= db.createConnection();
		Statement st = null;
		
		try 
		{
			st = con.createStatement();
		}
		catch (SQLException e)
		{
			
			e.printStackTrace();
		}
		
		ResultSet rs = null;
		
		try 
		{
			rs = st.executeQuery(i);
			System.out.println(rs);
		}
		catch (SQLException ex) 
		{
			ex.printStackTrace();
		}

		//int i = s.s_rollno;
		//System.out.println(i);
		String password = s.s_name.toLowerCase();
		s.s_password = password;
		//String user_query = "insert into user1(Roll_No,password) values('"+i+"','"+s.s_password+"')";
		//UpdateQuery.updateQuery(user_query);
		System.out.println("User table entry is done..........!!!!!");
		
	}
	public  void view(String user)
	{
		int age=0;
		int year = 0;
		String fname=null;
		System.out.println("this is in sudent view");
		String sql= "Select * from info where name='"+user+"' " ;
		System.out.println("this is in sudent view");
		int data = 0;
		ResultSet rs = ExecuteQuery.exeQuery(sql);
		try
		{
			
			if (rs.next())
			{
				year=rs.getInt("year");
				age=rs.getInt("age");
				fname = rs.getString("fname");
			}
			
			System.out.println(year + " "+ age + " " +fname);
			
				
				this.sets_rollno(age);
				this.sets_dob("1994");
				this.sets_fathername(fname);
				
		}
		catch(Exception e)
		{
			System.out.println("ye exception h bhai "+ e);
		}
	}
	public void update(String mob,String email,String f_number) throws SQLException
	{
		String user ="select * from student";
		
		int data=0;
		ResultSet rs=ExecuteQuery.exeQuery(user);
		if(rs.next())
			{
				data = rs.getInt("roll_no");
				System.out.println(data);
			}
			String s_update = "update student set mobile_no= '" + mob +"', email_id ='" + email +"', f_number= '" + f_number + "' where roll_no="+ data+"" ; 
			System.out.println(s_update);
			UpdateQuery.updateQuery(s_update);
	}

	@Override
	void update(String a, String x, String y, String z) throws SQLException {
		// TODO Auto-generated method stub
		
	}


}