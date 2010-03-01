import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Course
{
    String className;
    String semester;
    double average;
    ArrayList<Assignment> assignments; // = new ArrayList<Assignment>();
    Map<String, Double> assignmentTypes; // = new ArrayList<String>();

    public Course()
    {
	// Initialize the variables
	String className;
	String semester;
	Scanner sc = new Scanner(System.in);

	// Ask the user for information about the course
	System.out.println("Please enter the name of the course: ");
	className = sc.next();
	System.out.println("Please enter the semester: ");
	semester = sc.next();
	
	// Set the course information
	this.className = className;
	this.semester = semester;
	average = 0.00;
	assignments = new ArrayList<Assignment>();
	assignmentTypes = new HashMap<String, Double>();
    }

    public Course(String className, String semester)
    {
	this.className = className;
	this.semester = semester;
	this.average = 0.00;
	assignments = new ArrayList<Assignment>();
	assignmentTypes = new HashMap<String, Double>();
    }

    public void printGrades()
    {
	for (int i = 0; i < assignments.size(); i++)
	    {
		System.out.println(assignments.get(i));
	    }
    }

    public void printGrades(String type)
    {
	for (int i = 0; i < assignments.size(); i++)
	    {
		if (assignments.get(i).type.equals(type))
		    System.out.println(assignments.get(i));
	    }
    }

    public void editGrade()
    {
	int index;
	Assignment temp;
	Scanner sc = new Scanner(System.in);
	printGrades();
	System.out.println("Please enter the number of the assignment you wish to modify: ");
	index = sc.nextInt();
	temp = assignments.get(index);
	System.out.println("Please enter your new grade: ");	
	temp.grade = sc.nextDouble();
	assignments.set(index, temp);
	printGrades();
    }

    public void addAssignment()
    {
	String type;
	double pctWeight;
	double grade;
	Scanner sc = new Scanner(System.in);

	// Ask for the assignment type
	System.out.println("Please enter the type of assignment: ");
	type = sc.next();

	// Ask for the percent weight
	if (assignmentTypes.get(type) == null)
	    {
		System.out.println("Please enter the percentage weight: ");
		pctWeight = sc.nextDouble();
		assignmentTypes.put(type, pctWeight);
	    }
	else
	    pctWeight = assignmentTypes.get(type);

	// Ask for the grade received
	System.out.println("Please enter the grade you received: ");
	grade = sc.nextDouble();

	assignments.add(new Assignment(type, pctWeight, grade, false));
	calcAverage();
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
    
    public void calcAverage()
    {
	int sum = 0;
	int numOfGrades = 0;
	double average = 0.00;
	for (int i = 0; i < assignments.size(); i++)
	    {
		if(assignments.get(i).dropped != true)
		    {
			sum += assignments.get(i).grade;
			numOfGrades++;
		    }
	    }
	average = sum / numOfGrades;
	this.average = average;
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

    public String toString()
    {
	return(className + '\t' + average);
    }
}