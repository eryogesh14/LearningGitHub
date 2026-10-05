package amezon;

public class Reverse_string {
	
	public static void main(String[]args)
	{
		String name=" Yogesh ";
		
		String rvs= "";
		
		for(int i=name.length()-1;i>=0;i--)
			
		{
			
			rvs=rvs+name.charAt(i);
		}
		
		System.out.println(rvs);
		
	}

}
