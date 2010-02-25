import java.util.ArrayList;

public class Grader
{
    double gpa;
    static ArrayList<Course> courses = new ArrayList<Course>();

    public Grader()
    {
	gpa = 0.00;
    }

    public void addCourse(String courseName, String semester)
    {
	courses.add(new Course(courseName, semester));
    }

    public static void main(String [] args)
    {
	Grader userGrades = new Grader();
	courses.add(new Course("Java Programming", "SP10"));
	courses.get(0).addAssignment();
	System.out.println("Average is: ");
	System.out.println(courses.get(0).getAverage("homework"));
    }
}