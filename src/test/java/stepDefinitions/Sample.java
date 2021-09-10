package stepDefinitions;

public class Sample {

	public static void main (String[] arg)
	{	

		System.out.println("Tested");
		String text="Elby joby";
		for(int i=0;i<=text.length()-1;i++)
		{
			int count=0;
			for(int j=0;j<=text.length()-1;j++)
			{
				if(text.charAt(i)==text.charAt(j))
				{

					count++;

				}
			}

			if(!(text.charAt(i)==' '))
			{
				System.out.println("count osdfsdf the char '"+text.charAt(i)+"' = "+count);
			}
			text=text.replace(text.charAt(i)+"", " ");

		}
	}

}
