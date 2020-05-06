package src;
public final class SingletonCounter
{
	public SingletonCounter()
	{
		count=0;
	}
	public SingletonCounter getInstance()
	{
		return instance;
	}
	private int count;
	private static SingletonCounter instance= new SingletonCounter();
}