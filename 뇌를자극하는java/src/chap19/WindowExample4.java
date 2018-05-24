package chap19;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WindowExample4 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Fruit Basket Program");
		frame.setLocation(500, 400);
		Container contentPane = frame.getContentPane();
		FlowLayout layout = new FlowLayout();
		
		
		Color color = new Color(204,102,000);
		frame.getContentPane().setBackground(color);
		
		
		contentPane.setLayout(layout);
        contentPane.add(new JButton("사과"));
        contentPane.add(new JButton("파인애플"));
        contentPane.add(new JButton("오렌지"));
        contentPane.add(new JButton("포도"));
        contentPane.add(new JButton("레몬"));
        contentPane.add(new JButton("복숭아"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
	}

}
