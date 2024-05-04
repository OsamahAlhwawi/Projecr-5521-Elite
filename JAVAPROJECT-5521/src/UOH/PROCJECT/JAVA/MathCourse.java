package UOH.PROCJECT.JAVA;

class MathCourse extends Course {
    public MathCourse(String courseCode, String title,double courseHours) {
        super(courseCode, title, courseHours);
    }

    @Override
    public String getCourseTitle() {
        return "Math: " + title;
    }

	@Override
	public String getCourseCode() {
		// TODO Auto-generated method stub
		return "CourseCode: "+courseCode;
	}
}
