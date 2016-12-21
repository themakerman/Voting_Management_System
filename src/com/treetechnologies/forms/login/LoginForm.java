package com.treetechnologies.forms.login;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import com.treetechnologies.forms.mainmenu.MainMenu;
import com.treetechnologies.tables.VoterManager;
import com.treetechologies.form.register.Register;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginForm extends JFrame {
	
	private JTextField voterIdField;
	private JPasswordField passwordField;
		
	public LoginForm() {
		super("Login\r\n");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);		
		
		voterIdField = new JTextField();
		voterIdField.setBounds(422, 190, 182, 36);
		getContentPane().add(voterIdField);
		voterIdField.setColumns(10);
		
		JLabel voterIcon = new JLabel("");
		voterIcon.setIcon(new ImageIcon(LoginForm.class.getResource("/com/treetechnologies/forms/login/user.png")));
		voterIcon.setBounds(325, 178, 48, 48);
		getContentPane().add(voterIcon);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(422, 277, 182, 36);
		getContentPane().add(passwordField);
		
		JLabel passwordIcon = new JLabel("");
		passwordIcon.setIcon(new ImageIcon(LoginForm.class.getResource("/com/treetechnologies/forms/login/key.png")));
		passwordIcon.setBounds(325, 258, 64, 55);
		getContentPane().add(passwordIcon);
		
		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				ResultSet rs = VoterManager.validateLoginCredentials(Integer.parseInt(voterIdField.getText()),passwordField.getText());
				try {
					if(rs.first()){
						JOptionPane.showMessageDialog(null, "You are now Logged in as "+rs.getString("first_name")+" "+rs.getString("last_name"), "Thank You", JOptionPane.INFORMATION_MESSAGE);
						MainMenu.voterLoggedIn = true;
						MainMenu.changeLoginStatusLoggedIn();
						dispose();
					}else{
						JOptionPane.showMessageDialog(null, "Please Enter Valid Credentials", "Thank You", JOptionPane.ERROR_MESSAGE);
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
		
		loginButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		loginButton.setBounds(422, 361, 182, 48);
		getContentPane().add(loginButton);
		
		JLabel lblNotRegistered = new JLabel("Not Registered?\r\n");
		lblNotRegistered.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNotRegistered.setBounds(641, 502, 110, 48);
		getContentPane().add(lblNotRegistered);
		
		JButton registerButton = new JButton("Register\r\n\r\n");
		registerButton.addActionListener(new ActionListener() {			
			Register register = new Register();
			public void actionPerformed(ActionEvent event) {
				register.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				register.setVisible(true);
				register.setBounds(380,138,986,629);			
			}
		});
		registerButton.setBounds(761, 499, 188, 55);
		getContentPane().add(registerButton);		
		
		
	}
}
