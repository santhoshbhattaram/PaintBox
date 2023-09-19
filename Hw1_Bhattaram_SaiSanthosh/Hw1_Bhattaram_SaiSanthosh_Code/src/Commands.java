
import java.util.Stack;

/*Command Interface for Command Pattern*/
public interface Commands {
	void execute();
	Stack<Shape> getUndoList();
	Stack<Shape> getRedoList();
}