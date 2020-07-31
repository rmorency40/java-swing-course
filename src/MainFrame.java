import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
	
	private JTextArea textArea;
	private JButton btn;
	
	public MainFrame() {
		
		super("Hello World");
		//create the frame with the title "Hello World!"
		
		JFrame frame = new JFrame("Hello World");
		
		setLayout(new BorderLayout());
		textArea = new JTextArea();
		btn = new JButton("Click Me");
		add(textArea, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		//Set size for the frame
		setSize(600, 500);
		
		// Make sure the App is stopped when click on teh "X" button
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Make the frame visible
         setVisible(true);
		
	}

}
