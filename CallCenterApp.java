/*
*CallCenterApp.java
*@author D.Ho
*8/5/24
*/

import javax.swing.JOptionPane;

public class CallCenterApp{
	public static void main(String args[]){
		//declare variables
		String name, loc, num, msg, redo;
		boolean pro;

		//declare and create object
		CallCenter myCC = new CallCenter();

		do{
			//input
			name = JOptionPane.showInputDialog(null, "Enter your name: \n");
			myCC.setName(name);

			loc = JOptionPane.showInputDialog(null, "Enter your Location: \n");
			myCC.setLoc(loc);

			num = JOptionPane.showInputDialog(null, "Enter your customer number: \n");
			myCC.setNum(num);

			//Process
			myCC.compute();

			//Output
			pro = myCC.getPro();
			if(pro){
				msg = myCC.getMsg();
				JOptionPane.showMessageDialog(null,msg);
			}

			//redo
			redo = JOptionPane.showInputDialog(null, "Do you want to try again? Y/N: ");
		}
		while(redo.equalsIgnoreCase("y"));

	}
}