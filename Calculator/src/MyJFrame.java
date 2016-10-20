import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyJFrame extends JFrame{
	
	public MyJFrame(){
		super();
		initUI();
		placeComponents();
		bindListeners();
	}
	
	private void placeComponents() {
		
		Container NumberPane = this.getContentPane();
		
		 
		NumberPane.setLayout(new GridLayout(0,4));
			
		NumberPane.add(new JButton("CE"));
		NumberPane.add(new JButton("C"));
		NumberPane.add(new JButton("<"));
		NumberPane.add(new JButton("/"));
		
		NumberPane.add(new JButton("7"));
		NumberPane.add(new JButton("8"));
		NumberPane.add(new JButton("9"));
		NumberPane.add(new JButton("*"));
		
		NumberPane.add(new JButton("4"));
		NumberPane.add(new JButton("5"));
		NumberPane.add(new JButton("6"));
		NumberPane.add(new JButton("-"));
		
		NumberPane.add(new JButton("1"));
		NumberPane.add(new JButton("2"));
		NumberPane.add(new JButton("3"));
		NumberPane.add(new JButton("+"));
		
		NumberPane.add(new JButton(" "));
		NumberPane.add(new JButton("0"));
		NumberPane.add(new JButton("."));
		NumberPane.add(new JButton("="));
		
	
		

	}

	private void initUI() {
		this.setTitle("Calculator");
		this.setSize(300,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void bindListeners() {
		// TODO Auto-generated method stub
		
	}

	
	}

	
		
