package UOH.PROCJECT.JAVA;

class ScienceCourse extends Course {
	    public ScienceCourse(String courseCode, String title,double courseHours) {
	        super(courseCode, title, courseHours);
	    }

	    @Override
	    public String getCourseTitle() {
	        return "Science: " + title;
	    }

		@Override
		public String getCourseCode() {
			// TODO Auto-generated method stub
			return "CourseCode: "+courseCode;
		}
	}


