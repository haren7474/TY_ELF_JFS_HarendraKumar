package hebbal.collections.HashMap.KeyIntegerValueString;

import java.util.Comparator;


public class IntegerOverride implements Comparator<Integer>
{
	@Override
	public int compare(Integer arg0, Integer arg1) 
	{
		return arg1-arg0;
	}
}
