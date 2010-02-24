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
    
    public void dropLowest(String type)
    {
	int index = 0;
	double lowestGrade = 100;

	for(int i = 0; i < assignments.size(); i++)
	    {
		if(assignments.get(i).grade < lowestGrade && assignments.get(i).type.equals(type))
		    {
			lowestGrade = assignments.get(i).grade;
			index = i;
		    }
	    }
	assignments.get(index).dropped = true;
    }

    public void printGrade()
    {
	System.out.println(assignments.get(0).grade);
    }
}