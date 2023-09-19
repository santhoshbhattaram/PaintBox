import java.awt.*;

public class Line extends Shape {
	private int x;
	private int y;
	private Graphics graphics;
	public Line() {}
	public Line(int x, int y,Graphics g)
	{
		this.x = x;
		this.y = y;
		this.graphics=g;
	}
	
	public void Draw()
	{
        graphics.setColor(Color.black);
		graphics.drawLine(x, y, x,y+200);
	}

	public void remove()
	{
		graphics.setColor(Color.white);
		graphics.drawLine(x, y, x,y+200);
	}
	public Shape SetShapeVal(int x,int y, Graphics g)
	{
		return new Line(x,y,g);
	}
}
