import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class PaintGUI extends JFrame{
	ShapeState s =new ShapeState();
	public PaintGUI()
	{
        JFrame frame = new JFrame();
        Canvas canvas = new Canvas();
        JPanel contentPanel;
        contentPanel = (JPanel) getContentPane();
        contentPanel.setLayout(new BorderLayout());
        canvas.setBackground(Color.white);
        canvas.setVisible(true);
        setSize(900, 800);
        setTitle("Paint Box");
        
        JPanel panel = new JPanel();
        //buttons for shapes
        JButton btnBox = new JButton("Box");
        JButton btnCircle = new JButton("Circle");
        JButton btnLine = new JButton("Line"); 
        JButton btnUndo = new JButton("Undo");
        JButton btnRedo = new JButton("Redo");
        
        panel.setPreferredSize(new Dimension(100, 500));
        contentPanel.add(canvas,BorderLayout.CENTER);
        contentPanel.add(panel, BorderLayout.WEST);
        panel.add(btnLine,BorderLayout.WEST);
        panel.add(btnCircle,BorderLayout.WEST);
        panel.add(btnBox,BorderLayout.WEST);
        panel.add(btnUndo,BorderLayout.WEST);
        panel.add(btnRedo,BorderLayout.WEST);
        PaintGUIController controller = new PaintGUIController();
        //controller pattern
        canvas.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent event) {
           	Graphics g = canvas.getGraphics();
               controller.handleButtonClick( (int) event.getPoint().getX(),
                  (int) event.getPoint().getY(), g);
            }
         });

        btnCircle.addActionListener((ActionEvent e) -> {
            s.setShape(new Circle());
           // JOptionPane.showMessageDialog(null,s.getShape());
        });

        btnBox.addActionListener((ActionEvent e) -> {
            s.setShape(new Box());
            //JOptionPane.showMessageDialog(null,s.getShape());
        });

        btnLine.addActionListener((ActionEvent e) -> {
            s.setShape(new Line());
            //JOptionPane.showMessageDialog(null,s.getShape());
        });

        btnUndo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//             JOptionPane.showMessageDialog(null,"Undo Clicked");
           	 controller.UndoClicked();
            }});

         btnRedo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//              JOptionPane.showMessageDialog(null,"Redo Clicked");
           	 controller.RedoClicked();
            }
         });
         //End of Controller pattern
         setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public static void main(String[] args)
	{
		try
		{
			PaintGUI PaintGUI = new PaintGUI();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
	}
}
