import java.util.Date;

/**
 * This is the assignment class that will be used by the grader to store
 * assignments. It includes all the necessary details of an assignment,
 * including the type of assignment, the weight of the assignment, the
 * grade received on the assignment, whether or not the assignment
 * will be dropped, and the date on which the user added this new
 * assignment.
 * @author RPI Android Dev
 * @see Course
 * @see Grader
 */
public class Assignment
{
    String type;
    double pctWeight;
    double grade;
    boolean dropped;
    Date dateAdded;

    /**
     * This is the default constructor for the assignment class.
     * It sets the type of assignment to be blank, the weight of
     * the assignment to be 0, the grade received on the assignment
     * to be 0, and whether or not the grade is dropped is set to false.
     */
    public Assignment()
    {
	type = " ";
	pctWeight = 0;
	grade = 0;
	dropped = false;
    }

    /**
     * This is the constructor for the assignment class. It will store all
     * required fields for an assignment object, and also tells the user
     * that the assignment has been uploaded successfully.
     * @param type This is the type of assignment that is being uploaded, such
     * as homework, or an exam.
     * @param pctWeight This is the weight of the assignment in terms of percentage
     * of the total grade for the course.
     * @param grade This is the grade that the user received on the assignment,
     * and should be between 0 and 100.
     * @param dropped This tells the grader whether or not to include the given
     * assignment in any grade calculations, and should be false by default.
     */
    public Assignment(String type, double pctWeight, double grade, boolean dropped)
    {
	this.type = type;
	this.pctWeight = pctWeight;
	this.grade = grade;
	this.dropped = dropped;
	this.dateAdded = new Date();
	System.out.println("This assignment was added on: " + dateAdded);
    }

    /**
     * This function overrides the default Object.toString() method, so that
     * asignments can be more easily printed, with important data included,
     * such as the type of assignment, weight, grade received, and date uploaded.
     */
    public String toString()
    {
        return(type + '\t' + pctWeight + '\t' + grade + '\t' + dateAdded);
    }

    /**
     * This function will overwrite the current grade with the
     * new grade that is passed into the function, allowing users
     * to correct their grades when they are changed.
     * @param newGrade This is the new grade that the user has
     * on the assignment, and will be used to replace the old grade.
     */
    public void changeGrade(double newGrade)
    {
	grade = newGrade;
    }
}