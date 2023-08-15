package trys;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gui implements ActionListener{
	JTextField t;
	JLabel l;
	JButton b1,b2;
	JPanel p;
	JFrame f;
	
	gui(){
		t = new JTextField();
		l = new JLabel("Label");
		b1 = new JButton("B1");
		b2= new JButton("B2");
		p = new JPanel();
		f=new JFrame();
		
		t.setBounds(180,50,150,50);
		b1.setBounds(160,150,60,50);
		b2.setBounds(260,150,60,50);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		p.add(t);
		p.add(b1);
		p.add(b2);
		p.add(l);
		
		f.setContentPane(p);
		f.setSize(600,600);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new gui();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			t.setText("HELLO");
		}
		if(e.getSource()==b2) {
			t.setText("ggg");
		}
	}

}
