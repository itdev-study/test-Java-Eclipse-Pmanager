package pmanager;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JDesktopPane;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class MainForm {

	JDesktopPane desktopPane;
	private JFrame frame;
	
	public MainForm() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 774, 445);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JToolBar toolBar = new JToolBar();
		frame.getContentPane().add(toolBar, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("New");
		toolBar.add(btnNewButton);
		
		//Make MainForm components		
		JTree tree = new JTree();		
		JScrollPane treeScrollPane = new JScrollPane(tree);	
		
		desktopPane = new JDesktopPane();					
		
		GroupLayout gl_desktopPane = new GroupLayout(desktopPane);
		
		gl_desktopPane.setHorizontalGroup(
			gl_desktopPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 642, Short.MAX_VALUE)
		);
		gl_desktopPane.setVerticalGroup(
			gl_desktopPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 379, Short.MAX_VALUE)
		);
		desktopPane.setLayout(gl_desktopPane);
		
		JScrollPane desktopScrollPane = new JScrollPane(desktopPane);			
		
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
				treeScrollPane, desktopScrollPane);
		 splitPane.setOneTouchExpandable(true);
	        splitPane.setDividerLocation(150);  
	        
	        Dimension minimumSize = new Dimension(200, 100);
	        treeScrollPane.setMinimumSize(minimumSize);
	        desktopScrollPane.setMinimumSize(minimumSize);		
		
		frame.getContentPane().add(splitPane, BorderLayout.CENTER);		
		
		tree.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {						
				//TestForm testform = new TestForm();				
				
				ChildFrame childFrame = new ChildFrame();
				desktopPane.add(childFrame);					
				childFrame.setVisible(true);
				
			}
		});
		
		frame.setVisible(true);
	}
}
