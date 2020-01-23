package hebbal.collections.TreeSet;

import java.util.Comparator;

public class CharacterDesc implements Comparator<Character> 
{
	@Override
	public int compare(Character ch1, Character ch2) 
	{
		return ch2.compareTo(ch1);
	}
}
