package src;

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