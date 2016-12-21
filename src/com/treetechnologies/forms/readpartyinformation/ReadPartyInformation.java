package com.treetechnologies.forms.readpartyinformation;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.BrowserFactory;

public class ReadPartyInformation extends JFrame {
	
	JFrame frame = new JFrame();	
	Browser browser = BrowserFactory.create();
	
	public ReadPartyInformation(){
		setTitle("ReadPartyInformation\r\n");
		setBounds(new Rectangle(380, 146, 986, 630));
		getContentPane().setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setOrientation(SwingConstants.VERTICAL);
		toolBar.setBounds(716, 0, 254, 617);
		getContentPane().add(toolBar);		
		
		JButton aapBrowseInfo = new JButton("Aam Admi Party\r\n");
		aapBrowseInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if(frame.isActive() == false){			
					frame.setTitle("Aam Admi Party");
					frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
					frame.getContentPane().add(browser.getView().getComponent());
					frame.setBounds(380,146,730,629);
					frame.setVisible(true);
					browser.loadURL("http://en.wikipedia.org/wiki/Aam_Aadmi_Party");
				}
			}
		});
		aapBrowseInfo.setMaximumSize(new Dimension(254, 110));
		aapBrowseInfo.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		aapBrowseInfo.setBounds(new Rectangle(0, 0, 254, 617));
		toolBar.add(aapBrowseInfo);
		
		JButton shivSenaBrowseInfo = new JButton("Shiv Sena\r\n");
		shivSenaBrowseInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if(frame.isActive() == false){
					frame.setTitle("Shiv Sena");
					frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		        	frame.getContentPane().add(browser.getView().getComponent());
		        	frame.setBounds(380,146,730,629);
		        	frame.setVisible(true);
		        	browser.loadURL("http://en.wikipedia.org/wiki/Shiv_Sena");
				}				
			}
		});
		
		shivSenaBrowseInfo.setMaximumSize(new Dimension(254, 110));
		shivSenaBrowseInfo.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		shivSenaBrowseInfo.setBounds(new Rectangle(0, 0, 254, 617));
		toolBar.add(shivSenaBrowseInfo);
		
		JButton bjpBrowseInfo = new JButton("BJP\r\n");
		bjpBrowseInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if(frame.isActive() == false){
					frame.setTitle("BJP");
					frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		        	frame.getContentPane().add(browser.getView().getComponent());
		        	frame.setBounds(380,146,730,629);
		        	frame.setVisible(true);
		        	browser.loadURL("http://en.wikipedia.org/wiki/Bjp");
				}
			}
		});
		
		bjpBrowseInfo.setMaximumSize(new Dimension(254, 110));
		bjpBrowseInfo.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		bjpBrowseInfo.setBounds(new Rectangle(0, 0, 254, 617));
		toolBar.add(bjpBrowseInfo);
		
		JButton mnsBrowseInfo = new JButton("MNS\r\n");
		mnsBrowseInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if(frame.isActive() == false){
					frame.setTitle("MNS");
					frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		        	frame.getContentPane().add(browser.getView().getComponent());
		        	frame.setBounds(380,138,730,629);
		        	frame.setVisible(true);
		        	browser.loadURL("http://en.wikipedia.org/wiki/Maharashtra_Navnirman_Sena");
				}
			}
		});
		
		mnsBrowseInfo.setMaximumSize(new Dimension(254, 110));
		mnsBrowseInfo.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		mnsBrowseInfo.setBounds(new Rectangle(0, 0, 254, 617));
		toolBar.add(mnsBrowseInfo);
		
		JButton congressBrowseInfo = new JButton("Congress\r\n");
		congressBrowseInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if(frame.isActive() == false){
					frame.setTitle("Congress");
					frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		        	frame.getContentPane().add(browser.getView().getComponent());
		        	frame.setBounds(380,146,730,629);
		        	frame.setVisible(true);
		        	browser.loadURL("http://en.wikipedia.org/wiki/Indian_National_Congress");
				}
			}
		});
		congressBrowseInfo.setFont(new Font("Stencil Std", Font.BOLD | Font.ITALIC, 16));
		congressBrowseInfo.setMaximumSize(new Dimension(254, 110));
		congressBrowseInfo.setBounds(new Rectangle(0, 0, 254, 617));
		toolBar.add(congressBrowseInfo);	    
	} 
}
