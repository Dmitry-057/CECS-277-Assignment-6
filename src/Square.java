// Assignment 6
// Dmitry Merezhko	 ID: 025-947-712
// Charyl Enriquez   ID: 015392154
// Britney Khuu 	 ID: 018577765

public class Square extends Shape
{
	private int count, side;
	public Square(int mCount, int mSide ) {
		count = mCount;
		side = mSide;
	}
	@Override
	public String display() {
		return ("Square: Count = " + count + ", Side = " + side);
	}
	

}