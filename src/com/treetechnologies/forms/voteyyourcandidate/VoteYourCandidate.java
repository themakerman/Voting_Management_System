package com.treetechnologies.forms.voteyyourcandidate;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JToolBar;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JRadioButton;
import javax.swing.JLabel;

import java.awt.Dimension;

import javax.swing.SwingConstants;

import java.awt.Color;

public class VoteYourCandidate extends JFrame {
	private final JButton btnNewButon = new JButton("CAST VOTE");
	public VoteYourCandidate() {
		setTitle("Voting Panel");
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Aam Admi Party");
		btnNewButton.setIcon(new ImageIcon(VoteYourCandidate.class.getResource("/com/treetechnologies/forms/voteyyourcandidate/aapSymbol.png")));
		btnNewButton.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.setMaximumSize(new Dimension(656, 102));
		btnNewButton.setBounds(0, 0, 656, 85);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Bhartiya Janta Party\r\n");
		btnNewButton_1.setIcon(new ImageIcon(VoteYourCandidate.class.getResource("/com/treetechnologies/forms/voteyyourcandidate/BJP.png")));
		btnNewButton_1.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_1.setBounds(0, 84, 656, 85);
		getContentPane().add(btnNewButton_1);
		
		JButton btnMahrashtraNavnirmanSena = new JButton("Maharashtra NavNirman Sena\r\n");
		btnMahrashtraNavnirmanSena.setIcon(new ImageIcon(VoteYourCandidate.class.getResource("/com/treetechnologies/forms/voteyyourcandidate/MnsSymbol.png")));
		btnMahrashtraNavnirmanSena.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		btnMahrashtraNavnirmanSena.setBounds(0, 168, 656, 85);
		getContentPane().add(btnMahrashtraNavnirmanSena);
		
		JButton btnCongressParty = new JButton("Congress Party");
		btnCongressParty.setMaximumSize(new Dimension(107, 18));
		btnCongressParty.setIcon(new ImageIcon(VoteYourCandidate.class.getResource("/com/treetechnologies/forms/voteyyourcandidate/congess logo.png")));
		btnCongressParty.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		btnCongressParty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCongressParty.setBounds(0, 252, 656, 85);
		getContentPane().add(btnCongressParty);
		
		JButton btnShivSena = new JButton("Shiv Sena");
		btnShivSena.setIcon(new ImageIcon(VoteYourCandidate.class.getResource("/com/treetechnologies/forms/voteyyourcandidate/tiger.png")));
		btnShivSena.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		btnShivSena.setBounds(0, 336, 656, 85);
		getContentPane().add(btnShivSena);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setOrientation(SwingConstants.VERTICAL);
		toolBar.setBounds(655, -12, 315, 613);
		getContentPane().add(toolBar);
		
		JRadioButton aapVoteRadioButton = new JRadioButton("VOTE AAM ADMI PARTY");
		aapVoteRadioButton.setSize(new Dimension(656, 85));
		aapVoteRadioButton.setMaximumSize(new Dimension(656, 85));
		aapVoteRadioButton.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		aapVoteRadioButton.setBackground(Color.WHITE);
		toolBar.add(aapVoteRadioButton);
		
		JRadioButton bjpVoteRadioButton = new JRadioButton("VOTE BJP");
		bjpVoteRadioButton.setSize(new Dimension(656, 102));
		bjpVoteRadioButton.setMaximumSize(new Dimension(656, 83));
		bjpVoteRadioButton.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		bjpVoteRadioButton.setBackground(Color.WHITE);
		toolBar.add(bjpVoteRadioButton);
		
		JRadioButton mnsVoteRadioButton = new JRadioButton("VOTE MNS");
		mnsVoteRadioButton.setSize(new Dimension(656, 102));
		mnsVoteRadioButton.setMaximumSize(new Dimension(656, 83));
		mnsVoteRadioButton.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		mnsVoteRadioButton.setBackground(Color.WHITE);
		toolBar.add(mnsVoteRadioButton);
		
		JRadioButton congressVoteRadioButton = new JRadioButton("VOTE CONGRESS");
		congressVoteRadioButton.setSize(new Dimension(656, 102));
		congressVoteRadioButton.setMaximumSize(new Dimension(656, 83));
		congressVoteRadioButton.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		congressVoteRadioButton.setBackground(Color.WHITE);
		toolBar.add(congressVoteRadioButton);
		
		JRadioButton shivSenaVoteRadioButton = new JRadioButton("Shiv Sena");
		shivSenaVoteRadioButton.setSize(new Dimension(656, 102));
		shivSenaVoteRadioButton.setMaximumSize(new Dimension(656, 83));
		shivSenaVoteRadioButton.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		shivSenaVoteRadioButton.setBackground(Color.WHITE);
		toolBar.add(shivSenaVoteRadioButton);
		
		JRadioButton nonOfTheAboveVoteRadioButton = new JRadioButton("NON OF the\r\n ABOVE");
		nonOfTheAboveVoteRadioButton.setSize(new Dimension(656, 102));
		nonOfTheAboveVoteRadioButton.setMaximumSize(new Dimension(656, 83));
		nonOfTheAboveVoteRadioButton.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		nonOfTheAboveVoteRadioButton.setBackground(Color.WHITE);
		toolBar.add(nonOfTheAboveVoteRadioButton);
		
		ButtonGroup group = new ButtonGroup();
		group.add(aapVoteRadioButton);
		group.add(bjpVoteRadioButton);
		group.add(mnsVoteRadioButton);
		group.add(congressVoteRadioButton);
		group.add(shivSenaVoteRadioButton);
		group.add(nonOfTheAboveVoteRadioButton);
		
		btnNewButon.setForeground(Color.WHITE);
		btnNewButon.setOpaque(false);
		btnNewButon.setMaximumSize(new Dimension(670, 100));
		btnNewButon.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 24));
		toolBar.add(btnNewButon);
		
		JButton btnNonOfAbove = new JButton("Non Of the Above\r\n");
		btnNonOfAbove.setIcon(new ImageIcon(VoteYourCandidate.class.getResource("/com/treetechnologies/forms/voteyyourcandidate/childish_thumb_down.png")));
		btnNonOfAbove.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		btnNonOfAbove.setBounds(0, 420, 656, 85);
		getContentPane().add(btnNonOfAbove);
		
		
	}
}
