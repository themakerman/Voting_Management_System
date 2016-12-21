package com.treetechnologies.forms.checkprojectionpoll;

import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;

public class CheckProjectionPoll extends JFrame {
	
	public CheckProjectionPoll() {
		setTitle("ProjectionPollResults\r\n");
		
		setBounds(new Rectangle(380, 146, 986, 630));
		getContentPane().setLayout(null);
		
		DefaultCategoryDataset projectionPollDataset = new DefaultCategoryDataset();
		projectionPollDataset.addValue(7, "Party1", "Congress");
		projectionPollDataset.addValue(44,"Party2","BJP");
		projectionPollDataset.addValue(29,"Party3","shivSena");
		projectionPollDataset.addValue(71,"Party4","Aam Admi Party");
		projectionPollDataset.addValue(56,"Party5","MNS");
		
		JFreeChart barChart = ChartFactory.createBarChart3D("", "PoliticalParties", "VotesExpected", projectionPollDataset, PlotOrientation.VERTICAL, false, true, false);
		barChart.setBackgroundPaint(null);
		CategoryPlot p = barChart.getCategoryPlot();
		CategoryItemRenderer renderer = p.getRenderer();
		renderer.setSeriesPaint(0,Color.BLACK);
		renderer.setSeriesPaint(1,Color.BLUE);
		renderer.setSeriesPaint(2,Color.ORANGE);
		renderer.setSeriesPaint(3,Color.GREEN);
		renderer.setSeriesPaint(4,Color.RED);
		
		p.setRangeGridlinePaint(Color.WHITE);
		p.setBackgroundPaint(Color.WHITE);		
		barChart.setBackgroundPaint(null);
		
		ChartPanel chartPanel = new ChartPanel(barChart);
		chartPanel.setVisible(true);
		chartPanel.setBounds(43, 80, 876, 328);
		getContentPane().add(chartPanel);
				
	}
}
