import java.sql.ResultSet;
import java.sql.SQLException;

public class Faculty extends User{
	
	private String f_name;
	private String f_id;
	private String f_mobileno;
	private String dob;
	private int f_roomno;
	private String f_visitinghrs;
	private String f_email_id;
	private String f_researchfield;
	private String f_password;
	private String gender;
	
	
	public String getf_name() {
		return f_name;
	}
	
	public void setf_name(String f_name) {
		this.f_name = f_name;
	}

	public String getf_id() {
		return f_id;
	}

	public void setf_id(String f_id) {
		this.f_id = f_id;
	}

	public String getf_mobileno() {
		return f_mobileno;
	}

	public void setf_mobileno(String f_mobileno) {
		this.f_mobileno = f_mobileno;
	}

	public int getf_roomno() {
		return f_roomno;
	}

	public void setf_roomno(int f_roomno) {
		this.f_roomno = f_roomno;
	}

	public String getf_visitinghrs() {
		return f_visitinghrs;
	}

	public void setf_visitinghrs(String f_visitinghrs) {
		this.f_visitinghrs = f_visitinghrs;
	}

	public String getf_email_id() {
		return f_email_id;
	}

	public void setf_email_id(String f_email_id) {
		this.f_email_id = f_email_id;
	}

	public String getf_researchfield() {
		return f_researchfield;
	}

	public void setf_researchfield(String f_researchfield) {
		this.f_researchfield = f_researchfield;
	}
	
	public void update()
	{
		
	}
	
	public void update(int mob,String email,String visit ,String research) throws SQLException
	{
		String user ="select * from faculty";
		int data=0;
		ResultSet rs=ExecuteQuery.exeQuery(user);
		while(rs.next())
			{
				data = rs.getInt("userid");
			}
			String faculty_update = "update faculty set Mobile_no= '" + mob +"', Email_id ='" + email +"', Visiting_hrs= '" + visit +"', Research_fields= '" + research + "where Faculty_id="+ data+"')" ; 
	}
	public void generate_result()
	{
		
	}

	public String getf_password() {
		return f_password;
	}

	public void setf_password(String f_password) {
		this.f_password = f_password;
	}

	public String getdob() {
		return dob;
	}

	public void setdob(String dob) {
		this.dob = dob;
	}

	public String getgender() {
		return gender;
	}

	public void setgender(String gender) {
		this.gender = gender;
	}
	
	public void addfaculty(Faculty f) throws SQLException
	{
		
		String user_query = "insert into USER(password,usertype) values( '"+f.f_name.toLowerCase()+"','Faculty')";
		UpdateQuery.updateQuery(user_query);
		String rs = "select * from USER";
		int data = 0;
		ResultSet r = ExecuteQuery.exeQuery(rs);
		
		while(r.next())
		{
			data = r.getInt("userid");
		}
		String faculty_query = "insert into FACULTY values('"+data+"','"+f.f_name+"','"+f.gender+"','"+f.dob+"','"+f.f_mobileno+"','"+f.f_email_id+"','"+f.f_researchfield+"')";
		UpdateQuery.updateQuery(faculty_query);
		
		
		System.out.println("pagal in Faculty");
		
	}

		@Override
		void view() {
			// TODO Auto-generated method stub
			
		}

		@Override
		void update(String a, String x, String y, String z) throws SQLException {
			// TODO Auto-generated method stub
			
		}

		@Override
		void view(String x) throws SQLException {
			// TODO Auto-generated method stub
			
		}

}
