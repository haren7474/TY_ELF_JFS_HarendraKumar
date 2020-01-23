package hebbal.exception.NotEligibleForMarriage_Check;

@SuppressWarnings("serial")
public class NotEligbleForMarriageException extends Exception 
{
	private String msg;

	public NotEligbleForMarriageException(String msg) 
	{
		this.msg = msg;
	}

	@Override
	public String getMessage() 
	{
		return msg;
	}
}
