import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

<<<<<<< HEAD:Course.java
/**
 * This is the course class, that will be used by the grader
 * to store important information about a course, such as
 * the assignments in the course, as well as the current
 * average for the course.
 * @author RPI Android Dev
 */
=======
>>>>>>> 6bb1f91f13cdd69c56e277ea385ebb3762f90437:Course.java
public class Course
{
    String className;
    String semester;
    double average;
    ArrayList<Assignment> assignments; // = new ArrayList<Assignment>();
    Map<String, Double> assignmentTypes; // = new ArrayList<String>();

<<<<<<< HEAD:Course.java
    /**
     * This is the default constructor for the course. It asks the user
     * for important information about the course, such as the name of the
     * course, and the semester in which it is being taken, then initializes
     * the assignments list, and assignments map.
     */
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

    /**
     * This is one of the constructors available for the Course class.
     * It initializes the class name, and the semester in which the class is
     * being taken, as well as initializing the average for the course to 0.
     * It also initializes the ArrayList of assignments for the course, as well
     * as the map that contains all the assignments and the weight for
     * a given assignment type.
     * @param className This is the name of the class that is being
     * initialized.
     * @param semester This is the semester in which the course
     * is being taken.
     */
=======
    public Course()
    {
	className = " ";
	semester = " ";
	average = 0.00;
    }

>>>>>>> 6bb1f91f13cdd69c56e277ea385ebb3762f90437:Course.java
    public Course(String className, String semester)
    {
	this.className = className;
	this.semester = semester;
	this.average = 0.00;
	assignments = new ArrayList<Assignment>();
	assignmentTypes = new HashMap<String, Double>();
    }

<<<<<<< HEAD:Course.java
    /**
     * This is a function to list all of the grades in the current course,
     * starting from the oldest grade first, all the way up to the latest
     * grade to be added, including all assignment types. This function
     * uses the toString() method to print the assignments and their
     * information.
     */
    public void printGrades()
    {
	for (int i = 0; i < assignments.size(); i++)
	    {
		System.out.println(assignments.get(i));
	    }
    }

    /**
     * This is a more specific function ot list every grade in the class,
     * given a certain assignment types. Like the default printGrades()
     * methods, this function starts at the oldest grade added, and prints
     * all grades of the given assignment type up until the most recently
     * added grade.
     * @param type This is the assignment type that will be printed by the
     * function, so that only the grades for the given assignment type will
     * be printed.
     */
    public void printGrades(String type)
    {
	for (int i = 0; i < assignments.size(); i++)
	    {
		if (assignments.get(i).type.equals(type))
		    System.out.println(assignments.get(i));
	    }
    }

    /**
     * This function allows users to edit grades that have been
     * previously stored in a class to reflect new information about
     * the grade. It asks the user to choose which assignment they wish
     * to modify, as well as the new grade that they received on the
     * assignment. The assignment is then updated to reflect this new
     * grade. In the future this function should have abilities to update
     * other information, such as the weight of the assignment. Also,
     * the function does not easily label the assignments for the user
     * to chose a grade to edit.
     */
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

    /**
     * This function is used to add a new assignment to the current
     * course. It gets the assignment type from the user, and searches
     * the assignments Map to check for the weight of the assignment.
     * It then gets the grade received and adds the assignment to the
     * course. It then updates the current average for the course.
     * @see Assingnment
     */
=======
>>>>>>> 6bb1f91f13cdd69c56e277ea385ebb3762f90437:Course.java
    public void addAssignment()
    {
	String type;
	double pctWeight;
	double grade;
	Scanner sc = new Scanner(System.in);

	// Ask for the assignment type
<<<<<<< HEAD:Course.java
=======
	/* 
	 * Best implemented as a drop-down menu
	 * with the assignment types that have been
	 * entered before?
	 */
>>>>>>> 6bb1f91f13cdd69c56e277ea385ebb3762f90437:Course.java
	System.out.println("Please enter the type of assignment: ");
	type = sc.next();

	// Ask for the percent weight
<<<<<<< HEAD:Course.java
=======
	// pctWeight = assignmentTypes.get(type);
>>>>>>> 6bb1f91f13cdd69c56e277ea385ebb3762f90437:Course.java
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
<<<<<<< HEAD:Course.java
	calcAverage();
    }
    
    /**
     * This function can be used to drop the lowest grade of a given
     * assignment type. This function cycles through all of the assignments
     * for a given course, and checks if they match the given assignment
     * type. If they do, the function checks to see if this assignment has the lowest
     * grade for the given assignment type. At the end of the function the assignment
     * with the lowest grade for the given assignment type will have it's dropped field
     * set to true.
     * @param type This is the assignment type that will have the lowest
     * grade dropped by this function.
     */
=======
    }
    
>>>>>>> 6bb1f91f13cdd69c56e277ea385ebb3762f90437:Course.java
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
<<<<<<< HEAD:Course.java
   
    /**
     * This function calculates the current average in the course
     * for all assignments currently added to the class. It will
     * iterate through every assignment in the course, taking the
     * average of all assignments, and storing them in the average
     * field of the class.
     * @see getAverage
     */
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

    /**
     * This function calculates the current average for a given
     * assignment type. Given an assignment type, it will cycle through
     * all of the assignments in the current course, looking for ones
     * that match the given assignment type. Assignments that match
     * the given type will be averaged.
     * @param type This is the assignment type of which the average
     * will be calculated for.
     * @return The average for the given assignment type.
     */
=======

>>>>>>> 6bb1f91f13cdd69c56e277ea385ebb3762f90437:Course.java
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

<<<<<<< HEAD:Course.java
    /**
     * This is a function to override the default Object.toString() for
     * the course class. This function returns the name of the course,
     * the semester that the course is being taken in, and the current
     * average for the course.
     * @return A string containing the name of the class, the semester
     * in which the class is being taken, and the average, seperated by
     * tabs.
     */
    public String toString()
    {
	return(className + '\t' + semester + '\t' + average);
=======
    public void printGrade()
    {
	System.out.println(assignments.get(0).grade);
>>>>>>> 6bb1f91f13cdd69c56e277ea385ebb3762f90437:Course.java
    }
}