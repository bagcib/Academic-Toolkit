/*
 * Author: Matthew Gerrior
 */
public class Course
{
    boolean hasHomework;
    /* bool hasLab;
    bool hasProject;
    bool hasQuiz;
    bool hasExam;
    bool hasMidterm;
    bool hasFinal; */

    Homework homeworkGrades;

    public Course()
    {
	this.hasHomework = true;
	/* this.hasLab = false;
	this.hasProject = false;
	this.hasQuiz = false;
	this.hasExam = false;
	this.hasMidterm = false;
	this.hasFinal = false; */
    }

    public void initializeCourse()
    {
	if (this.hasHomework)
	    homeworkGrades = new Homework(3.50, 10);
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