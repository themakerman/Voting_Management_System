package com.treetechnologies.forms.adminmainmenu;

import javax.swing.JFrame;

import java.awt.Rectangle;

import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.Color;
import java.awt.Point;

import javax.swing.UIManager;

import java.awt.Dimension;

import javax.swing.JLayeredPane;

import com.treetechnologies.forms.addcandidate.AddCandidate;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminMainMenu extends JFrame {
	
	public AdminMainMenu visibilityController;
	public static boolean adminLoggedIn = false; 
	private static JLabel adminStatus;
	
	public AdminMainMenu() {
		setTitle("Voting Management System");
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenu mnView = new JMenu("View");
		menuBar.add(mnView);
		
		JMenu mnTools = new JMenu("Tools");
		menuBar.add(mnTools);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		getContentPane().setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 1366, 93);
		getContentPane().add(toolBar);
		
		JButton treeTechnologiesLogo = new JButton("Tree \r\nTechnologies\r\n");
		treeTechnologiesLogo.setIcon(new ImageIcon(AdminMainMenu.class.getResource("/com/treetechnologies/forms/adminmainmenu/icontexto_green_01.png")));
		treeTechnologiesLogo.setSelected(true);
		treeTechnologiesLogo.setOpaque(false);
		treeTechnologiesLogo.setForeground(Color.WHITE);
		treeTechnologiesLogo.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		toolBar.add(treeTechnologiesLogo);
		
		JButton addCandidateButton = new JButton("Add Candidate");
		addCandidateButton.addActionListener(new ActionListener() {
			AddCandidate addCandidate = new AddCandidate();
			public void actionPerformed(ActionEvent event) {
				if(addCandidate.isActive() == false){
					addCandidate.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					addCandidate.setVisible(true);
					addCandidate.setBounds(380,146,986,629);											
				}
			}
		});
		addCandidateButton.setIcon(new ImageIcon(AdminMainMenu.class.getResource("/com/treetechnologies/forms/adminmainmenu/Actions-list-add-user-icon.png")));
		addCandidateButton.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		toolBar.add(addCandidateButton);
		
		JButton deleteCandidateButton = new JButton("Delete Candidate\r\n");
		deleteCandidateButton.setIcon(new ImageIcon(AdminMainMenu.class.getResource("/com/treetechnologies/forms/adminmainmenu/Actions-list-remove-user-icon.png")));
		deleteCandidateButton.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		toolBar.add(deleteCandidateButton);
		
		JButton updateCandidateButton = new JButton("Update Candidate");
		updateCandidateButton.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		updateCandidateButton.setIcon(new ImageIcon(AdminMainMenu.class.getResource("/com/treetechnologies/forms/adminmainmenu/Pencil-icon (1).png")));
		toolBar.add(updateCandidateButton);
		
		adminStatus = new JLabel("");
		adminStatus.setForeground(Color.WHITE);
		adminStatus.setVerticalAlignment(SwingConstants.BOTTOM);
		adminStatus.setHorizontalAlignment(SwingConstants.TRAILING);
		adminStatus.setLocation(new Point(900, 0));
		adminStatus.setMaximumSize(new Dimension(370, 93));
		adminStatus.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		toolBar.add(adminStatus);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 93, 378, 635);
		getContentPane().add(layeredPane);
		
		JButton displayVoterListButton = new JButton("display voter list");
		displayVoterListButton.setIcon(new ImageIcon(AdminMainMenu.class.getResource("/com/treetechnologies/forms/adminmainmenu/RSS-Reader-Green-icon.png")));
		displayVoterListButton.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		displayVoterListButton.setBounds(0, 0, 378, 127);
		layeredPane.add(displayVoterListButton);
		
		JButton filterResultsButton = new JButton("Filter Results\r\n");
		filterResultsButton.setIcon(new ImageIcon(AdminMainMenu.class.getResource("/com/treetechnologies/forms/adminmainmenu/edit_clear (1).png")));
		filterResultsButton.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		filterResultsButton.setBounds(0, 251, 378, 127);
		layeredPane.add(filterResultsButton);
		
		JButton countResultsButton = new JButton("Count Results\r\n");
		countResultsButton.setIcon(new ImageIcon(AdminMainMenu.class.getResource("/com/treetechnologies/forms/adminmainmenu/Magnifying-glass-icon.png")));
		countResultsButton.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		countResultsButton.setBounds(0, 377, 378, 127);
		layeredPane.add(countResultsButton);
		
		JButton signOutButton = new JButton("Sign Out\r\n");
		signOutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if(adminLoggedIn){
					int choice = JOptionPane.showConfirmDialog(null, "Are you Sure you want to Log Out ?", "Sign Out", JOptionPane.YES_NO_OPTION);
					if(choice == 0){
						changeLoginStatusLoggedOut();
						dispose();
					}
				}else{
					JOptionPane.showMessageDialog(null, "You are Not Logged In", "Sign Out", JOptionPane.ERROR_MESSAGE);
				}				
			}
		});
		signOutButton.setIcon(new ImageIcon(AdminMainMenu.class.getResource("/com/treetechnologies/forms/adminmainmenu/start_here_gnome_skyblue.png")));
		signOutButton.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		signOutButton.setBounds(0, 503, 378, 130);
		layeredPane.add(signOutButton);		
		
		JButton button = new JButton("Display Results");
		button.setIcon(new ImageIcon(AdminMainMenu.class.getResource("/com/treetechnologies/forms/adminmainmenu/stock.png")));
		button.setIconTextGap(5);
		button.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		button.setBounds(0, 126, 378, 127);
		layeredPane.add(button);
	}	
	
	public static void changeLoginStatusLoggedIn(){
		adminStatus.setText("Logged In");	
		adminLoggedIn = true;
	}
	
	public static void changeLoginStatusLoggedOut(){
		adminStatus.setText(" ");	
		adminLoggedIn = false;
	}
	
}
