import java.awt.*;

public class Box extends Shape{
	private int x,y;
	private Graphics graphics;
	
	public Box()
	{
		
	}
	public Box(int x,int y,Graphics g)
	{
		this.x=x;
		this.y=y;
		this.graphics = g;
	}
	
	public void Draw()
	{
        graphics.setColor(Color.black);
		graphics.drawRect(x, y, 100,100);
	}
	
	public void remove()
	{
		graphics.setColor(Color.white);
		graphics.drawRect(x, y, 100,100);
	}
	public Shape SetShapeVal(int x,int y, Graphics g)
	{
		return new Box(x,y,g);
	}
}
