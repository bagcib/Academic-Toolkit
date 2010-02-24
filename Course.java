import java.util.ArrayList;

public class Course
{
    String className;
    String semester;
    ArrayList<Assignment> assignments; // = new ArrayList<Assignment>();
    ArrayList<String> assignmentTypes; // = new ArrayList<String>();

    public Course()
    {
	className = " ";
	semester = " ";
    }

    public Course(String className, String semester)
    {
	this.className = className;
	this.semester = semester;
	assignments = new ArrayList<Assignment>();
	assignmentTypes = new ArrayList<String>();
    }

    public void addAssignment()
    {
	String type = "homework";
	double pctWeight = 3.50;
	double grade = 90;
	boolean dropped = false;
	assignments.add(new Assignment(type, pctWeight, grade, dropped));
    }

    public void printGrade()
    {
	System.out.println(assignments.get(0).grade);
    }
}