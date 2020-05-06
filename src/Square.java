public class Square extends Shape
{
	private int count, side;
	public Square(int mCount, int mSide ) {
		count = mCount;
		side = mSide;
	}
	@Override
	public String display() {
		return ("Square: Count = " + count + " Side = " + side);
	}
	
	/*
	public Square() 
	{
		this("NoNameSquare");
	}
	
	public Square(String name)
	{
		this(name,3);
	}
	
	public Square(String name, int side)
	{
		super(name);
		mSide = side;
		
	}
	
	public double getArea()
	{
		return mSide * mSide;
	}
	
	public double getPerimeter()
	{
		return mSide * 4;
	}
	
	/* public double getDistance(Shape other)
	{
		if(!(other instanceof Square)) throw new InvalidDistanceComputationException("Square", other.getClass().toString());
		else
		{
			Square s = (Square)other;
			return getCorner().getDistance(s.getCorner());
		}
	} 
	
	@Override
	public String toString()
	{
		return "Square: " + getName() + ", Side: " + mSide;
	}
	
	/*@Override
	public boolean equals(Object other)
	{
		if(!(other instanceof Square)) throw new InvalidComparisonException("Square", other.getClass().toString());
		else
		{
			Square s = (Square)other;
			return this.getArea() == s.getArea();
		}
	} */
	
	/*@Override
	public int compareTo(Object arg0)
	{
		return mSquare.compareTo(arg0);
	} 
	
	@Override
	public void scale(int scaleFactor)
	{
		mSide = mSide * scaleFactor;
	}
	
	/*public Point getCorner()
	{
		return mSquare.getCorner();
	} 
	
	private Rectangle mSquare;
	private double mSide;
	*/
}