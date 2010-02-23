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
	Scanner sc = new Scanner(System.in);
	String choice = "n";
	System.out.println("Does this course have homework?");
	choice = sc.next();
	if(choice.equals("y"))
	    {
		homeworkGrades.initialize();
		this.hasHomework = true;
	    }
	   // if (this.hasHomework)
	   //  homeworkGrades = new Homework(3.50, 10);
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