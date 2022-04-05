class Sort
{
	static void sum(int... x)
	{
		int sum=0;
		for(int x1: x)
			sum=sum+x1;
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		sum(12,26,56);
		sum(12,54);
		sum(98,10);
	}
}