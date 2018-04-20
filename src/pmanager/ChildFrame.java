package pmanager;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChildFrame extends JInternalFrame {
	
	static int openFrameCount = 0;
	static final int xOffset = 30;
	static	final int yOffset = 30;

	private JPanel contentPane;

	public ChildFrame() {		
		
		super("Document #" + (++openFrameCount), 
		              true, //resizable
		              true, //closable
		              true, //maximizable
		              true);//iconifiable
		 
		//...Create the GUI and put it in the window...		 
		//...Then set the window size or call pack...
		setSize(300,300);		 
		//Set the window's location.
		setLocation(xOffset*openFrameCount, yOffset*openFrameCount);		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JSplitPane splitPane = new JSplitPane();
		panel.add(splitPane);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				TestForm testform = new TestForm();
			}
		});
		panel.add(btnNewButton);
		
	}

}
