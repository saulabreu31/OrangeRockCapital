package com.example.demo;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class OrangeRockCapital {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Orange Rock Capital");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel(new BorderLayout());
        JLabel label = new JLabel("Welcome to Orange Rock Capital");
        label.setFont(new Font("Arial", Font.BOLD, 16));

        panel.add(label, BorderLayout.NORTH);

        // Main Content
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Breaking News Section
        JPanel newsPanel = new JPanel();
        newsPanel.setLayout(new BoxLayout(newsPanel, BoxLayout.Y_AXIS));
        newsPanel.setBorder(BorderFactory.createTitledBorder("Breaking News"));
        newsPanel.add(new JLabel("USA Debt Information"));
        newsPanel.add(new JLabel("<html><a href='https://www.usdebtclock.org/'>UsDebtClock</a></html>"));
        newsPanel.add(new JLabel("USA Government Data"));
        newsPanel.add(new JLabel("<html><a href='https://fred.stlouisfed.org/series/UNRATE'>UnemploymentRate</a></html>"));
        newsPanel.add(new JLabel("<html><a href='https://fred.stlouisfed.org/series/CORESTICKM159SFRBATL'>CPI</a></html>"));
        newsPanel.add(new JLabel("<html><a href='https://news.research.stlouisfed.org/category/fred-announcements/'>FRED News</a></html>"));
        mainPanel.add(newsPanel);

        // YouTube Section
        JPanel youtubePanel = new JPanel();
        youtubePanel.setBorder(BorderFactory.createTitledBorder("YouTube"));
        youtubePanel.add(new JLabel("<html><a href='https://www.youtube.com/channel/UCUJeM_RGrAGukVlTEfw2L9w'>YouTube Channel</a></html>"));
        mainPanel.add(youtubePanel);

        // About Section
        JPanel aboutPanel = new JPanel();
        aboutPanel.setBorder(BorderFactory.createTitledBorder("About"));
        aboutPanel.add(new JLabel("<html>This is the about section. Back in the 90s, websites often had very simple layouts and were primarily text-based. There was no CSS or JavaScript, so everything was laid out using basic HTML.</html>"));
        mainPanel.add(aboutPanel);

        // Contact Section
        JPanel contactPanel = new JPanel();
        contactPanel.setBorder(BorderFactory.createTitledBorder("Contact"));
        contactPanel.add(new JLabel("To contact me, please send an email to email@example.com. That's how things were done in the 90s!"));
        mainPanel.add(contactPanel);

        // Add the mainPanel to a JScrollPane
        frame.add(new JScrollPane(mainPanel), BorderLayout.CENTER);

        // Footer
        JLabel footerLabel = new JLabel("© 1990s My Website. All rights reserved.", JLabel.CENTER);
        frame.add(footerLabel, BorderLayout.SOUTH);

        // Set the frame visibility to true
        frame.setVisible(true);
    }
}

