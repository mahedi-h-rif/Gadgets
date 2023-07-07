import java.awt.EventQueue;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import java.awt.*;
public class notepad {

	protected static final int BOLD = 0;
	protected static final int Font = 0;
	 JFrame frmNotepad;
             String g;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					notepad window = new notepad();
					window.frmNotepad.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public notepad() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNotepad = new JFrame();
		frmNotepad.setTitle("Notepad");
		frmNotepad.setBounds(100, 100, 304, 466);
		//frmNotepad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNotepad.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		frmNotepad.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(0, 0, 0));
		frmNotepad.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNew = new JMenuItem("New");
		mntmNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText(null);
			}
		});
		mnFile.add(mntmNew);
		
		JMenuItem mntmOpen = new JMenuItem("open");
		mntmOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JFileChooser open= new JFileChooser();
			int choice = open.showOpenDialog(frmNotepad);
			if(choice == JFileChooser.APPROVE_OPTION);{
		try {
			Scanner Mahedi = new Scanner(new FileReader(open.getSelectedFile().getPath()));
			while(Mahedi.hasNext()) {
				textArea.append(Mahedi.nextLine()+"\n");
			}
		} catch (FileNotFoundException e1) {
			JOptionPane.showMessageDialog(null, e);
		}		
			}
			}
		});
		mnFile.add(mntmOpen);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser save = new JFileChooser();
				int choice = save.showSaveDialog(frmNotepad);
				if(choice== JFileChooser.APPROVE_OPTION) {
					try {
						BufferedWriter love = new BufferedWriter(new FileWriter(save.getSelectedFile().getPath()));
						love.write(textArea.getText());
						love.close();
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null, e);
					}
				}
			}
		});
		mnFile.add(mntmSave);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenuItem mntmUndo = new JMenuItem("Undo");
		mntmUndo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textArea.getText().length()>0)
				{    g=textArea.getText();
					StringBuilder str=new StringBuilder(textArea.getText());
					str.deleteCharAt(textArea.getText().length()-1);
					backSpace=str.toString();
					textArea.setText(backSpace);
				}
				
			}
		});
		mnEdit.add(mntmUndo);
		
		JMenuItem mntmRedo = new JMenuItem("Redo");
		mntmRedo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(g);
			}
		});
		mnEdit.add(mntmRedo);
		
	}
}
