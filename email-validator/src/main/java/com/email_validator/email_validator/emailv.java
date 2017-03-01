package com.email_validator.email_validator;

public class emailv {
	
	public static int checkAt(String test)
	{
		int count = 0;
		
		for(int i=0; i<test.length(); i++)
		{
			if(test.charAt(i)=='@')
			{
				count++;
			}
		}
		
		return count;
	}
	
	public static int checkDot(String test)
	{
		int count = 0;
	
		for(int i=0; i<test.length(); i++)
		{
				if(test.charAt(i)=='.')
				{
					count++;
				}
		}
	
	return count;	
	}
	
	public static int checkValid(String test)
	{
		int passed = 0;
		if(checkAt(test)==1)
		{
			passed++;
		}
		if(checkDot(test)>0)
		{
			passed++;
		}
		return passed;
	}

	public static boolean checkDotCom(String test)
	{
		boolean passed = false;
		char em, oh, see, dot;
		em = test.charAt(test.length()-1);
		oh = test.charAt(test.length()-2);
		see = test.charAt(test.length()-3);
		dot = test.charAt(test.length()-4);
		
		if((em=='m')&&(oh=='o')&&(see == 'c')&&(dot=='.'))
		{
			passed = true;
		}
		
		return passed;
	}
	
	public static boolean checkStartLetter(String test)
	{
		boolean passed = false;
		char startingCh = test.charAt(0);
		if(((startingCh>=65)&&(startingCh<=90)) ||((startingCh>=97)&&(startingCh<=122)))
		{
			passed=true;
		}
		return passed;
	}
	
	public static boolean checkAllTests(String test)
	{
		boolean passed = false;
		
		if((checkValid(test)==2)&&(checkStartLetter(test)==true)&&(checkDotCom(test)==true))
		{
			passed = true;
		}
		return passed;
	}
	
}
