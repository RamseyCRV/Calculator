
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextField;

public class Calculator extends JApplet{
	
	JTextField coef1=new JTextField(10);
	JTextField coef2=new JTextField(10);
	JButton plus=new JButton("+");
	JButton minus=new JButton("-");
	JButton inmultire=new JButton("*");
	JButton impartire=new JButton("/");
	JTextField rez=new JTextField(10);
	JButton curata=new JButton("C");
	JMenuBar bara=new JMenuBar();
	JMenu sett=new JMenu("Settings");
	JButton color=new JButton("Color");
	
	public void init() {
		
		super.init();
		System.out.println("Partea de initializare...");
		Container cal=this.getContentPane();
		cal.setBackground(new Color(122,122,121));
		cal.add(bara);
		cal.add(sett);
		cal.add(color);
		cal.add(coef1);
		cal.add(coef2);
		cal.add(plus);
		cal.add(minus);
		cal.add(inmultire);
		cal.add(impartire);
		cal.add(rez);
		cal.add(curata);
	
		bara.add(sett);
		bara.add(color);
		cal.validate();
	//	color.validate();
		cal.setLayout(new FlowLayout());
		this.setSize(130,230);
		
		color.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Random rand=new Random();
				int redValue=rand.nextInt(255);
				int greenValue=rand.nextInt(255);
				int blueValue=rand.nextInt(255);
				System.out.println("RED: "+redValue +"  GREEN: "+greenValue+ "  BLUE: "+blueValue);
				Color clr=new Color(redValue,greenValue,blueValue);
				cal.setBackground(clr);
				
				
			}
		});
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double p1=Double.parseDouble(coef1.getText());
				double p2=Double.parseDouble(coef2.getText());
				double result=p1+p2;
				rez.setText(""+result);
			}
		});
		minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double m1=Double.parseDouble(coef1.getText());
				double m2=Double.parseDouble(coef2.getText());
				double result=m1-m2;
				rez.setText(""+result);
				
			}
		});
		inmultire.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double i1=Double.parseDouble(coef1.getText());
				double i2=Double.parseDouble(coef2.getText());
				double result=i1*i2;
				rez.setText(""+result);	
			}
		});
		impartire.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double d1=Double.parseDouble(coef1.getText());
				double d2=Double.parseDouble(coef2.getText());
				double result=d1/d2;
				rez.setText(""+result);
				
			}
		});
		curata.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				coef1.setText("");
				coef2.setText("");
				rez.setText("");
				
			}
		});
	}
	

}