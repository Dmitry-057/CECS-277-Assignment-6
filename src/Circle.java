public class Circle extends Shape
{
	private int count, radius;
	public Circle(int mCount, int mRadius ) {
		count = mCount;
		radius = mRadius;
	}
	@Override
	public String display() {
		return ("Circle: Count = " + count + " Radius = " + radius);
	}
	
	/*
	public Circle()
	{
		this("No name circle");
	}
	
	public Circle(String name)
	{
		this(name);
	}
	
	public Circle(String name)
	{
		this(name, 0,0);
	}
	
	public Circle(String name, double xCenter, double yCenter)
	{
		this(name, xCenter, yCenter, 1);
	}
	
	public Circle(String name, double xCenter, double yCenter, double radius)
	{
		super(name);
		this.xCenter = xCenter;
		this.yCenter = yCenter;
		mRadius = radius;
		
	}
	
	public Circle(Circle c)
	{
		this("Copy of " + c.getName()), c.getCenterX(), c.getCenterY(), c.getRadius());
	}
	
	@Override
	public double getArea() 
	{
		return PI * mRadius * mRadius;
	}

	@Override
	public double getPerimeter() 
	{
		return 2 * PI * mRadius;
	}
	
	/*@Override
	public double getDistance(Shape other)
	{
		if(!(other instanceof Circle)) throw new InvalidDistanceComputationException("Circle", other.getClass().toString());
		else
		{
			Circle c = (Circle)other;
			return mCenter.getDistance(c.mCenter);
		}
	} */
	/*
	@Override
	public String toString()
	{
		return "Circle: " + super.toString() + ", Center: " + xCenter + " , " + yCenter + " Radius: " + mRadius;
	}
	*/
	/*@Override 
	public boolean equals(Object other)
	{
		if(!(other instanceof Circle)) throw new InvalidComparisonException("Circle",other.getClass().toString());
		else
		{
			Circle c = (Circle)other;
			return super.equals(c) && xCenter.equals(c.getCenterX) && yCenter.equals(c.getCenterY) && mRadius == c.mRadius;
		}
	} */
	
	/*@Override
	public int compareTo(Object arg0) 
	{
		if(!(arg0 instanceof Circle)) 
		{
			if(arg0 instanceof Point) return 1; // Circle > Point
			else return 0; // Should throw error
		}
		else
		{
			Circle c = (Circle)arg0;
			
			int answer = mCenter.compareTo(c.mCenter);
			if(answer != 0) return answer;
			
			if(mRadius < c.mRadius) return -1;
			else if(mRadius == c.mRadius)return 0;
			else return 1;
		}
	} */
	/*
	@Override
	public void scale(int scaleFactor)
	{
		mRadius = mRadius * scaleFactor;
	}
	
	public double getCenterX()
	{
		return xCenter;
	}
	
	public double getCenterY()
	{
		return yCenter;
	}
	
	public double getRadius()
	{
		return mRadius;
	}
	
	//private Point mCenter;
	private double xCenter;
	private double yCenter;
	private double mRadius;
	
	private static final double PI = 3.14159;
	*/
	
}