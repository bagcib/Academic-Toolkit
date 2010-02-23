/*
 * Author: Matthew Gerrior
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Homework extends Assignment
{
    double average;
    ArrayList<Double> grades; // = new ArrayList<Double>();

    public Homework()
    {
	super("Homework", 0, 0);
	this.average = 0.00;
    }

    public Homework(double pctWeight, int numOfAssignment)
    {
	super("Homework", numOfAssignment, pctWeight);
	this.average = 0.00;
    }

    public void initialize()
    {
	Scanner sc = new Scanner(System.in);
	int numOfHomeworks;
	double pctWeight;
	System.out.println("Please enter the number of homeworks.");
	numOfHomeworks = sc.nextInt();
	System.out.println("Please enter the percent weight.");
	pctWeight = sc.nextDouble();
	this.numOfAssignment = numOfHomeworks;
	this.pctWeight = pctWeight;
	this.grades = new ArrayList<Double>();
    }

    public void addGrade(double grade)
    {
	this.grades.add(grade);
    }

    public void printGrades()
    {
	System.out.println(grades.get(0));
	System.out.println();
	System.out.println(grades.get(1));
	System.out.println();
    }
}