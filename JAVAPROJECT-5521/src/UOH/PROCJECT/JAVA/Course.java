package UOH.PROCJECT.JAVA;

import java.util.ArrayList;
import java.util.List;

abstract class Course {
	protected String courseCode;
	protected String title;
	protected double courseHours;
	protected List<Student> enrolledStudents = new ArrayList<Student>();

	public Course(String courseCode, String title,double courseHours) {
		this.courseCode = courseCode;
		this.title = title;
		this.courseHours = courseHours;
	}

	public abstract String getCourseTitle();
	public abstract String getCourseCode();

	public void addStudent(Student student) throws Exception {
		if (enrolledStudents.size() >= 30) {
			throw new Exception("Course full. Cannot enroll more students.");
		}
		enrolledStudents.add(student);
	}
	

}
