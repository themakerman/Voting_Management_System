package com.treetechnologies.main;

import java.text.ParseException;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import com.treetechnologies.forms.login.LoginForm;
import com.treetechnologies.forms.mainmenu.MainMenu;
import com.treetechologies.form.register.Register;

import de.javasoft.plaf.synthetica.SyntheticaClassyLookAndFeel;

public class Main {

	public static void main(String[] args) {
		
		//Setting up the Custom User Interface		
		try {
			String[] li = {"Licensee=Gaurav Harchwani ", "LicenseRegistrationNumber=NCGH140328", "Product=Synthetica", "LicenseType=Non Commercial", "ExpireDate=--.--.----", "MaxVersion=2.18.999"};
			UIManager.put("Synthetica.license.info", li);
			UIManager.put("Synthetica.license.key", "E4A575BF-E1F7F87E-0E245416-767E1426-131B0D73");
			UIManager.setLookAndFeel(new SyntheticaClassyLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		//initializing the UserInterface Components
		initUserInterface();		
	}
	
	public static void initUserInterface(){
					
		//MainMenu Form Visibility
		MainMenu menu = new MainMenu();
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu.setVisible(true);
		menu.setSize(1366,768);	
			
		//By Default The Login Form is Always On but Can be killed to check Other Features of the Application.
		LoginForm login = new LoginForm();
		login.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		login.setVisible(true);
		login.setBounds(380,138,986,629);
		
		//Control Variable
		menu.login = login;		
	}		

}
