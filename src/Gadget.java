import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JToggleButton;
import java.awt.Font;
import javax.swing.SwingConstants;

import tictac.tictactoe;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gadget {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gadget window = new Gadget();
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
	public Gadget() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 99));
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("CALCULATOR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcu window = new calcu();
				window.frame.setVisible(true);
				//frame.setVisible(false);
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(38, 92, 138, 65);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblDekstopGadget = new JLabel("______DEKSTOP GADGET\r\n______");
		lblDekstopGadget.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblDekstopGadget.setHorizontalAlignment(SwingConstants.CENTER);
		lblDekstopGadget.setForeground(Color.CYAN);
		lblDekstopGadget.setBounds(161, 0, 446, 50);
		frame.getContentPane().add(lblDekstopGadget);
		
		JButton btnClock = new JButton("CLOCK");
		btnClock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clock window = new clock();
				window.frame1.setVisible(true);
				//frame.setVisible(false);
			}
		});
		btnClock.setForeground(Color.WHITE);
		btnClock.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnClock.setBackground(Color.RED);
		btnClock.setBounds(218, 92, 138, 65);
		frame.getContentPane().add(btnClock);
		
		JButton btnCalender = new JButton("CALENDER");
		btnCalender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calender window = new calender();
				window.frame2.setVisible(true);
			
			}
		});
		btnCalender.setForeground(Color.WHITE);
		btnCalender.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCalender.setBackground(Color.RED);
		btnCalender.setBounds(418, 92, 138, 65);
		frame.getContentPane().add(btnCalender);
		
		JButton btnNotepad = new JButton("NOTEPAD");
		btnNotepad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				notepad window = new notepad();
				window.frmNotepad.setVisible(true);
			}
		});
		btnNotepad.setForeground(Color.WHITE);
		btnNotepad.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNotepad.setBackground(Color.RED);
		btnNotepad.setBounds(590, 92, 138, 65);
		frame.getContentPane().add(btnNotepad);
		
		JLabel lblO = new JLabel("O");
		lblO.setFont(new Font("Tahoma", Font.BOLD, 99));
		lblO.setHorizontalAlignment(SwingConstants.LEFT);
		lblO.setForeground(Color.CYAN);
		lblO.setBounds(0, 286, 83, 92);
		frame.getContentPane().add(lblO);
		
		JLabel label = new JLabel("O");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setForeground(Color.CYAN);
		label.setFont(new Font("Tahoma", Font.BOLD, 80));
		label.setBounds(38, 252, 69, 73);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel(".");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 99));
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setBounds(81, 203, 89, 65);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnTictactoe = new JButton("TicTacToe");
		btnTictactoe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tictactoe frame = new tictactoe();
				frame.setVisible(true);
			}
		});
		btnTictactoe.setForeground(Color.WHITE);
		btnTictactoe.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTictactoe.setBackground(Color.RED);
		btnTictactoe.setBounds(316, 168, 138, 65);
		frame.getContentPane().add(btnTictactoe);
		frame.setBounds(100, 100, 766, 416);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
