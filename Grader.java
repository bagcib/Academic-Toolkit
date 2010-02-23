public class Grader
{
    static Course course1 = new Course();

    public Grader()
    {
	System.out.println("Welcome to the RPI Grade tracker.");
    }

    public static void main(String[] arguments)
    {
	Grader gradeAvg = new Grader();
	course1.initializeCourse();
	course1.addHomework();
	course1.printCourse();
    }
}