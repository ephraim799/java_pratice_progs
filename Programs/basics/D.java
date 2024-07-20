class D
{
	public static void m1()
	{
		System.out.println("m1 starts");
	}
	public static void main(String[] args)
	{
			System.out.println("main starts");
			D.m1();
			D.m1();
			System.out.println("main ends");
	}
	
}
