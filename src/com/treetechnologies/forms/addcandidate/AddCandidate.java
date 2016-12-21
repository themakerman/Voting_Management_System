package com.treetechnologies.forms.addcandidate;

import javax.swing.JFrame;

import java.awt.Rectangle;

import javax.swing.JButton;

import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

import com.treetechnologies.tables.CandidateManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddCandidate extends JFrame {
	
	public  JTextField candidateFirstName;
	public JTextField candidateLastName;
	public JTextField candidateDateOfBirth;
	public JComboBox candidatePartyList;
	
	public AddCandidate() {
		setTitle("AddCandidate\r\n");
		setBounds(new Rectangle(380, 146, 986, 630));
		getContentPane().setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 981, 69);
		getContentPane().add(toolBar);
		
		JButton btnAddCandidate = new JButton("Add Candidate");
		btnAddCandidate.setOpaque(false);
		btnAddCandidate.setMaximumSize(new Dimension(970, 69));
		btnAddCandidate.setForeground(Color.WHITE);
		btnAddCandidate.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		btnAddCandidate.setBounds(new Rectangle(0, 0, 970, 69));
		btnAddCandidate.setBorderPainted(false);
		toolBar.add(btnAddCandidate);
		
		JLabel label = new JLabel("Name");
		label.setIcon(new ImageIcon(AddCandidate.class.getResource("/com/treetechnologies/forms/addcandidate/identity-card-icon.png")));
		label.setFont(new Font("SimSun-ExtB", Font.BOLD, 18));
		label.setBounds(229, 123, 123, 53);
		getContentPane().add(label);
		
		candidateFirstName = new JTextField();
		candidateFirstName.setText("first name\r\n");
		candidateFirstName.setFont(new Font("SimSun-ExtB", Font.BOLD, 15));
		candidateFirstName.setColumns(10);
		candidateFirstName.setBounds(417, 133, 123, 28);
		getContentPane().add(candidateFirstName);
		
		candidateLastName = new JTextField();
		candidateLastName.setText("last name\r\n");
		candidateLastName.setFont(new Font("SimSun-ExtB", Font.BOLD, 15));
		candidateLastName.setColumns(10);
		candidateLastName.setBounds(567, 133, 123, 28);
		getContentPane().add(candidateLastName);
		
		JLabel label_1 = new JLabel("Birth");
		label_1.setIcon(new ImageIcon(AddCandidate.class.getResource("/com/treetechnologies/forms/addcandidate/Actions-view-calendar-day-icon.png")));
		label_1.setFont(new Font("SimSun-ExtB", Font.BOLD, 15));
		label_1.setBounds(229, 229, 146, 59);
		getContentPane().add(label_1);
		
		candidateDateOfBirth = new JTextField();
		candidateDateOfBirth.setColumns(10);
		candidateDateOfBirth.setBounds(417, 248, 123, 28);
		getContentPane().add(candidateDateOfBirth);
		
		JLabel lblParty = new JLabel("Party\r\n");
		lblParty.setIcon(new ImageIcon(AddCandidate.class.getResource("/com/treetechnologies/forms/addcandidate/User-Group-icon.png")));
		lblParty.setFont(new Font("SimSun-ExtB", Font.BOLD, 15));
		lblParty.setBounds(229, 355, 146, 69);
		getContentPane().add(lblParty);
		
		candidatePartyList = new JComboBox();
		candidatePartyList.setBounds(417, 376, 123, 28);
		candidatePartyList.addItem("Aam Aadmi Party");
		candidatePartyList.addItem("BJP");
		candidatePartyList.addItem("Congress");
		candidatePartyList.addItem("MNS");
		candidatePartyList.addItem("Shiv Sena");		
		getContentPane().add(candidatePartyList);
	
		
		JButton addCandidateButton = new JButton("Add Candidate");
		addCandidateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				boolean success = CandidateManager.addCandidate(candidateFirstName.getText(), candidateLastName.getText(), candidateDateOfBirth.getText(), (String)candidatePartyList.getSelectedItem());
				if(success){
					JOptionPane.showMessageDialog(null, "Candidate Successfully Inserted", "AddCandidate", JOptionPane.INFORMATION_MESSAGE);					
				}else{
					JOptionPane.showMessageDialog(null, "Failed To insert Candidate", "AddCandidate", JOptionPane.ERROR_MESSAGE);
				}				
			}
		});
		addCandidateButton.setBounds(382, 498, 206, 53);
		getContentPane().add(addCandidateButton);
	}
}
