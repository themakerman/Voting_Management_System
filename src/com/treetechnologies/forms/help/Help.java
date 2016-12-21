package com.treetechnologies.forms.help;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Help extends JOptionPane {	
	public void showMessageOnClick(){		
		showMessageDialog(null, "<html><b><br>Gaurav Harchwani,CEO,Tree Technologies © 2014, Author of Software<br>"+
											"(email :- gauravharchwani@yahoo.com) ALL RIGHTS RESERVED @2014<br>"
											+ "Contact the author/publisher or Tree Technologies customer care Number<br>to get Further Assistance.</b></html>","Tree Techonologies.Inc", JOptionPane.INFORMATION_MESSAGE,new ImageIcon(Help.class.getResource("companyLogo.png")));
			}	
}
