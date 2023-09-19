import java.util.*;

public class RedoCommand implements Commands {

	private Stack<Shape> undoList;
	private Stack<Shape> redoList;
	
	public RedoCommand(Stack<Shape> undoList,Stack<Shape> redoList)
	{
		this.undoList = undoList;
		this.redoList = redoList;
	}
	public void execute() {
		if(!this.redoList.isEmpty()) {
			Shape obj = this.redoList.pop();
			obj.Draw();
			if(this.undoList.isEmpty())
				this.undoList.add(obj);
			else
				this.undoList.push(obj);	
			}
	}

	
	public Stack<Shape> getUndoList() {
		return (this.undoList);
	}


	public Stack<Shape> getRedoList() {
		return (this.redoList);
	}
}
