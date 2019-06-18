package intro_to_array_lists;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	JFrame frame=new JFrame("Guest Book");
	JPanel panel=new JPanel();
	JButton button1=new JButton("Add Name");
	JButton button2=new JButton("View Names");
	ArrayList<String> names=new ArrayList<String>();
	
	GuestBook(){
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		button1.addActionListener(this);
		button2.addActionListener(this );
		frame.setVisible(true);
		frame.pack();
	}
	
	public static void main(String[] args) {
	GuestBook GB=new GuestBook();
	
		  
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1) {
			String name=JOptionPane.showInputDialog("Enter a name.");
			names.add(name);
		}
		
		for(String n : names) {
			//System.out.println(n);
		}
		if(e.getSource()==button2) {
			String n="";
			for(int i=0;i<names.size();i++)	{
				String y=names.get(i);
				n +=  "Guest #"+ (i+1)+": "+y +"\n";
				
			}
			JOptionPane.showMessageDialog(null, n);
		}

	}
}
	