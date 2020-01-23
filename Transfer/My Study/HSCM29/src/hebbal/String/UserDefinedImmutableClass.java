package hebbal.String;

final class UserDefinedImmutableClass 
{	
	final int x;
	UserDefinedImmutableClass(int x)
	{
		this.x=x;
	}
	
	public UserDefinedImmutableClass modify(int x)
	{
		if(this.x!=x)
		{
			return new UserDefinedImmutableClass(x);
		}
		else
			return this;
	}
}

