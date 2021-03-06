// Assignment 6
// Dmitry Merezhko	 ID: 025-947-712
// Charyl Enriquez   ID: 015392154
// Britney Khuu 	 ID: 018577765

import java.util.ArrayList;

public class ShapeComposite extends ShapeComponent
{
	@Override
	public String display()
	{
		String value = "\nCOMPOSITE START:\n";
		for(ShapeComponent s : mList) {
			value += s.display();
			value += "\n";
		}
		value += "COMPOSITE END\n";
		return value;
	}
	
	public void add(ShapeComponent s)
	{
		mList.add(s);
	}
	
	private ArrayList<ShapeComponent> mList = new ArrayList<ShapeComponent>();
	
}