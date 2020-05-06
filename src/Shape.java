package src;
public abstract class Shape extends ShapeComponent implements Comparable<Object>, Scalable 
{
	public Shape()
	{
		
		
	}
	
	public Shape(String name)
	{
		mName = name;
	}
	

	public String getName()
	{
		return mName;
	}
	
	public void setName(String name)
	{
		mName = name;
	}
	
	/*@Override
	public String toString()
	{
		return "Name = " + getName();
	} */
	
	@Override
	public boolean equals(Object o)
	{
		if(!(o instanceof Shape)) return false;
		else
		{
			Shape s = (Shape)o;			
			return getName().equals(s.getName());
		}
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
	//public abstract double getDistance(Shape other);
	
	private String mName;
	
	public String toString()
	{
		return "Shape: " + "Count: ";
	}
}