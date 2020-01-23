package hebbal.collections.TreeSet;

import java.util.Comparator;

public class DoubleSort implements Comparator<Double>
{

	@Override
	public int compare(Double i1, Double i2)
	{
		return i2.compareTo(i1);
	}
}


