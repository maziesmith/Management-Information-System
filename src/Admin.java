import java.sql.SQLException;

public class Admin {
	Student s = new Student();
	Faculty f = new Faculty();
	private String admin_name;
	private String admin_pass;
	
	
	public String getadmin_pass() {
		return admin_pass;
	}
	
	public void setadmin_pass(String admin_pass) {
		this.admin_pass = admin_pass;
	}
	
	public String getadmin_name() {
		return admin_name;
	}
	
	public void setadmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	
	 public void admin_login(String user_name,String user_pass)
	 {
		 
	 }
	 
	 public void admin_logout()
	 {
		 
	 }
	 
	 public void admin_forgotpassword()
	 {
		 
	 }
	 
	 public void create_student(String s_name,String s_fathername,String s_mothername,String s_dob,String s_gender ,String s_year,String s_mobileno,String s_fathermobileno,String s_emailid, String s_degree)
	 {
		 
		s.sets_name(s_name);
		s.sets_fathername(s_fathername);
		s.sets_mothername(s_mothername);
		s.sets_dob(s_dob);
		s.sets_gender(s_gender);
		s.sets_year(s_year);
		s.sets_mobileno(s_mobileno);
		s.sets_fathermobileno(s_fathermobileno);
		s.sets_emailid(s_emailid);
		s.sets_degree(s_degree);
		
		 System.out.println(s_name +" "+ s_fathername+" " +s_mothername+" "+s_dob+" "+s_gender+" "+s_year+" "+s_mobileno+" "+s_fathermobileno+" "+s_emailid+" ");
		 try {
				s.addstudent(s);
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 }
	 
	 public void create_faculty(String f_name,String f_gender,String f_dob,String f_mobileno,String f_email_id,String f_researchfield)
	 {
		 f.setf_name(f_name);
		 f.setgender(f_gender);
		 f.setdob(f_dob);
		 f.setf_mobileno(f_mobileno);
		 f.setf_email_id(f_email_id);
		 f.setf_researchfield(f_researchfield);
		 System.out.println(f_name+" "+f_gender+" "+f_dob+" "+f_mobileno+" "+f_email_id+" "+f_researchfield+" ");
		 try {
				f.addfaculty(f);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
	 }
}
