package UOH.PROCJECT.JAVA;

import java.util.ArrayList;
import java.util.List;

class Student extends Person implements Role {
    private String studentID;
    private double hours;
    private List<Course> courses = new ArrayList<>();
    private List<Double> grades = new ArrayList<>();
    

    public Student(String name, int age, String studentID,String PhoneNumber) {
        super(name, age,PhoneNumber);
        this.studentID = studentID;
    }
    public void AddGrade(double grade,double hours) {
    grades.add(grade);
    this.hours+= hours;
    }
    public double calculatingGPA() throws Exception {
    	if(grades.isEmpty()) throw new Exception("students didnot pass any course");
    	double TotalPoints = 0;
    for (Double points : grades) {
    	
    	TotalPoints+= points;
	}
    	
    	return TotalPoints/hours;
    	
    }
    @Override
    public String getRoleName() {
        return "Student";
    }

    @Override
    public void performRole() {
        System.out.println("Performing student activities.");
    }

    public void enrollInCourse(Course course) {
        try {
            course.addStudent(this);
            courses.add(course);
            System.out.println("Enrolled in course: " + course.getCourseTitle());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void displayCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses enrolled.");
        } else {
            for (Course c : courses) {
                System.out.println(c.getCourseTitle());
            }
        }
    }
}