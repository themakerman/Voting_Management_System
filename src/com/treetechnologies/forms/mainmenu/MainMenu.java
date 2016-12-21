package com.treetechnologies.forms.mainmenu;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;

import com.treetechnologies.forms.aboutus.AboutUs;
import com.treetechnologies.forms.adminlogin.AdministratorLogin;
import com.treetechnologies.forms.checkprojectionpoll.CheckProjectionPoll;
import com.treetechnologies.forms.help.Help;
import com.treetechnologies.forms.login.LoginForm;
import com.treetechnologies.forms.readpartyinformation.ReadPartyInformation;
import com.treetechnologies.forms.voteyyourcandidate.VoteYourCandidate;

import java.awt.Color;

import javax.swing.UIManager;

import java.awt.Dimension;
import java.awt.Point;

import javax.swing.SwingConstants;

public class MainMenu extends JFrame {
	
	public LoginForm login;
	public static boolean voterLoggedIn = false; 
	private static JLabel voterStatus;
		
	public MainMenu() {
		
		getContentPane().setFont(new Font("Stencil Std", Font.PLAIN, 16));
		setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		setTitle("Voting Management System");
		getContentPane().setLayout(null);				
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 1366, 93);
		getContentPane().add(toolBar);
		
		JLabel label = new JLabel("");
		toolBar.add(label);
		
		JButton treeTechnologiesLogo = new JButton("Tree \r\nTechnologies\r\n");
		treeTechnologiesLogo.setForeground(Color.WHITE);
		treeTechnologiesLogo.setOpaque(false);
		treeTechnologiesLogo.setSelected(true);
		treeTechnologiesLogo.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		treeTechnologiesLogo.setIcon(new ImageIcon(MainMenu.class.getResource("/com/treetechnologies/forms/mainmenu/icontexto_green_01.png")));
		toolBar.add(treeTechnologiesLogo);
		
