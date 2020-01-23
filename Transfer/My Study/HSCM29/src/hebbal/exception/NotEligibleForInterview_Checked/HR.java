package hebbal.exception.NotEligibleForInterview_Checked;

import java.util.Scanner;

public class HR 
{	
	static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args)
	{
		ValidateCandidate vc= new ValidateCandidate();
		char mockAttended= checkmockAttended();
		int marks= getMarks();
		char courseCompletionStatus= checkCourseCompletion();
		String referredBy= getReferredBY();
		vc.validateCandidate(mockAttended, marks, courseCompletionStatus, referredBy);
	}
	
	public static char checkmockAttended()
	{
		System.out.println("If you have attended Mock then Type 'y'\nIf you have not attended Mock then Type 'n'");
		char ch= sc.next().charAt(0);
		return ch;
	}
	
	public static char checkCourseCompletion()
	{
		System.out.println("If you have completed course then Type 'y'\nIf you have not completed course then Type 'n'");
		char ch1= sc.next().charAt(0);
		return ch1;
	}
	
	public static int getMarks()
	{
		System.out.println("Please enter you marks");
		int marks= sc.nextInt();
		return marks;		
	}
	
	public static String getReferredBY()
	{
		System.out.println("Who has referred you ");
		String referredBy= sc.next();
		return referredBy;		
	}
}
