package com.innerclass1;

class Popcorn
{
	public void taste()
	{
		System.out.println("spicy");
	}
}
class Test3
{
	public static void main(String[] args)
	{
		Popcorn p=new Popcorn()
				{
		public void taste()
		{
			System.out.println("salty");
			
		}
		
				};	
				
				
				Popcorn p2=new Popcorn()
						{
					public void taste()
					{
						System.out.println("chocolate");
						taste1();
					}
					public void taste1()
					{
						System.out.println("chocgggggggggggglate");
					}
						};
				p.taste();
				p2.taste();
				
				Popcorn p1=new Popcorn();
				p1.taste();
				
				
	}
}