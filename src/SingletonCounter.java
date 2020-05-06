// Assignment 6
// Dmitry Merezhko	 ID: 025-947-712
// Charyl Enriquez   ID: 015392154
// Britney Khuu 	 ID: 018577765

public final class SingletonCounter
{
	private SingletonCounter()
	{
		//count++;
	}
	public static SingletonCounter getInstance()
	{
		return instance;
	}
	public int getCounter()
	{
		count++;
		return count;
	}
	public int count;
	private static SingletonCounter instance = new SingletonCounter();
}