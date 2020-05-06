// Assignment 6
// Dmitry Merezhko	 ID: 025-947-712
// Charyl Enriquez   ID: 015392154
// Britney Khuu 	 ID: 018577765

public class Circle extends Shape
{
	private int count, radius;
	public Circle(int mCount, int mRadius ) {
		count = mCount;
		radius = mRadius;
	}
	@Override
	public String display() {
		return ("Circle: Count = " + count + ", Radius = " + radius);
	}
		
}