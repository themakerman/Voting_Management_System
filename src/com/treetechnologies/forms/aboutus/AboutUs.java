package com.treetechnologies.forms.aboutus;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.plaf.synth.SynthTextAreaUI;

import java.awt.Font;

import de.javasoft.plaf.synthetica.*;
import java.awt.Dimension;

public class AboutUs extends JOptionPane {
	
	public AboutUs(){
		setPreferredSize(new Dimension(400, 400));
		setMaximumSize(new Dimension(400, 400));
		
	}
	
	public void showMessageOnClick(){		
		showMessageDialog(null, "<html><b><br>Gaurav Harchwani,CEO,Tree Technologies © 2014, Author of Software<br>"+
											"(email :- gauravharchwani@yahoo.com) ALL RIGHTS RESERVED @2014<br>"
											+ "This Software contains material protected under International and the<br>"
											+ "Federal Copyright Laws and Treaties. Any unauthorized reprint and or<br>"
											+ "use of this material is prohibited. No part of this interface must be<br>"
											+ "reproduced or transmitted in any form or by any means, electronic or<br>"
											+ "mechanical, including photocopying, recording, or by any information<br>"
											+ "storage and retrieval system without express written permission from<br>"
											+ "the author/publisher or Tree Technologies CEO.If Found Guilty the<br>"
											+ "The tressPasser will be charged with Indian Piracy Act 1996 and will<br>"
											+ "be prosecuted.</b></html>","Tree Techonologies.Inc", JOptionPane.INFORMATION_MESSAGE,new ImageIcon(AboutUs.class.getResource("companyLogo.png")));
			}	

}
