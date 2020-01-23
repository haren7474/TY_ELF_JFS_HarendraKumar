package hebbal.exception.NotEligibleForMarriage_Check;

public class CheckMarriageEligibility 
{
	public void validateEligibility(char gender, int age)
	{
		if((gender=='m' && age>21) ||(gender=='f' && age>18))
		{
			System.out.println("Congratulations, you can get married");			
		}
		
		else
		{
			try
			{
				throw new NotEligbleForMarriageException("You can't get married wait for few years");
			}
			
			catch(NotEligbleForMarriageException e)
			{
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
	}
}
