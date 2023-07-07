import java.util.Calendar;
import java.util.Formatter;
import java.time.Year;  
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JSeparator;
import javax.swing.JProgressBar;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JScrollBar;
import javax.swing.JPasswordField;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.Canvas;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JMonthChooser;
import com.toedter.components.JLocaleChooser;
import com.toedter.components.JSpinField;
import com.toedter.calendar.JYearChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;

public class calender {

	 JFrame frame2;
	 private JTextField textField;
	 private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calender window = new calender();
					window.frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calender() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame2 = new JFrame();
		frame2.setBounds(100, 100, 540, 360);
		//frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
		
		JDayChooser dayChooser = new JDayChooser();
		dayChooser.setBackground(Color.PINK);
		dayChooser.setBounds(0, 22, 524, 300);
		frame2.getContentPane().add(dayChooser);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(120, 0, 404, 20);
		frame2.getContentPane().add(textField);
		textField.setColumns(10);
		Formatter fmt = new Formatter();
	      Calendar cal = Calendar.getInstance();
	     fmt = new Formatter();
	      fmt.format("%tB ", cal);
	      //System.out.println(fmt);
		textField.setText(""+fmt);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(0, 0, 120, 20);
		frame2.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		//Year y =Year.now();
		textField_1.setText(""+Year.now());
	}
}
