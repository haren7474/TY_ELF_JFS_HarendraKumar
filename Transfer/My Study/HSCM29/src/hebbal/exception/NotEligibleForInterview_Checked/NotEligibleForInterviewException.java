package hebbal.exception.NotEligibleForInterview_Checked;

public class NotEligibleForInterviewException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3679567514663809881L;
	private String message;
	
	public NotEligibleForInterviewException(String message)
	{
		this.message=message;
	}
	
	@Override
	public String getMessage()
	{
		return message;
	}
}
