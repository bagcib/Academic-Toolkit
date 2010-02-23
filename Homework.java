import java.util.ArrayList;

public class Homework extends Assignment
{
    double average;
    ArrayList<Double> grades = new ArrayList<Double>();

    public Homework(double pctweight, int numOfAssignment)
    {
	super("Homework", numOfAssignment, pctweight);
	this.average = 0.00;
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