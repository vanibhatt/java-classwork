package reg.stu.model;

public class Course {
	private String course_name;
	private int course_id;
	private int course_credit;
	private String instructor_name;
	private int Student_id;
	
	public Course(){
		this.setCourse_name("");
		this.setCourse_credit(0);
		this.setInstructor_name("");
		this.setCourse_id(0);
		this.setStudent_id(0);
	}

	public int getCourse_credit() {
		return course_credit;
	}

	public void setCourse_credit(int course_credit) {
		this.course_credit = course_credit;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getInstructor_name() {
		return instructor_name;
	}

	public void setInstructor_name(String instructor_name) {
		this.instructor_name = instructor_name;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public int getStudent_id() {
		return Student_id;
	}

	public void setStudent_id(int student_id) {
		Student_id = student_id;
	}
}
