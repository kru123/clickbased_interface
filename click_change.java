package JavaSwing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;

@SuppressWarnings("serial")
public class Tooar extends JFrame {
	JFrame f;
	JToolBar tb;
	Container c=null;
	JButton b4;
	
	//Creating ToolBar //
	
Tooar(){
	
	JFrame f=new JFrame();
	f.setVisible(true);
	c=getContentPane();
	c.setSize(500,500);
	f.add(c);
	c.setLayout(null);
	JButton b4 = new JButton("Blue");
	b4.setBounds(400,300,80,100);
	JButton b5 = new JButton("Black");
	b5.setBounds(500,400,80,100);
	c.add(b4);
	c.add(b5);
	b4.addActionListener(new ActionListener(){

		int clk;
		@Override
		public void actionPerformed(ActionEvent a) {
			if(a.getSource()==b4){
				if(clk%2==0){
					c.setBackground(Color.BLUE);	
				}
				else{
					c.setBackground(Color.GRAY);
				}
				
			}
			clk++;
	  }
			
		
		
	});
	b5.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent a) {
			if(a.getSource()==b5){
				c.setBackground(Color.BLACK);
			}
			  			}
			
		
		
	});
	
	
}
public static void main(String[] args) {
	
	new Tooar();
}
}