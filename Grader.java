import java.util.ArrayList;
import java.util.Scanner;

public class Grader
{
    double gpa;
    static ArrayList<Course> courses = new ArrayList<Course>();

    public Grader()
    {
	gpa = 0.00;
    }
   
    public void DropCourse(String dropName)
    {
	for(int i = 0; i < courses.size(); i++)
	    {
		if(courses.get(i).className.equals(dropName))
		    courses.remove(i);
	    }
    }
    
    public void getAverages()
    {
	double average;
	for (int i = 0; i < courses.size(); i++)
	    {
		System.out.println(courses.get(i));
		average += courses.get(i).average;
	    }
	average = average / courses.size();
	System.out.println("Total average is: " + average);
    }

    public void addCourse(String courseName, String semester)
    {
	courses.add(new Course(courseName, semester));
    }

    public static void main(String [] args)
    {
	Grader userGrades = new Grader();
	System.out.println("Welcome to the academic tool kit.");
    }
}