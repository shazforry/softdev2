import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class calculator extends JFrame {
	
	public calculator(){
	super();
	initUI();
	placeComponents();
	bindListeners();
	
	}
	private void initUI() {
		this.setSize(400, 300);
		this.setTitle("Calculator") ;
		this.setLocationRelativeTo(null) ;
		this.setDefaultCloseOperation(EXIT_ON_CLOSE) ;
	}
	private void placeComponents() {
	}
	private void bindListeners() {
	}
	

    public static void main(String[] args) {

        JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame frame = new JFrame("Layout");
    	JPanel MainPanel =new JPanel();
    	JPanel Numberpanel = new JPanel();
    	
    	
    	frame.setSize(340,450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("calculator");
		frame.add(MainPanel);
		
		JTextArea TextArea = new JTextArea(2,10);
        Border textborder = BorderFactory.createLineBorder(Color.BLUE,6);
        TextArea.setBorder(textborder);
        TextArea.append("INPUT HERE");
        TextArea.setFont(new Font("Serif", Font.ITALIC, 30));
        
        MainPanel.setLayout(new BorderLayout());
        Border border = BorderFactory.createLineBorder(Color.BLUE,4);
        MainPanel.setBorder(border);
        MainPanel.add(TextArea, BorderLayout.NORTH);
        MainPanel.add(Numberpanel,BorderLayout.CENTER);
        
        Numberpanel.setLayout(new GridLayout(5,4,5,5));
        Border numberborder = BorderFactory.createLineBorder(Color.BLUE,4);
        Numberpanel.setBorder(numberborder);
        
        Numberpanel.add(new JButton("Bksp"));
		Numberpanel.add(new JButton("CE"));
		Numberpanel.add(new JButton("Clr"));
		Numberpanel.add(new JButton("+-"));
		
		Numberpanel.add(new JButton("7"));
		Numberpanel.add(new JButton("8"));
		Numberpanel.add(new JButton("9"));
		Numberpanel.add(new JButton("/"));
		
		Numberpanel.add(new JButton("4"));
		Numberpanel.add(new JButton("5"));
		Numberpanel.add(new JButton("6"));
		Numberpanel.add(new JButton("*"));
		
		Numberpanel.add(new JButton("1"));
		Numberpanel.add(new JButton("2"));
		Numberpanel.add(new JButton("3"));
		Numberpanel.add(new JButton("-"));
		
		Numberpanel.add(new JButton("0"));
		Numberpanel.add(new JButton("."));
		Numberpanel.add(new JButton("="));
		Numberpanel.add(new JButton("+"));
		
		
      
    }


}

