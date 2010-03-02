import java.util.ArrayList;
<<<<<<< HEAD:Grader.java
import java.util.Scanner;

/**
 * This is the grade tracker in which users
 * will store their courses.
 */
=======

>>>>>>> 6bb1f91f13cdd69c56e277ea385ebb3762f90437:Grader.java
public class Grader
{
    double gpa;
    static ArrayList<Course> courses = new ArrayList<Course>();
<<<<<<< HEAD:Grader.java
    
    /**
     * This is the default constructor for the grader,
     * which initializes the user's GPA to 0.
     */
=======

>>>>>>> 6bb1f91f13cdd69c56e277ea385ebb3762f90437:Grader.java
    public Grader()
    {
	gpa = 0.00;
    }
<<<<<<< HEAD:Grader.java
   
    /**
     * This is a function that allows the user to drop a given course
     * from the grade tracker. Given the name of the course, it removes
     * that course from the ArrayList of courses.
     * @param dropName The name of the course which the user wishes
     * to drop.
     */
    public void DropCourse(String dropName)
    {
	for(int i = 0; i < courses.size(); i++)
	    {
		if(courses.get(i).className.equals(dropName))
		    courses.remove(i);
	    }
    }
    
    /**
     * This function calculates the average for each course
     * currently listed for the user, and then takes the average
     * of all of these courses to tell the user their overall average.
     */
    public void getAverages()
    {
	double average = 0.00;
	for (int i = 0; i < courses.size(); i++)
	    {
		System.out.println(courses.get(i));
		average += courses.get(i).average;
	    }
	average = average / courses.size();
	System.out.println("Total average is: " + average);
    }

    /**
     * This is a function to add a course to the grade tracker. It
     * makes a new course given the parameters, and adds it
     * to the arrayList of courses in the grade tracker.
     * @param courseName The name of the course to be added.
     * @param semester The semester in which the course is being taken.
     * @see Course
     */
=======

>>>>>>> 6bb1f91f13cdd69c56e277ea385ebb3762f90437:Grader.java
    public void addCourse(String courseName, String semester)
    {
	courses.add(new Course(courseName, semester));
    }

<<<<<<< HEAD:Grader.java
    /**
     * This is the main function that creates a new grade tracker
     * and greets the user.
     */
    public static void main(String [] args)
    {
	Grader userGrades = new Grader();
	System.out.println("Welcome to the academic tool kit.");
=======
    public static void main(String [] args)
    {
	Grader userGrades = new Grader();
	courses.add(new Course("Java Programming", "SP10"));
	courses.get(0).addAssignment();
	System.out.println("Average is: ");
	System.out.println(courses.get(0).getAverage("homework"));
	courses.get(0).addAssignment();
>>>>>>> 6bb1f91f13cdd69c56e277ea385ebb3762f90437:Grader.java
    }
}