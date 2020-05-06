package src;
import java.util.ArrayList;

public class ShapeComposite extends ShapeComponent
{
	@Override
	public void display()
	{
		System.out.println("COMPOSITE START:");
		for(ShapeComponent s : mList) s.display();
		System.out.println("COMPOSITE END");
	}
	
	public void add(ShapeComponent s)
	{
		mList.add(s);
	}
	
	private ArrayList<ShapeComponent> mList = new ArrayList<ShapeComponent>();
	
}