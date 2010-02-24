public class Assignment
{
    String type;
    double pctWeight;
    double grade;
    boolean dropped;

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
    }

    public void changeGrade(double newGrade)
    {
	grade = newGrade;
    }
}