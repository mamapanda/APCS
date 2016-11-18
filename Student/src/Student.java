import java.util.Scanner;

public class Student
{
	private String firstLastName;
	private double averageQuizScore;
	private int totalQuizScore; 
	private int quizCount;
	
	public Student(String firstLastName)
	{
		this.firstLastName = firstLastName;
		totalQuizScore = 0;
		averageQuizScore = 0;
		quizCount = 0;
	}
	public void addQuiz(int newScore)
	{
		averageQuizScore = (quizCount * averageQuizScore + newScore) / (++quizCount);
		totalQuizScore += newScore;
	}
	public double getAverageScore()
	{
		return Math.round(100.0 * averageQuizScore) / 100.0;
	}
	public String getName()
	{
		return firstLastName;
	}
	public int getTotalScore()
	{
		return totalQuizScore;
	}
	/*public static void main(String[] args)
	{
		Student student;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the student's name (first + last): ");
		String studentName = in.nextLine();
		student = new Student(studentName);
		while(true)
		{
			while(true)
			{
				System.out.print("Enter " + student.getName() + "'s quiz score: ");
				int newQuiz = in.nextInt(); in.nextLine();
				student.addQuiz(newQuiz);
				System.out.print("Add another quiz? (y/n): ");
				String cont = in.nextLine();
				if(!cont.equalsIgnoreCase("y")) break;
			}
			System.out.println();
			System.out.println(student.getName() + "'s average quiz score: " + student.getAverageScore());
			System.out.println(student.getName() + "'s total quiz score: " + student.getTotalScore());
			System.out.print("Would you like to add more scores? (y/n): ");
			String cont = in.nextLine();
			if(!cont.equalsIgnoreCase("y")) break;
		}
	}*/
}