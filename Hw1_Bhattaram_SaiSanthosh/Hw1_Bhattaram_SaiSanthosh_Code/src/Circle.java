import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {
	private int x,y;
	Graphics graphics;
	public Circle() {}
	public Circle(int x,int y,Graphics g)
	{
		this.x=x;
		this.y=y;
		this.graphics=g;
	}
	public void Draw()
	{
		graphics.setColor(Color.black);
		graphics.drawOval(x, y, 100, 100);
	}
	public void remove()
	{
		graphics.setColor(Color.white);
		graphics.drawOval(x, y, 100, 100);
	}
	public Shape SetShapeVal(int x,int y, Graphics g)
	{
		return new Circle(x,y,g);
	}
}

