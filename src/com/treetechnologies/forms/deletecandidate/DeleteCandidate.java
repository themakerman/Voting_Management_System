package com.treetechnologies.forms.deletecandidate;

import javax.swing.JFrame;
import java.awt.Rectangle;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class DeleteCandidate extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public DeleteCandidate() {
		setTitle("DeleteCandidate\r\n");
		setBounds(new Rectangle(380, 146, 986, 630));
		getContentPane().setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 981, 69);
		getContentPane().add(toolBar);
		
		JButton btnDeleteCandidate = new JButton("Delete Candidate");
		btnDeleteCandidate.setOpaque(false);
		btnDeleteCandidate.setMaximumSize(new Dimension(970, 69));
		btnDeleteCandidate.setForeground(Color.WHITE);
		btnDeleteCandidate.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		btnDeleteCandidate.setBounds(new Rectangle(0, 0, 970, 69));
		btnDeleteCandidate.setBorderPainted(false);
		toolBar.add(btnDeleteCandidate);
		
		JLabel label = new JLabel("Name");
		label.setIcon(new ImageIcon(DeleteCandidate.class.getResource("/com/treetechnologies/forms/addcandidate/identity-card-icon.png")));
		label.setFont(new Font("SimSun-ExtB", Font.BOLD, 18));
		label.setBounds(229, 123, 123, 53);
		getContentPane().add(label);
		
		textField = new JTextField();
		textField.setText("first name\r\n");
		textField.setFont(new Font("SimSun-ExtB", Font.BOLD, 15));
		textField.setColumns(10);
		textField.setBounds(417, 133, 123, 28);
		getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("last name\r\n");
		textField_1.setFont(new Font("SimSun-ExtB", Font.BOLD, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(567, 133, 123, 28);
		getContentPane().add(textField_1);
		
		JLabel label_1 = new JLabel("Birth");
		label_1.setIcon(new ImageIcon(DeleteCandidate.class.getResource("/com/treetechnologies/forms/deletecandidate/Actions-view-calendar-day-icon.png")));
		label_1.setFont(new Font("SimSun-ExtB", Font.BOLD, 15));
		label_1.setBounds(229, 229, 146, 59);
		getContentPane().add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(417, 248, 123, 28);
		getContentPane().add(textField_2);
		
		JLabel label_2 = new JLabel("Party\r\n");
		label_2.setIcon(new ImageIcon(DeleteCandidate.class.getResource("/com/treetechnologies/forms/deletecandidate/User-Group-icon.png")));
		label_2.setFont(new Font("SimSun-ExtB", Font.BOLD, 15));
		label_2.setBounds(229, 355, 146, 69);
		getContentPane().add(label_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(417, 376, 123, 28);
		getContentPane().add(comboBox);
	}
}
