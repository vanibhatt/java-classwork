package reg.stu.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String f_name;
	private String l_name;
	private String password;
	private List<Course> courses;
	private int student_id;
	
	public Student(){
		this.f_name = "";
		this.l_name = "";
		this.password = "";
		this.courses = new ArrayList<Course>();
		this.setStudent_id(0);
	}
	
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Course> getCourses() {
		return courses;
	}
	
	public void setCourses(List<Course> course){
		this.courses = course;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	
}