		JButton signInButton = new JButton("Login\r\n\r\n");
		signInButton.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				if(voterLoggedIn == false){				
					if(login.isActive() == false){
						login.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						login.setVisible(true);
						login.setBounds(380,146,986,629);											
					}
				}else{
					JOptionPane.showMessageDialog(null, "You are already Logged In", "Sign In", JOptionPane.ERROR_MESSAGE);
				}					
			}
		});
		signInButton.setSelectedIcon(null);
		signInButton.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		signInButton.setIcon(new ImageIcon(MainMenu.class.getResource("/com/treetechnologies/forms/mainmenu/start_big.png")));
		toolBar.add(signInButton);
		
		JButton administratorLogin = new JButton("Administrator Login");
		administratorLogin.addActionListener(new ActionListener() {
			AdministratorLogin adminLogin = new AdministratorLogin();
			public void actionPerformed(ActionEvent event) {
				if(!voterLoggedIn){
					if(adminLogin.isActive() == false){
						adminLogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						adminLogin.setVisible(true);
						adminLogin.setBounds(380,146,986,629);		
					}	
				}else{
					JOptionPane.showMessageDialog(null, "Please Log out From Voter Account","Admin Login",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		administratorLogin.setIcon(new ImageIcon(MainMenu.class.getResource("/com/treetechnologies/forms/mainmenu/database.png")));
		administratorLogin.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		toolBar.add(administratorLogin);
		
		JButton helpButton = new JButton("Help");
		helpButton.addActionListener(new ActionListener() {
			Help help = new Help();
			public void actionPerformed(ActionEvent event) {
				help.setVisible(true);
				help.setBounds(0,379,1200,400);	
				help.showMessageOnClick();
			}
		});
		helpButton.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		helpButton.setIcon(new ImageIcon(MainMenu.class.getResource("/com/treetechnologies/forms/mainmenu/icon_question.png")));
		toolBar.add(helpButton);
		
		JButton signOut = new JButton("Sign Out");
		signOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if(voterLoggedIn){
					int choice = JOptionPane.showConfirmDialog(null, "Are you Sure you want to Log Out ?", "Sign Out", JOptionPane.YES_NO_OPTION);
					if(choice == 0){
						changeLoginStatusLoggedOut();
					}
				}else{
					JOptionPane.showMessageDialog(null, "You are Not Logged In", "Sign Out", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		signOut.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		signOut.setIcon(new ImageIcon(MainMenu.class.getResource("/com/treetechnologies/forms/mainmenu/start_here_gnome_green(1).png")));
		toolBar.add(signOut);
		
		voterStatus = new JLabel("");
		voterStatus.setForeground(Color.WHITE);
		voterStatus.setVerticalAlignment(SwingConstants.BOTTOM);
		voterStatus.setHorizontalAlignment(SwingConstants.TRAILING);
		voterStatus.setLocation(new Point(900, 0));
		voterStatus.setMaximumSize(new Dimension(370, 93));
		voterStatus.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		toolBar.add(voterStatus);
				
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 93, 378, 635);
		getContentPane().add(layeredPane);
		
		JButton checkProjectionPollsButton = new JButton("Check Projection Polls\r\n");
		checkProjectionPollsButton.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		checkProjectionPollsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				CheckProjectionPoll checkProjection = new CheckProjectionPoll();
				checkProjection.setVisible(true);
				checkProjection.setBounds(380,165,65986,629);							
			}
		});
		checkProjectionPollsButton.setIcon(new ImageIcon(MainMenu.class.getResource("/com/treetechnologies/forms/mainmenu/bar_chart.png")));
		checkProjectionPollsButton.setBounds(0, 0, 378, 127);
		layeredPane.add(checkProjectionPollsButton);
		
		JButton voteYourCandidateButton = new JButton("Vote your Candidate");
		voteYourCandidateButton.addActionListener(new ActionListener() {
			VoteYourCandidate voteyourcandidate = new VoteYourCandidate();
			public void actionPerformed(ActionEvent event) {
				if(voterLoggedIn){
					if(voteyourcandidate.isActive() == false){
						voteyourcandidate.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						voteyourcandidate.setVisible(true);
						voteyourcandidate.setBounds(380,147,986,629);		
					}				
				}
				else{
					JOptionPane.showMessageDialog(null, "Please Log in","Cast Vote",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		voteYourCandidateButton.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		voteYourCandidateButton.setIcon(new ImageIcon(MainMenu.class.getResource("/com/treetechnologies/forms/mainmenu/india_flag.png")));
		voteYourCandidateButton.setBounds(0, 126, 378, 127);
		layeredPane.add(voteYourCandidateButton);
		
		JButton editProfileButton = new JButton("Edit Profile\r\n");
		editProfileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if(voterLoggedIn){
					
				}else{
					JOptionPane.showMessageDialog(null, "Please Log in","Edit Profile",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		editProfileButton.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		editProfileButton.setIcon(new ImageIcon(MainMenu.class.getResource("/com/treetechnologies/forms/mainmenu/profile.png")));
		editProfileButton.setBounds(0, 251, 378, 127);
		layeredPane.add(editProfileButton);
		
		JButton readPartyInformation = new JButton("Read Party Information\r\n");
		readPartyInformation.addActionListener(new ActionListener() {
			ReadPartyInformation readInfo = new ReadPartyInformation();
			public void actionPerformed(ActionEvent event) {
				if(readInfo.isActive() == false){
					readInfo.setVisible(true);
				}
			}
		});
		readPartyInformation.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		readPartyInformation.setIcon(new ImageIcon(MainMenu.class.getResource("/com/treetechnologies/forms/mainmenu/address_book.png")));
		readPartyInformation.setBounds(0, 377, 378, 127);
		layeredPane.add(readPartyInformation);
		
		JButton aboutUsButton = new JButton("About Us");
		aboutUsButton.addActionListener(new ActionListener() {
			AboutUs aboutUs = new AboutUs();
			public void actionPerformed(ActionEvent event) {
				aboutUs.setVisible(true);
				aboutUs.setBounds(0,379,1200,400);	
				aboutUs.showMessageOnClick();
			}
		});
		aboutUsButton.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		aboutUsButton.setIcon(new ImageIcon(MainMenu.class.getResource("/com/treetechnologies/forms/mainmenu/suit.png")));
		aboutUsButton.setBounds(0, 503, 378, 130);
		layeredPane.add(aboutUsButton);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Stencil Std", Font.PLAIN, 12));
		setJMenuBar(menuBar);
		
		JMenu fileMenuBar = new JMenu("File");
		menuBar.add(fileMenuBar);
		
		JMenu editMenuBar = new JMenu("Edit");
		menuBar.add(editMenuBar);
		
		JMenu viewMenuBar = new JMenu("View\r\n");
		menuBar.add(viewMenuBar);
		
		JMenu toolsMenuBar = new JMenu("Tools\r\n");
		menuBar.add(toolsMenuBar);
		
		JMenu helpMenuBar = new JMenu("Help");
		menuBar.add(helpMenuBar);				
	}
	
	public static void changeLoginStatusLoggedIn(){
		voterStatus.setText("Logged In");	
		voterLoggedIn = true;
	}
	
	public static void changeLoginStatusLoggedOut(){
		voterStatus.setText(" ");	
		voterLoggedIn = false;
	}
	
	
}
