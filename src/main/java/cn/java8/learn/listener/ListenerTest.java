package cn.java8.learn.listener;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ListenerTest {
	public static void main(String[] args){
		JButton testButton = new JButton("Test Button");
		
		//Normal implementation
		testButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ae) {
				System.out.println("Click Detected by Anon Class");
			}
		});
		
		//Lambda implementation
		testButton.addActionListener(e -> System.out.println("Click Detected by Lamdba1 Class"));
		testButton.addActionListener((e) -> System.out.println("Click Detected by Lamdba2 Class"));
		
		JFrame frame = new JFrame("Listener Test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(testButton,BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}
}
