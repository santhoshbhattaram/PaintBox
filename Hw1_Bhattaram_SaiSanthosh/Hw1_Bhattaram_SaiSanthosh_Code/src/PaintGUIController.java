import java.awt.Graphics;

import javax.swing.JOptionPane;

public class PaintGUIController {
	Shape shapecontroller;
	ShapeState s =new ShapeState();
	public PaintGUIController()
	{
		super();
		this.shapecontroller = new ShapeController();
	}
	
	public void handleButtonClick(int x, int y,Graphics g)
	{
		Shape state = s.getShape();/*state pattern*/
		this.shapecontroller.add(state.SetShapeVal(x,y,g));// Composite pattern adding states into single collection to draw
		this.shapecontroller.Draw();// Expert pattern
	}
	
	public void UndoClicked()
	{
//		JOptionPane.showMessageDialog(null,"Undo Clicked");
		this.shapecontroller.undo();
	}
	
	public void RedoClicked()
	{
		this.shapecontroller.redo();
	}
}
