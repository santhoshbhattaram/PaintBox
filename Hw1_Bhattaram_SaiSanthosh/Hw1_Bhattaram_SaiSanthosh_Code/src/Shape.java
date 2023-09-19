import java.awt.Graphics;

public abstract class Shape {
	public void add(Shape shape) {};
	public abstract void Draw();
	public void remove() {};
	public void redo() {};
	public void undo() {};
	public abstract Shape SetShapeVal(int x,int y, Graphics g);
}
