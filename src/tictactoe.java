package tictac;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
  
public class tictactoe extends JFrame {
	 int a1=1,a2=2,a3=3,a4=4,a5=5,a6=6,a7=7,a8=8,a9=9;
    public  int cnt=0;
    public  int cnt2=0;
    public  int ans=0;
     public  int ans2=0;
      String s;
      String j;
	JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	int che() {
		
		
		return 0;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tictactoe frame = new tictactoe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public tictactoe() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 365);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton btnNewButton = new JButton("New player");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ans=0;
				ans2=0;
				textField1.setText("0");
				textField2.setText("0");
			}
		});
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setBounds(427, 131, 105, 23);
		contentPane.add(btnNewButton);
		
		JLabel result = new JLabel("");
		result.setFont(new Font("Tahoma", Font.BOLD, 15));
		result.setBounds(328, 172, 204, 99);
		contentPane.add(result);
		JButton butn7 = new JButton("");
		butn7.setFont(new Font("Tahoma", Font.BOLD, 40));
		butn7.setEnabled(false);
		butn7.setForeground(Color.RED);
		butn7.setBackground(Color.CYAN);
		butn7.setBounds(218, 3, 100, 76);
		contentPane.add(butn7);
		
		JButton but8 = new JButton("");
		but8.setFont(new Font("Tahoma", Font.BOLD, 40));
		but8.setEnabled(false);
		but8.setForeground(Color.RED);
		but8.setBackground(Color.CYAN);
		but8.setBounds(218, 90, 100, 76);
		contentPane.add(but8);
		
		JButton butn9 = new JButton("");
		butn9.setFont(new Font("Tahoma", Font.BOLD, 40));
		butn9.setEnabled(false);
		butn9.setForeground(Color.RED);
		butn9.setBackground(Color.CYAN);
		butn9.setBounds(218, 172, 100, 89);
		contentPane.add(butn9);
		JButton but3 = new JButton("");
		JButton but4 = new JButton("");
		but4.setFont(new Font("Tahoma", Font.BOLD, 40));
		but4.setEnabled(false);
		but4.setForeground(Color.RED);
		but4.setBackground(Color.CYAN);
		but4.setBounds(110, 3, 100, 76);
		contentPane.add(but4);
		
		JButton but5 = new JButton("");
		but5.setFont(new Font("Tahoma", Font.BOLD, 40));
		but5.setEnabled(false);
		but5.setForeground(Color.RED);
		but5.setBackground(Color.CYAN);
		but5.setBounds(110, 90, 100, 76);
		contentPane.add(but5);
		
		JButton but6 = new JButton("");
		but6.setFont(new Font("Tahoma", Font.BOLD, 40));
		but6.setEnabled(false);
		but6.setForeground(Color.RED);
		but6.setBackground(Color.CYAN);
		but6.setBounds(110, 172, 100, 89);
		contentPane.add(but6);
		
		JButton but1 = new JButton("");
		but1.setFont(new Font("Tahoma", Font.BOLD, 40));
		
		but1.setEnabled(false);
		but1.setForeground(Color.RED);
		but1.setBackground(Color.CYAN);
		but1.setBounds(0, 3, 100, 76);
		contentPane.add(but1);
		
		JButton but2 = new JButton("");
		but2.setFont(new Font("Tahoma", Font.BOLD, 40));
		but2.setEnabled(false);
		but2.setForeground(Color.RED);
		but2.setBackground(Color.CYAN);
		but2.setBounds(0, 90, 100, 76);
		contentPane.add(but2);
		
		
		but3.setFont(new Font("Tahoma", Font.BOLD, 40));
		but3.setEnabled(false);
		
		but3.setForeground(Color.RED);
		but3.setBackground(Color.CYAN);
		but3.setBounds(0, 172, 100, 89);
		contentPane.add(but3);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.MAGENTA);
		panel.setBounds(0, 166, 318, 10);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.MAGENTA);
		panel_1.setBounds(0, 77, 318, 10);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.MAGENTA);
		panel_2.setBounds(97, 3, 16, 258);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.MAGENTA);
		panel_3.setBounds(206, 3, 16, 258);
		contentPane.add(panel_3);
		
		JRadioButton rdbtnStart = new JRadioButton("start");
		rdbtnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				but8.setEnabled(true);
				but1.setEnabled(true);
				but6.setEnabled(true);
				but3.setEnabled(true);
				but5.setEnabled(true);
				butn7.setEnabled(true);
				but4.setEnabled(true);
				butn9.setEnabled(true);
				but2.setEnabled(true);
				cnt2=1;
			}
		});
		rdbtnStart.setBackground(Color.YELLOW);
		rdbtnStart.setBounds(0, 276, 109, 23);
		contentPane.add(rdbtnStart);
		
		JButton btnNewButtonre = new JButton("Restart");
		btnNewButtonre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cnt2==1) {
			but1.setText(null);
			but2.setText(null);
			but3.setText(null);
			but4.setText(null);
			but5.setText(null);
			but6.setText(null);
			butn7.setText(null);
			but8.setText(null);
			butn9.setText(null);
			a1=1;
			a2=2;
			a3=3;
			a4=4;a5=5;
			a6=6;a7=7;
			a8=8;a9=9;
			cnt=0;
			but1.setBackground(null);
			but2.setBackground(null);
			but3.setBackground(null);
			but4.setBackground(null);
			but5.setBackground(null);
			but6.setBackground(null);
			butn7.setBackground(null);
			but8.setBackground(null);
			butn9.setBackground(null);
			but8.setEnabled(true);
			but1.setEnabled(true);
			but6.setEnabled(true);
			but3.setEnabled(true);
			but5.setEnabled(true);
			butn7.setEnabled(true);
			but4.setEnabled(true);
			butn9.setEnabled(true);
			but2.setEnabled(true);
			}
			}
		});
		btnNewButtonre.setBackground(Color.YELLOW);
		btnNewButtonre.setBounds(209, 276, 105, 23);
		contentPane.add(btnNewButtonre);
		
		textField1 = new JTextField();
		textField1.setEditable(false);
		textField1.setBounds(427, 11, 105, 43);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("player1");
		lblNewLabel.setBounds(352, 25, 65, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPlayer = new JLabel("player2");
		lblPlayer.setBounds(352, 91, 65, 14);
		contentPane.add(lblPlayer);
		
		textField2 = new JTextField();
		textField2.setEditable(false);
		textField2.setColumns(10);
		textField2.setBounds(427, 77, 105, 43);
		contentPane.add(textField2);
		
		but3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cnt%2==0) {
					but3.setText("X");
					a3=1;
				}
				else
				{but3.setText("O");
				but3.setBackground(getForeground());
					a3=0;
				}
				if((a1==a2 && a2==a3 )|| (a1==a4 && a4==a7)|| (a2==a5 && a5==a8)||(a3==a6 && a6==a9)||(a4==a5 && a5==a6)||(a7==a8 && a8==a9)||(a1==a5 && a5==a9)||(a3==a5 && a5==a7))
				{
					if(cnt%2==0) {
						result.setText("Player1 win!!!");
						ans++;
						String s=String.valueOf(ans);
						
						textField1.setText(""+s);
						
					}
					else {
						result.setText("Player2 win!!!");
						ans2++;
                   String s=String.valueOf(ans2);
						textField2.setText(""+s);
					}
					but1.setText(null);
					but2.setText(null);
					but3.setText(null);
					but4.setText(null);
					but5.setText(null);
					but6.setText(null);
					butn7.setText(null);
					but8.setText(null);
					butn9.setText(null);
					a1=1;
					a2=2;
					a3=3;
					a4=4;a5=5;
					a6=6;a7=7;
					a8=8;a9=9;
					cnt=0;
					but8.setEnabled(true);
					but1.setEnabled(true);
					but6.setEnabled(true);
					but3.setEnabled(true);
					but5.setEnabled(true);
					butn7.setEnabled(true);
					but4.setEnabled(true);
					butn9.setEnabled(true);
					but2.setEnabled(true);
					but1.setBackground(null);
					but2.setBackground(null);
					but3.setBackground(null);
					but4.setBackground(null);
					but5.setBackground(null);
					but6.setBackground(null);
					butn7.setBackground(null);
					but8.setBackground(null);
					butn9.setBackground(null);
				}
				else
				{cnt++;
				but3.setEnabled(false);
				}
				
			}
		});
		
		but8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cnt%2==0) {
					but8.setText("X");
					a8=1;
				}
				else
				{but8.setText("O");
				but8.setBackground(getForeground());
					a8=0;
				}
				if((a1==a2 && a2==a3 )|| (a1==a4 && a4==a7)|| (a2==a5 && a5==a8)||(a3==a6 && a6==a9)||(a4==a5 && a5==a6)||(a7==a8 && a8==a9)||(a1==a5 && a5==a9)||(a3==a5 && a5==a7))
				{
					if(cnt%2==0) {
						result.setText("Player1 win!!!");
						ans++;
						String s=String.valueOf(ans);
						
						textField1.setText(""+s);
						
					}
					else {
						result.setText("Player2 win!!!");
						ans2++;
                   String s=String.valueOf(ans2);
						textField1.setText(""+s);
					}
					but1.setText(null);
					but2.setText(null);
					but3.setText(null);
					but4.setText(null);
					but5.setText(null);
					but6.setText(null);
					butn7.setText(null);
					but8.setText(null);
					butn9.setText(null);
					a1=1;
					a2=2;
					a3=3;
					a4=4;a5=5;
					a6=6;a7=7;
					a8=8;a9=9;
					cnt=0;
					but8.setEnabled(true);
					but1.setEnabled(true);
					but6.setEnabled(true);
					but3.setEnabled(true);
					but5.setEnabled(true);
					butn7.setEnabled(true);
					but4.setEnabled(true);
					butn9.setEnabled(true);
					but2.setEnabled(true);
					but1.setBackground(null);
					but2.setBackground(null);
					but3.setBackground(null);
					but4.setBackground(null);
					but5.setBackground(null);
					but6.setBackground(null);
					butn7.setBackground(null);
					but8.setBackground(null);
					butn9.setBackground(null);
				}
				else
				{cnt++;
				but8.setEnabled(false);
				}
				
			}
		});
		but1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(cnt%2==0) {
					but1.setText("X");
					a1=1;
				}
				else
				{but1.setText("O");
				but1.setBackground(getForeground());
					a1=0;
				}
				if((a1==a2 && a2==a3 )|| (a1==a4 && a4==a7)|| (a2==a5 && a5==a8)||(a3==a6 && a6==a9)||(a4==a5 && a5==a6)||(a7==a8 && a8==a9)||(a1==a5 && a5==a9)||(a3==a5 && a5==a7))
				{
					if(cnt%2==0) {
						result.setText("Player1 win!!!");
						ans++;
						String s=String.valueOf(ans);
						
						textField1.setText(""+s);
						
					}
					else {
						result.setText("Player2 win!!!");
						ans2++;
                   String s=String.valueOf(ans2);
						textField2.setText(""+s);
					}
					but1.setText(null);
					but2.setText(null);
					but3.setText(null);
					but4.setText(null);
					but5.setText(null);
					but6.setText(null);
					butn7.setText(null);
					but8.setText(null);
					butn9.setText(null);
					a1=1;
					a2=2;
					a3=3;
					a4=4;a5=5;
					a6=6;a7=7;
					a8=8;a9=9;
					cnt=0;
					but8.setEnabled(true);
					but1.setEnabled(true);
					but6.setEnabled(true);
					but3.setEnabled(true);
					but5.setEnabled(true);
					butn7.setEnabled(true);
					but4.setEnabled(true);
					butn9.setEnabled(true);
					but2.setEnabled(true);
					but1.setBackground(null);
					but2.setBackground(null);
					but3.setBackground(null);
					but4.setBackground(null);
					but5.setBackground(null);
					but6.setBackground(null);
					butn7.setBackground(null);
					but8.setBackground(null);
					butn9.setBackground(null);
				}
				else
				{cnt++;
				but1.setEnabled(false);
				}
				
				
			}
		});	but6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cnt%2==0) {
					but6.setText("X");
					a6=1;
				}
				else
				{but6.setText("O");
				but6.setBackground(getForeground());
					a6=0;
				}
				if((a1==a2 && a2==a3 )|| (a1==a4 && a4==a7)|| (a2==a5 && a5==a8)||(a3==a6 && a6==a9)||(a4==a5 && a5==a6)||(a7==a8 && a8==a9)||(a1==a5 && a5==a9)||(a3==a5 && a5==a7))
				{
					if(cnt%2==0) {
						result.setText("Player1 win!!!");
						ans++;
						String s=String.valueOf(ans);
						
						textField1.setText(""+s);
						
					}
					else {
						result.setText("Player2 win!!!");
						ans2++;
                   String s=String.valueOf(ans2);
						textField2.setText(""+s);
					}
					but1.setText(null);
					but2.setText(null);
					but3.setText(null);
					but4.setText(null);
					but5.setText(null);
					but6.setText(null);
					butn7.setText(null);
					but8.setText(null);
					butn9.setText(null);
					a1=1;
					a2=2;
					a3=3;
					a4=4;a5=5;
					a6=6;a7=7;
					a8=8;a9=9;
					cnt=0;
					but8.setEnabled(true);
					but1.setEnabled(true);
					but6.setEnabled(true);
					but3.setEnabled(true);
					but5.setEnabled(true);
					butn7.setEnabled(true);
					but4.setEnabled(true);
					butn9.setEnabled(true);
					but2.setEnabled(true);
					but1.setBackground(null);
					but2.setBackground(null);
					but3.setBackground(null);
					but4.setBackground(null);
					but5.setBackground(null);
					but6.setBackground(null);
					butn7.setBackground(null);
					but8.setBackground(null);
					butn9.setBackground(null);
				}else 
				{cnt++;
				but6.setEnabled(false);
				}
				
			}
		});	
			but5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cnt%2==0) {
					but5.setText("X");
					a5=1;
				}
				else
				{but5.setText("O");
				but5.setBackground(getForeground());
					a5=0;
				} 
				if(((a1==a2 && a2==a3 )|| (a1==a4 && a4==a7)|| (a2==a5 && a5==a8)||(a3==a6 && a6==a9)||(a4==a5 && a5==a6)||(a7==a8 && a8==a9)||(a1==a5 && a5==a9)||(a3==a5 && a5==a7)) && (cnt>4))
				{
					if(cnt%2==0) {
						result.setText("Player1 win!!!");
						ans++;
						String s=String.valueOf(ans);
						
						textField1.setText(""+s);
						
					}
					else {
						result.setText("Player2 win!!!");
						ans2++;
                   String s=String.valueOf(ans2);
						textField2.setText(""+s);
					}
					but1.setText(null);
					but2.setText(null);
					but3.setText(null);
					but4.setText(null);
					but5.setText(null);
					but6.setText(null);
					butn7.setText(null);
					but8.setText(null);
					butn9.setText(null);
					a1=1;
					a2=2;
					a3=3;
					a4=4;a5=5;
					a6=6;a7=7;
					a8=8;a9=9;
					cnt=0;
					but8.setEnabled(true);
					but1.setEnabled(true);
					but6.setEnabled(true);
					but3.setEnabled(true);
					but5.setEnabled(true);
					butn7.setEnabled(true);
					but4.setEnabled(true);
					butn9.setEnabled(true);
					but2.setEnabled(true);
					but1.setBackground(null);
					but2.setBackground(null);
					but3.setBackground(null);
					but4.setBackground(null);
					but5.setBackground(null);
					but6.setBackground(null);
					butn7.setBackground(null);
					but8.setBackground(null);
					butn9.setBackground(null);
				}
				
				else 
				{cnt++;
				but5.setEnabled(false);
				}
				
			}
		});	butn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cnt%2==0) {
					butn7.setText("X");
					a7=1;
				}
				else
				{butn7.setText("O");
				butn7.setBackground(getForeground());
					a7=0;
				}
				if((a1==a2 && a2==a3 )|| (a1==a4 && a4==a7)|| (a2==a5 && a5==a8)||(a3==a6 && a6==a9)||(a4==a5 && a5==a6)||(a7==a8 && a8==a9)||(a1==a5 && a5==a9)||(a3==a5 && a5==a7))
				{
					if(cnt%2==0) {
						result.setText("Player1 win!!!");
						ans++;
						String s=String.valueOf(ans);
						
						textField1.setText(""+s);
						
					}
					else {
						result.setText("Player2 win!!!");
						ans2++;
                   String s=String.valueOf(ans2);
						textField2.setText(""+s);
					}
					but1.setText(null);
					but2.setText(null);
					but3.setText(null);
					but4.setText(null);
					but5.setText(null);
					but6.setText(null);
					butn7.setText(null);
					but8.setText(null);
					butn9.setText(null);
					a1=1;
					a2=2;
					a3=3;
					a4=4;a5=5;
					a6=6;a7=7;
					a8=8;a9=9;
					cnt=0;
					but8.setEnabled(true);
					but1.setEnabled(true);
					but6.setEnabled(true);
					but3.setEnabled(true);
					but5.setEnabled(true);
					butn7.setEnabled(true);
					but4.setEnabled(true);
					butn9.setEnabled(true);
					but2.setEnabled(true);
					but1.setBackground(null);
					but2.setBackground(null);
					but3.setBackground(null);
					but4.setBackground(null);
					but5.setBackground(null);
					but6.setBackground(null);
					butn7.setBackground(null);
					but8.setBackground(null);
					butn9.setBackground(null);
				} else 
				{cnt++;
				butn7.setEnabled(false);
			}}
		});	but4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cnt%2==0) {
					but4.setText("X");
					a4=1;
				}
				else
				{but4.setText("O");
				but4.setBackground(getForeground());
					a4=0;
				}
				if((a1==a2 && a2==a3 )|| (a1==a4 && a4==a7)|| (a2==a5 && a5==a8)||(a3==a6 && a6==a9)||(a4==a5 && a5==a6)||(a7==a8 && a8==a9)||(a1==a5 && a5==a9)||(a3==a5 && a5==a7))
				{
					if(cnt%2==0) {
						result.setText("Player1 win!!!");
						ans++;
						String s=String.valueOf(ans);
						
						textField1.setText(""+s);
						
					}
					else {
						result.setText("Player2 win!!!");
						ans2++;
                   String s=String.valueOf(ans2);
						textField2.setText(""+s);
					}
					but1.setText(null);
					but2.setText(null);
					but3.setText(null);
					but4.setText(null);
					but5.setText(null);
					but6.setText(null);
					butn7.setText(null);
					but8.setText(null);
					butn9.setText(null);
					a1=1;
					a2=2;
					a3=3;
					a4=4;a5=5;
					a6=6;a7=7;
					a8=8;a9=9;
					cnt=0;
					but8.setEnabled(true);
					but1.setEnabled(true);
					but6.setEnabled(true);
					but3.setEnabled(true);
					but5.setEnabled(true);
					butn7.setEnabled(true);
					but4.setEnabled(true);
					butn9.setEnabled(true);
					but2.setEnabled(true);
					but1.setBackground(null);
					but2.setBackground(null);
					but3.setBackground(null);
					but4.setBackground(null);
					but5.setBackground(null);
					but6.setBackground(null);
					butn7.setBackground(null);
					but8.setBackground(null);
					butn9.setBackground(null);
				}
				else 
				{cnt++;
				but4.setEnabled(false);
			}}
		});	butn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cnt%2==0) {
					butn9.setText("X");
					a9=1;
				}
				else
				{butn9.setText("O");
				butn9.setBackground(getForeground());
					a9=0;
				}
				if((a1==a2 && a2==a3 )|| (a1==a4 && a4==a7)|| (a2==a5 && a5==a8)||(a3==a6 && a6==a9)||(a4==a5 && a5==a6)||(a7==a8 && a8==a9)||(a1==a5 && a5==a9)||(a3==a5 && a5==a7))
				{
					if(cnt%2==0) {
						result.setText("Player1 win!!!");
						ans++;
						String s=String.valueOf(ans);
						
						textField1.setText(""+s);
						
					}
					else {
						result.setText("Player2 win!!!");
						ans2++;
                   String s=String.valueOf(ans2);
						textField2.setText(""+s);
					}
					but1.setText(null);
					but2.setText(null);
					but3.setText(null);
					but4.setText(null);
					but5.setText(null);
					but6.setText(null);
					butn7.setText(null);
					but8.setText(null);
					butn9.setText(null);
					a1=1;
					a2=2;
					a3=3;
					a4=4;a5=5;
					a6=6;a7=7;
					a8=8;a9=9;
					cnt=0;
					but8.setEnabled(true);
					but1.setEnabled(true);
					but6.setEnabled(true);
					but3.setEnabled(true);
					but5.setEnabled(true);
					butn7.setEnabled(true);
					but4.setEnabled(true);
					butn9.setEnabled(true);
					but2.setEnabled(true);
					but1.setBackground(null);
					but2.setBackground(null);
					but3.setBackground(null);
					but4.setBackground(null);
					but5.setBackground(null);
					but6.setBackground(null);
					butn7.setBackground(null);
					but8.setBackground(null);
					butn9.setBackground(null);
				}
				else 
				{
					cnt++;
				
				butn9.setEnabled(false); }
			
			}
		});	but2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cnt%2==0) {
					but2.setText("X");
					a2=1;
				}
				else
				{but2.setText("O");
				but2.setBackground(getForeground());
					a2=0;
				}
				if((a1==a2 && a2==a3) || (a1==a4 && a4==a7)|| (a2==a5 && a5==a8)||(a3==a6 && a6==a9)||(a4==a5 && a5==a6)||(a7==a8 && a8==a9)||(a1==a5 && a5==a9)||(a3==a5 && a5==a7))
				{
					if(cnt%2==0) {
						result.setText("Player1 win!!!");
						ans++;
						String s=String.valueOf(ans);
						
						textField1.setText(""+s);
						
					}
					else {
						result.setText("Player2 win!!!");
						ans2++;
                   String s=String.valueOf(ans2);
						textField2.setText(""+s);
					}
					but1.setText(null);
					but2.setText(null);
					but3.setText(null);
					but4.setText(null);
					but5.setText(null);
					but6.setText(null);
					butn7.setText(null);
					but8.setText(null);
					butn9.setText(null);
					a1=1;
					a2=2;
					a3=3;
					a4=4;a5=5;
					a6=6;a7=7;
					a8=8;a9=9;
					cnt=0;
					but8.setEnabled(true);
					but1.setEnabled(true);
					but6.setEnabled(true);
					but3.setEnabled(true);
					but5.setEnabled(true);
					butn7.setEnabled(true);
					but4.setEnabled(true);
					butn9.setEnabled(true);
					but2.setEnabled(true);
					but1.setBackground(null);
					but2.setBackground(null);
					but3.setBackground(null);
					but4.setBackground(null);
					but5.setBackground(null);
					but6.setBackground(null);
					butn7.setBackground(null);
					but8.setBackground(null);
					butn9.setBackground(null);
				} 
				else 
				{cnt++;
				but2.setEnabled(false);
				}}
		});	
		
	}
}
