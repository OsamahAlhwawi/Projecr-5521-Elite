package UOH.PROCJECT.JAVA;


public class Main {
    public static void main(String[] args) throws Exception {
      Student One = new Student("Osamah", 21, "202101731", "0509466280");
      Student Two = new Student("ANWAR", 21, "202165511", "0509441480");
      Student Three = new Student("ALI", 21, "202155541", "0509545151");
      Faculty facutly = new Faculty("Faisal", 35, "22011", "0503639575");
      MathCourse MC = new MathCourse("5501", "Calculus I",3);
      ScienceCourse SC = new ScienceCourse("5599", "Biology I",3.5);
      One.enrollInCourse(MC);
      Two.enrollInCourse(SC);
      Three.enrollInCourse(SC);
      Three.enrollInCourse(MC);
      new Grade(One,MC,"A+");
      new Grade(Two,SC,"A+");
      new Grade(Three,MC,"B+");
      new Grade(Three,SC,"A+");
      System.out.printf("%.2f\n",Three.calculatingGPA());
      Three.displayCourses();
      One.displayInfo();
      Two.performRole();
      facutly.displayInfo();
      
    }
}