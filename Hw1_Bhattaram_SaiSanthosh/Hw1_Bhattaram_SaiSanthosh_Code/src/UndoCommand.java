import java.util.*;


public class UndoCommand implements Commands {
	private Stack<Shape> undoList;
	private Stack<Shape> redoList;

	public UndoCommand (Stack<Shape> undoList, Stack<Shape> redoList) {
		this.undoList = undoList;
		this.redoList = redoList;
	}
	

	public void execute() {
		if(!this.undoList.isEmpty()) {
			Shape obj = this.undoList.pop();
			//JOptionPane.showMessageDialog(null,obj);
			obj.remove();
			if(this.redoList.isEmpty())
				this.redoList.add(obj);
			else
				this.redoList.push(obj);	
			}
	}

	
	public Stack<Shape> getUndoList() {
		return (this.undoList);
	}


	public Stack<Shape> getRedoList() {
		return (this.redoList);
	}
}
