package UOH.PROCJECT.JAVA;

public class Grade {
	private Student student;
    private Course course;
    
    protected double Hours;
	protected Double Grade = null;

    public Grade(Student student, Course course, String grade) {
        this.student = student;
        this.course = course;
        this.Hours = course.courseHours;
        setGrade(grade);
        addstudentsgrade();
    }
    private void addstudentsgrade() {
    	
    double points = Hours*Grade;
    student.AddGrade(points,Hours);
	}
	private void setGrade(String grade) {
		switch (grade.toUpperCase()) {
		case "A+": this.Grade = 4.00; break;
		case "A": this.Grade = 3.75; break;
		case "B+": this.Grade = 3.50; break;
		case "B": this.Grade = 3.00; break;
		case "C+": this.Grade = 2.50; break;
		case "C": this.Grade = 2.00; break;
		case "D+": this.Grade = 1.5; break;
		case "D": this.Grade = 1.00; break;
		case "F": this.Grade = 0.00; break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + grade);
		}
	}

}


