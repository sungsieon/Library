package Book;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Book1 {
	public static void main(String[] args) {
		JFrame f = new JFrame("도서 관리 프로그램");
		f.setBounds(200,20,1500,1000);
		f.setLayout(null);
		f.setVisible(true);
	
		JPanel container = new JPanel();
		container.setBounds(330,0,700,100);
	
		JButton button1 = new JButton("대여");
		button1.setBounds(220,20,100,50);
		JButton button2 = new JButton("도서");
		button2.setBounds(330,20,100,50);
		JButton button3 = new JButton("회원");
		button3.setBounds(440,20,100,50);
		JButton button4 = new JButton("종료");
		button4.setBounds(550,20,100,50);
	
		container.add(button1);
		container.add(button2);
		container.add(button3);
		container.add(button4);
		
		f.add(container);
	}
}