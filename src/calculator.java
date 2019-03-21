import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class calculator extends Applet
{

		double n1,n2,result;
		char symb;
		
		TextField tf=new TextField(15);
		Button plus=new Button("+");
		Button minus=new Button("-");
		Button inmultit=new Button("*");
		Button impartit=new Button("/");
		Button clear=new Button("C");
		Button egal=new Button("=");
		Button pct=new Button(".");
		Button []b=new Button[10];
		
		
		public void init() 
		{
			System.out.println("Init...");
			
			setBackground(new Color(211,211,211));
			setLayout(new GridLayout(2,7));
			setSize(700, 400);
			
			add(tf);
			add(plus);
			add(minus);
			add(inmultit);
			add(impartit);
			add(egal);
			add(clear);
			add(pct);
			
			for(int i=0;i<10;i++) 
			{
				b[i]=new Button(""+i);
				add(b[i]);
				b[i].addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) 
					{
						String x=e.getActionCommand();
						tf.setText(tf.getText()+x);
					}
					
				});
				
			}
			
			plus.addActionListener(new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					n1=Integer.parseInt(tf.getText());
					symb='+';
					tf.setText("");
				}
			});
			
			minus.addActionListener(new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					n1=Integer.parseInt(tf.getText());
					symb='-';
					tf.setText("");	
				}
			});
			
			inmultit.addActionListener(new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					n1=Integer.parseInt(tf.getText());
					symb='*';
					tf.setText("");
				}
			});
			
			impartit.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					n1=Integer.parseInt(tf.getText());
					symb='/';
					tf.setText("");
				}
			});
			
			egal.addActionListener(new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					n2=Integer.parseInt(tf.getText());
				
					if(symb=='+') 
					{
						result=n1+n2;
					}
					else if(symb=='-')
					{
						result=n1-n2;
					}
					else if(symb=='*')
					{
						result=n1*n2;
					}
					else if(symb=='/')
					{
						result=n1/n2;
					}
					
					tf.setText(result+"");
				}
			});
			
			clear.addActionListener(new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					tf.setText("");
				}
			});
		}

}