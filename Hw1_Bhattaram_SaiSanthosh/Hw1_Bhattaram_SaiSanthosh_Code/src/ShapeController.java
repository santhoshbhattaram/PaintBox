import java.awt.Graphics;
import java.util.*;

import javax.swing.JOptionPane;

public class ShapeController extends Shape {
	
	private Stack<Shape> undoList = new Stack<Shape>();// collections to undo shapes composite
	private Stack<Shape> redoList = new Stack<Shape>();
	
	public void add(Shape s) {
		redoList.clear();
		if(undoList.isEmpty())
			undoList.add(s);
		else
			undoList.push(s);
		} 
	
	public void Draw() {
        Iterator<Shape> value = undoList.iterator(); 
        // Iterator pattern to draw
        while (value.hasNext()) { 
            ((Shape) value.next()).Draw();
        	} 
		
	}
	public void undo() {
		if(undoList.size()>0)
		{
			// Command Pattern
			Commands undocomm = new UndoCommand(undoList, redoList);
			undocomm.execute();
			this.undoList = undocomm.getUndoList();
			this.redoList = undocomm.getRedoList();
		}
		else
		{
			JOptionPane.showMessageDialog(null,"No shapes to Undo");
		}
	}
	
	public void redo() {
		if(redoList.size()>0)
		{
			// Command Pattern
			Commands redocomm = new RedoCommand(undoList, redoList);
			//JOptionPane.showMessageDialog(null,redoList);
			redocomm.execute();
			this.undoList = redocomm.getUndoList();
		}
		else
		{
			JOptionPane.showMessageDialog(null,"No shapes to Redo");
		}
	}

	@Override
	public Shape SetShapeVal(int x, int y, Graphics g) {
		// TODO Auto-generated method stub
		return null;
	}
}
