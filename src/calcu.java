//package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;

public class calcu {
     double first;
      double second;
      double result;
    long c;
      String operation;
      String answer;
	 JFrame frame;
	private JTextField textField; int a=0;int b=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calcu window = new calcu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calcu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.BLACK);
		
		frame.setTitle("         *-*");
		frame.getContentPane().setForeground(new Color(244, 164, 96));
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 10));
		frame.setBounds(100, 100, 276, 412);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(Color.PINK);
		textField = new JTextField();
		textField.setEditable(false);
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setAction(null);
			}
		});
		textField.setBackground(Color.GREEN);
		textField.setBounds(0, 0, 261, 74);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		
		
		JButton button2 = new JButton("2");
		button2.setForeground(new Color(0, 0, 0));
		button2.setBackground(new Color(100, 149, 237));
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a!=0) {
					textField.setText(null);
			  a=0;
				}
				String num= textField.getText()+button2.getText();
				textField.setText(num);
			}
			
		});
		button2.setFont(new Font("Tahoma", Font.BOLD, 18));
		button2.setBounds(0, 163, 65, 53);
		frame.getContentPane().add(button2);
		
		JButton button1 = new JButton("1");
		button1.setBackground(new Color(100, 149, 237));
		button1.setForeground(new Color(0, 0, 0));
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(a!=0) {
					textField.setText(null);
			  a=0;
				}
				String num= textField.getText()+button1.getText();
				textField.setText(num);
			}
		});
		button1.setFont(new Font("Tahoma", Font.BOLD, 18));
		button1.setBounds(0, 111, 65, 53);
		frame.getContentPane().add(button1);
		
		JButton button3 = new JButton("3");
		button3.setForeground(new Color(0, 0, 0));
		button3.setBackground(new Color(100, 149, 237));
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a!=0) {
					textField.setText(null);
			  a=0;
				}
				String num=textField.getText()+button3.getText();
				textField.setText(num);
			}
			
		});
		button3.setFont(new Font("Tahoma", Font.BOLD, 18));
		button3.setBounds(0, 216, 65, 53);
		frame.getContentPane().add(button3);
		
		JButton button4 = new JButton("4");
		button4.setForeground(new Color(0, 0, 0));
		button4.setBackground(new Color(100, 149, 237));
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a!=0) {
					textField.setText(null);
			  a=0;
				}
				String num=textField.getText()+button4.getText();
				textField.setText(num);
			}
		});
		button4.setFont(new Font("Tahoma", Font.BOLD, 18));
		button4.setBounds(0, 267, 65, 53);
		frame.getContentPane().add(button4);
		
		JButton button5 = new JButton("5");
		button5.setForeground(new Color(0, 0, 0));
		button5.setBackground(new Color(100, 149, 237));
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a!=0) {
					textField.setText(null);
			  a=0;
				}
				String num= textField.getText()+button5.getText();
				textField.setText(num);
			}
		});
		button5.setFont(new Font("Tahoma", Font.BOLD, 18));
		button5.setBounds(0, 320, 65, 53);
		frame.getContentPane().add(button5);
		
		JButton button6 = new JButton("6");
		button6.setBackground(new Color(100, 149, 237));
		button6.setForeground(new Color(0, 0, 0));
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a!=0) {
					textField.setText(null);
			  a=0;
				}
				String num= textField.getText()+button6.getText();
				textField.setText(num);
			}
		});
		button6.setFont(new Font("Tahoma", Font.BOLD, 18));
		button6.setBounds(67, 111, 65, 53);
		frame.getContentPane().add(button6);
		
		JButton button7 = new JButton("7");
		button7.setForeground(new Color(0, 0, 0));
		button7.setBackground(new Color(100, 149, 237));
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a!=0) {
					textField.setText(null);
			  a=0;
				}
				String num= textField.getText()+button7.getText();
				textField.setText(num);
			}
		});
		button7.setFont(new Font("Tahoma", Font.BOLD, 18));
		button7.setBounds(67, 163, 65, 53);
		frame.getContentPane().add(button7);
		
		JButton button9 = new JButton("9");
		button9.setBackground(new Color(100, 149, 237));
		button9.setForeground(new Color(0, 0, 0));
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a!=0) {
					textField.setText(null);
			  a=0;
				}
				String num= textField.getText()+button9.getText();
				textField.setText(num);
			}
		});
		button9.setFont(new Font("Tahoma", Font.BOLD, 18));
		button9.setBounds(67, 267, 65, 53);
		frame.getContentPane().add(button9);
		
		JButton button8 = new JButton("8");
		button8.setBackground(new Color(100, 149, 237));
		button8.setForeground(new Color(0, 0, 0));
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a!=0) {
					textField.setText(null);
			  a=0;
				}
				String num= textField.getText()+button8.getText();
				textField.setText(num);
			}
		});
		button8.setFont(new Font("Tahoma", Font.BOLD, 18));
		button8.setBounds(67, 216, 65, 53);
		frame.getContentPane().add(button8);
		
		JButton button0 = new JButton("0");
		button0.setForeground(new Color(0, 0, 0));
		button0.setBackground(UIManager.getColor("windowBorder"));
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a!=0) {
					textField.setText(null);
			  a=0;
				}
				String num=textField.getText()+button0.getText();
				textField.setText(num);
			}
		});
		button0.setFont(new Font("Tahoma", Font.BOLD, 18));
		button0.setBounds(67, 320, 128, 53);
		frame.getContentPane().add(button0);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnB.setBackground(new Color(255, 69, 0));
		btnB.setForeground(new Color(255, 255, 255));
		btnB.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnB.setBounds(130, 111, 65, 53);
		frame.getContentPane().add(btnB);
		
		JButton btnIsprime = new JButton("Isprime");
		btnIsprime.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent arg0) {
				if(a!=0) {
					textField.setText(null);
			  a=0;
				}
				if(textField.getText().length()>0) { String w="YES";
					b = Integer.parseInt(textField.getText());
					for(int i=2;i*i<=b;i++) {
						if(b%i==0) w="NO";
					}
					if(b<2) w="NO";
					textField.setText(w);
					a=1;
				}
				
			}
		});
		btnIsprime.setForeground(Color.BLACK);
		btnIsprime.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnIsprime.setBounds(130, 163, 131, 53);
		frame.getContentPane().add(btnIsprime);
		
		JButton buttonfact = new JButton("!");
		buttonfact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a!=0) {
					textField.setText(null);
			  a=0;
				}
				
				if(textField.getText().length()>0) { 
				c= Long.parseLong(textField.getText());
				if(c>20)textField.setText("Pls give a small number");
				else {
				for(long i=c-1;i>1;i--) {
					c*=i;
				}
				if(c==0) c=1;
				textField.setText(String.valueOf(c));
			} a=1;
				}
			
			}
		});
		buttonfact.setBackground(new Color(255, 69, 0));
		buttonfact.setForeground(new Color(255, 255, 255));
		buttonfact.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonfact.setBounds(130, 267, 65, 53);
		frame.getContentPane().add(buttonfact);
		
		JButton btnGcd = new JButton("gcd");
		btnGcd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a!=0) {
					textField.setText(null);
			  a=0;
				} if(textField.getText().length()>0) {
				operation = "gcd";
				first = Double.parseDouble(textField.getText());
				textField.setText(null);
			}
			}
		});
		btnGcd.setBackground(new Color(255, 69, 0));
		btnGcd.setForeground(new Color(255, 255, 255));
		btnGcd.setFont(new Font("Tahoma", Font.ITALIC, 18));
		btnGcd.setBounds(130, 216, 65, 53);
		frame.getContentPane().add(btnGcd);
		
		JButton btnC = new JButton("c");
		btnC.setBackground(new Color(255, 69, 0));
		btnC.setForeground(new Color(255, 255, 255));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnC.setBounds(196, 111, 65, 53);
		frame.getContentPane().add(btnC);
		
		JButton button_mod = new JButton("%");
		button_mod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a!=0) {
					textField.setText(null);
			  a=0;
				}  if(textField.getText().length()>0) {
				operation = "mod";
				first = Double.parseDouble(textField.getText());
				textField.setText(null);
			} }
		});
		button_mod.setForeground(new Color(255, 255, 255));
		button_mod.setBackground(new Color(255, 69, 0));
		button_mod.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_mod.setBounds(196, 267, 65, 53);
		frame.getContentPane().add(button_mod);
		
		JButton btnLcm = new JButton("lcm");
		btnLcm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a!=0) {
					textField.setText(null);
			  a=0;
				}  if(textField.getText().length()>0) {
				operation = "lcm";
				first = Double.parseDouble(textField.getText());
				textField.setText(null);
			} }
		});
		btnLcm.setBackground(new Color(255, 69, 0));
		btnLcm.setForeground(new Color(255, 255, 255));
		btnLcm.setFont(new Font("Tahoma", Font.ITALIC, 18));
		btnLcm.setBounds(196, 216, 65, 53);
		frame.getContentPane().add(btnLcm);
		
		JButton button_equal = new JButton("=");
		button_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a!=0) {
					textField.setText(null);
			  a=0;
				}
				second = Double.parseDouble(textField.getText());
			  if(operation=="gcd") {
				double n1 = first;double n2 = second, gcd = 1;

			        for(double i = 1; i <= n1 && i <= n2; ++i)
			        {
			           
			            if(n1 % i==0 && n2 % i==0)
			                gcd = i;
			        }  int g= (int) gcd;
                  textField.setText(String.valueOf(g)); a=1;
			  }
			  else if(operation == "lcm") {
				  double n1 = first, n2 = second, lcm;
				    lcm = (n1 > n2) ? n1 : n2;
				    while(true) {
				      if( lcm % n1 == 0 && lcm % n2 == 0 ) {
				        break;
				      }
				      ++lcm;
				    }
				    int g= (int) lcm;
				    textField.setText(String.valueOf(g)); a=1;
			  }
			  else if(operation=="mod") {
				  if(first<second) {
					  double temp= second;
					  second=first;
					  first= temp;
				  }
				   int g = (int) ((int) first%second);
				   textField.setText(String.valueOf(g)); a=1;
			  }
			}
			
		});
		button_equal.setForeground(new Color(255, 255, 255));
		button_equal.setBackground(new Color(255, 69, 0));
		button_equal.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_equal.setBounds(196, 320, 65, 53);
		frame.getContentPane().add(button_equal);
		
		JRadioButton rdbtnNewRadioButtonon = new JRadioButton("on");
		rdbtnNewRadioButtonon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button1.setEnabled(true);
				button2.setEnabled(true);
				button3.setEnabled(true);
				button4.setEnabled(true);
				button5.setEnabled(true);
				button6.setEnabled(true);
				button7.setEnabled(true);
				button8.setEnabled(true);
				button9.setEnabled(true);
				button0.setEnabled(true);
				btnB.setEnabled(true);
				btnIsprime.setEnabled(true);
				buttonfact.setEnabled(true);
				btnGcd.setEnabled(true);
				btnC.setEnabled(true);
				button_mod.setEnabled(true);
				btnLcm.setEnabled(true);
				button_equal.setEnabled(true);
			}
		});
		rdbtnNewRadioButtonon.setBounds(10, 81, 45, 23);
		frame.getContentPane().add(rdbtnNewRadioButtonon);
		JRadioButton rdbtnOff = new JRadioButton("off");
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				button6.setEnabled(false);
				button7.setEnabled(false);
				button8.setEnabled(false);
				button9.setEnabled(false);
				button0.setEnabled(false);
				btnB.setEnabled(false);
				btnIsprime.setEnabled(false);
				buttonfact.setEnabled(false);
				btnGcd.setEnabled(false);
				btnC.setEnabled(false);
				button_mod.setEnabled(false);
				btnLcm.setEnabled(false);
				button_equal.setEnabled(false);
			}
		});
		rdbtnOff.setBounds(57, 81, 45, 23);
		frame.getContentPane().add(rdbtnOff);
	}
}
