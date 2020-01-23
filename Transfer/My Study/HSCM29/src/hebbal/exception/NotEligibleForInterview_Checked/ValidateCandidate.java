package hebbal.exception.NotEligibleForInterview_Checked;

public class ValidateCandidate 
{
	public void validateCandidate(char mockAttended, int marks, char courseCompletionStatus, String referredBy) 
	{
		if (referredBy.equalsIgnoreCase("Imtiaz"))
		{
			System.out.println("You can Attend the interview as a special case since you are reffered by "+ referredBy+ " Sir");
		}
		
		else if(mockAttended=='y' && marks>60 && courseCompletionStatus=='y')
				{
					System.out.println("You can Attend the interview");
				} 
		else
		{
			try 
			{
			throw new NotEligibleForInterviewException("You can not attend the interview.");
			}
			catch(NotEligibleForInterviewException e)
			{
				e.printStackTrace();
			}
		}
		
	}
}
