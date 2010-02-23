/*
 * Author: Matthew Gerrior
 */

import java.util.Scanner;
public class Course
{
    String courseName;
    String semester;
    boolean hasHomework;
    /* bool hasLab;
    bool hasProject;
    bool hasQuiz;
    bool hasExam;
    bool hasMidterm;
    bool hasFinal; */

    Homework homeworkGrades = new Homework();

    public Course()
    {
	courseName = " ";
	semester = " ";
	this.hasHomework = false;
	/* this.hasLab = false;
	this.hasProject = false;
	this.hasQuiz = false;
	this.hasExam = false;
	this.hasMidterm = false;
	this.hasFinal = false; */
    }

    public Course(String courseName, String semester)
    {
	this.courseName = courseName;
	this.semester = semester;
	this.hasHomework = false;
    }

    public void setHomework(boolean hasHomework)
    {
	this.hasHomework = hasHomework;
	if (this.hasHomework)
	    {
		homeworkGrades.initialize();
	    }
    }

    public void initializeCourse()
    {
	// This function asks the user for the assignments
	// that the course has and sets the appropriate values.
	// This would best be implemented with dropdown menus
	// in a GUI.
	Scanner sc = new Scanner(System.in);
	String choice = "n";

	// Ask about homeworks
	System.out.println("Does this course have homework?");
	choice = sc.next();
	if(choice.equals("y"))
	    this.hasHomework = true;

	// Ask about labs
	System.out.println("Does this course have labs?");
	choice = sc.next();
	if(choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes"))
	   this.hasLab = true;

	// Ask about projects
	System.out.println("Does this course have projects?");
	choice = sc.next();
	if(choice.equals("y"))
	    this.hasProject = true;

	// Ask about quizzes
	System.out.println("Does this course have quizzes?");
	choice = sc.next();
	if(choice.equals("y"))
	    this.hasQuiz = true;

	// Ask about exams
	System.out.println("Does this course have exams?");
	choice = sc.next();
	if(choice.equals("y"))
	    this.hasExam = true;

	// Ask about midterm
	System.out.println("Does this course have a midterm?");
	choice = sc.next();
	if(choice.equals("y"))
	    this.hasMidterm = true;
	
	// Ask about final
	System.out.println("Does this course have a final?");
	choice = sc.next();
	if(choice.equals("y"))
	    this.hasFinal = true;
    }

    public void addHomework()
    {
	homeworkGrades.addGrade(90);
	homeworkGrades.addGrade(80);
    }

    public void printCourse()
    {
	homeworkGrades.printGrades();
    }

}