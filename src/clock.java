
import java.time.*;
import java.awt.EventQueue;
import java.time.LocalDate;
import java.util.Date;  
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class clock {

	JFrame frame1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					clock window = new clock();
					window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public clock() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame1 = new JFrame();
		frame1.setBackground(Color.GRAY);
		frame1.getContentPane().setBackground(Color.MAGENTA);
		frame1.setForeground(new Color(244, 164, 96));
		frame1.getContentPane().setForeground(SystemColor.textHighlight);
		frame1.setBounds(100, 100, 616, 317);
		//frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBackground(Color.BLUE);
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Tahoma", Font.BOLD, 60));
		textField.setBounds(0, 0, 600, 216);
		frame1.getContentPane().add(textField);
		textField.setColumns(10);

		
		JButton btnNewButtondate = new JButton("DATE");
		btnNewButtondate.setForeground(new Color(0, 0, 0));
		btnNewButtondate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LocalDate now = LocalDate.now();
				textField.setText(""+now);
			}
		});
		btnNewButtondate.setBackground(new Color(51, 255, 0));
		btnNewButtondate.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnNewButtondate.setBounds(0, 214, 203, 65);
		frame1.getContentPane().add(btnNewButtondate);
		
		JButton btnNewButtontime = new JButton("TIME");
		btnNewButtontime.setForeground(new Color(0, 0, 0));
		btnNewButtontime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LocalTime now = LocalTime.now();
				textField.setText(""+now);
			}
			
		});
		btnNewButtontime.setBackground(new Color(51, 255, 0));
		btnNewButtontime.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnNewButtontime.setBounds(406, 214, 194, 64);
		frame1.getContentPane().add(btnNewButtontime);
		
		JButton btnNewButton = new JButton("Day");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date d= new Date();
			
				 if(d.getDay()==0)
					textField.setText("Sunday");
				else if(d.getDay()==1)
					textField.setText("Monday");
				else if(d.getDay()==2)
					textField.setText("Tuesday");
				else if(d.getDay()==3)
					textField.setText("Wednesday");
				else if(d.getDay()==4)
					textField.setText("Thursday");
				else if(d.getDay()==5)
					textField.setText("Friday");
				else if(d.getDay()==6)
					textField.setText("Saturday");
			}
		});
		btnNewButton.setBounds(200, 235, 209, 23);
		frame1.getContentPane().add(btnNewButton);
	}
}
