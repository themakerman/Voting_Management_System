package com.treetechologies.form.register;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

public class Register extends JFrame {
	private JTextField txtFirstName;
	private JTextField txtLocalAddress;
	private JTextField txtCity;
	private JTextField txtState;
	private JTextField txtLastName;
	private JTextField txtAnyNumber;
	private JTextField textField;
	private JPasswordField passwordField;
	public Register() {
		setBounds(new Rectangle(0, 0, 986, 630));
		getContentPane().setLayout(null);
		
		txtFirstName = new JTextField();
		txtFirstName.setFont(new Font("SimSun-ExtB", Font.BOLD, 15));
		txtFirstName.setText("first name\r\n");
		txtFirstName.setBounds(417, 110, 123, 28);
		getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLocalAddress = new JTextField();
		txtLocalAddress.setFont(new Font("SimSun-ExtB", Font.BOLD, 15));
		txtLocalAddress.setText("localaddress");
		txtLocalAddress.setBounds(417, 184, 123, 28);
		getContentPane().add(txtLocalAddress);
		txtLocalAddress.setColumns(10);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(-11, 0, 981, 69);
		getContentPane().add(toolBar);
		
		JButton btnNewButton = new JButton("Register To Vote");
		btnNewButton.setOpaque(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.setMaximumSize(new Dimension(970, 69));
		btnNewButton.setBounds(new Rectangle(0, 0, 970, 69));
		toolBar.add(btnNewButton);
		
		txtCity = new JTextField();
		txtCity.setFont(new Font("SimSun-ExtB", Font.BOLD, 15));
		txtCity.setText("city");
		txtCity.setBounds(567, 184, 123, 28);
		getContentPane().add(txtCity);
		txtCity.setColumns(10);
		
		txtState = new JTextField();
		txtState.setFont(new Font("SimSun-ExtB", Font.BOLD, 15));
		txtState.setText("state\r\n");
		txtState.setBounds(718, 184, 123, 28);
		getContentPane().add(txtState);
		txtState.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.setBounds(382, 498, 206, 53);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblName = new JLabel("Name");
		lblName.setIcon(new ImageIcon(Register.class.getResource("/com/treetechologies/form/register/identity-card-icon.png")));
		lblName.setFont(new Font("SimSun-ExtB", Font.BOLD, 18));
		lblName.setBounds(229, 94, 123, 44);
		getContentPane().add(lblName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setIcon(new ImageIcon(Register.class.getResource("/com/treetechologies/form/register/Actions-go-home-icon.png")));
		lblAddress.setFont(new Font("SimSun-ExtB", Font.BOLD, 18));
		lblAddress.setBounds(234, 167, 146, 59);
		getContentPane().add(lblAddress);
		
		txtLastName = new JTextField();
		txtLastName.setFont(new Font("SimSun-ExtB", Font.BOLD, 15));
		txtLastName.setText("last name\r\n");
		txtLastName.setColumns(10);
		txtLastName.setBounds(567, 110, 123, 28);
		getContentPane().add(txtLastName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("SimSun-ExtB", Font.BOLD, 18));
		lblPassword.setIcon(new ImageIcon(Register.class.getResource("/com/treetechologies/form/register/key.png")));
		lblPassword.setBounds(229, 252, 159, 53);
		getContentPane().add(lblPassword);
		
		JLabel lblNewLabel = new JLabel("Contact\r\n");
		lblNewLabel.setIcon(new ImageIcon(Register.class.getResource("/com/treetechologies/form/register/phone-icon.png")));
		lblNewLabel.setFont(new Font("SimSun-ExtB", Font.BOLD, 15));
		lblNewLabel.setBounds(229, 331, 151, 53);
		getContentPane().add(lblNewLabel);
		
		txtAnyNumber = new JTextField();
		txtAnyNumber.setFont(new Font("SimSun-ExtB", Font.BOLD, 15));
		txtAnyNumber.setBounds(417, 343, 123, 28);
		getContentPane().add(txtAnyNumber);
		txtAnyNumber.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Birth");
		lblNewLabel_1.setIcon(new ImageIcon(Register.class.getResource("/com/treetechologies/form/register/Actions-view-calendar-day-icon.png")));
		lblNewLabel_1.setFont(new Font("SimSun-ExtB", Font.BOLD, 15));
		lblNewLabel_1.setBounds(234, 413, 146, 53);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(417, 422, 123, 28);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(417, 263, 123, 28);
		getContentPane().add(passwordField);
		
	}
}
