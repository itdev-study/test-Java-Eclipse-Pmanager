package pmanager;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class PmanagerAPP {

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm window = new MainForm();
					
					ChildFrame childFrame = new ChildFrame();
					window.desktopPane.add(childFrame);					
					childFrame.setVisible(true);
					
					TestForm testform = new TestForm();
				
					
				//	JInternalFrame internalFrame = new JInternalFrame("New JInternalFrame");
				//	internalFrame.setBounds(39, 22, 274, 248);
				//	window.desktopPane.add(internalFrame);
				//	internalFrame.setVisible(true);
					
					System.out.print("PmanagerAPP Started");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		
	

}
