package com.treetechnologies.forms.adminlogin;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import com.treetechnologies.forms.adminmainmenu.AdminMainMenu;
import com.treetechnologies.tables.DatabaseAdministratorManager;

import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JPasswordField;

public class AdministratorLogin extends JFrame {
	
	private JTextField adminUsername;
	private JPasswordField adminPassword;
	public AdministratorLogin() {
		setTitle("Administrator Login\r\n");
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setIcon(new ImageIcon(AdministratorLogin.class.getResource("/com/treetechnologies/forms/adminlogin/AdminIcon.png")));
		lblNewLabel.setBounds(325, 178, 64, 64);
		getContentPane().add(lblNewLabel);
		
		adminUsername = new JTextField();
		adminUsername.setBounds(422, 190, 182, 36);
		getContentPane().add(adminUsername);
		adminUsername.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\r\n");
		lblNewLabel_1.setIcon(new ImageIcon(AdministratorLogin.class.getResource("/com/treetechnologies/forms/adminlogin/key.png")));
		lblNewLabel_1.setBounds(325, 258, 64, 55);
		getContentPane().add(lblNewLabel_1);
		
		JButton adminLoginButton = new JButton("Administrator \r\nLogin");
		adminLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				ResultSet rs = DatabaseAdministratorManager.validateLoginCredentials(adminUsername.getText(),adminPassword.getText());
				try {
					if(rs.first()){
						JOptionPane.showMessageDialog(null, "You are now Logged in as "+rs.getString("first_name")+" "+rs.getString("last_name"), "Thank You", JOptionPane.INFORMATION_MESSAGE);
						dispose();
						AdminMainMenu adminMain = new AdminMainMenu();
						AdminMainMenu.adminLoggedIn = true;
						AdminMainMenu.changeLoginStatusLoggedIn();
						adminMain.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
						adminMain.setVisible(true);
						adminMain.setSize(1366,768);						
					}				
					else{
						JOptionPane.showMessageDialog(null, "Please Enter Correct Username and Password","LoginError",JOptionPane.ERROR_MESSAGE);
					}
				} catch (HeadlessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		adminLoginButton.setBounds(422, 361, 182, 48);
		getContentPane().add(adminLoginButton);
		
		adminPassword = new JPasswordField();
		adminPassword.setBounds(422, 277, 182, 36);
		getContentPane().add(adminPassword);
	}
}
