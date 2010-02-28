import java.util.Date;
public class Assignment
{
    String type;
    double pctWeight;
    double grade;
    boolean dropped;
    Date dateAdded;

    public Assignment()
    {
	type = " ";
	pctWeight = 0;
	grade = 0;
	dropped = false;
    }

    public Assignment(String type, double pctWeight, double grade, boolean dropped)
    {
	this.type = type;
	this.pctWeight = pctWeight;
	this.grade = grade;
	this.dropped = dropped;
	this.dateAdded = new Date();
	System.out.println("This assignment was added on: " + dateAdded);
    }

    public void changeGrade(double newGrade)
    {
	grade = newGrade;
    }
}