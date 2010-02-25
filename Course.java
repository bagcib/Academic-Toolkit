import java.util.ArrayList;
import java.util.Scanner;

public class Course
{
    String className;
    String semester;
    double average;
    ArrayList<Assignment> assignments; // = new ArrayList<Assignment>();
    ArrayList<String> assignmentTypes; // = new ArrayList<String>();

    public Course()
    {
	className = " ";
	semester = " ";
	average = 0.00;
    }

    public Course(String className, String semester)
    {
	this.className = className;
	this.semester = semester;
	this.average = 0.00;
	assignments = new ArrayList<Assignment>();
	assignmentTypes = new ArrayList<String>();
    }

    public void addAssignment()
    {
	String type;
	double pctWeight;
	double grade;
	Scanner sc = new Scanner(System.in);

	// Ask for the assignment type
	/* 
	 * Best implemented as a drop-down menu
	 * with the assignment types that have been
	 * entered before?
	 */
	System.out.println("Please enter the type of assignment: ");
	type = sc.next();

	// Ask for the percent weight
	System.out.println("Please enter the percentage weight: ");
	pctWeight = sc.nextDouble();

	// Ask for the grade received
	System.out.println("Please enter the grade you received: ");
	grade = sc.nextDouble();

	assignments.add(new Assignment(type, pctWeight, grade, false));
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

    public double getAverage(String type)
    {
	int sum = 0;
	int numOfGrades = 0;
	double average = 0.00;
	for (int i = 0; i < assignments.size(); i++)
	    {
		if(assignments.get(i).type.equals(type) && assignments.get(i).dropped != true)
		    {
			sum += assignments.get(i).grade;
			numOfGrades++;
		    }
	    }
	if(numOfGrades > 0)
	    average = sum / numOfGrades;
	return average;
    }

    public void printGrade()
    {
	System.out.println(assignments.get(0).grade);
    }
}