package simple;

import java.util.List;

public class LongWord {

	public static void main(String args[]) 
	{
		
	}
	
	
	String findLongestWord(String s, List d) 
	{
		int maxLen = 0;
		int index = -1;
		int sLen = s.length();

		int len = d.size();

		for(int i=0;i<len;i++)
		{
			String str = (String) d.get(i);
			int index1 = 0;
			int index2 = 0;
			int currLen = ((String) d.get(i)).length();


			while(index1<sLen && index2<currLen)
			{
				if(s.charAt(index1)!=str.charAt(index2))
				{
					index1++;
				}
				else
				{
					index1++;
					index2++;
				}


				if(index2==currLen)
				{
					if(currLen>maxLen)
					{
						maxLen = currLen;
						index = i;
					}     
					else if(currLen == maxLen)
					{
						//if(d.get(i).compareTo(d.get(index))<0)
						{
							index = i;
						}
					}
				}
			}
		
		}
		return "1";
		//return (index!=-1)?d.get(index):"";

	}

			
}
