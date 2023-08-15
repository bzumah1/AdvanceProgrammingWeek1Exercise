package jframe;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Choice;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JPasswordField;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Signupform extends JFrame {

	private JPanel contentPane;
	private JTextField tffname;
	private JTextField tflname;
	private JTextField tfuser;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JRadioButton rbfemale;
	private JRadioButton rbother;
	private JLabel lblNewLabel_3;
	private JTextField tfphone;
	private JPasswordField pw;
	private JPasswordField cpf;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signupform frame = new Signupform();
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
	public Signupform() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 726, 473);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 271, 473);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel_8 = new JLabel("New label");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/logo.jpg"));
		lblNewLabel_8.setIcon(img);
		lblNewLabel_8.setBounds(46, 40, 174, 182);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_10 = new JLabel("WELCOME");
		lblNewLabel_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_10.setFont(new Font("Gabriola", Font.BOLD, 31));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setBounds(10, 245, 251, 57);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_10_1 = new JLabel("to");
		lblNewLabel_10_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10_1.setForeground(Color.WHITE);
		lblNewLabel_10_1.setFont(new Font("Gabriola", Font.BOLD, 31));
		lblNewLabel_10_1.setBounds(10, 287, 251, 57);
		panel.add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_10_2 = new JLabel("the IIMS");
		lblNewLabel_10_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10_2.setForeground(Color.WHITE);
		lblNewLabel_10_2.setFont(new Font("Gabriola", Font.BOLD, 31));
		lblNewLabel_10_2.setBounds(10, 324, 251, 57);
		panel.add(lblNewLabel_10_2);
		
		JLabel lblNewLabel_10_3 = new JLabel("FAMILY!!");
		lblNewLabel_10_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10_3.setForeground(Color.WHITE);
		lblNewLabel_10_3.setFont(new Font("Gabriola", Font.BOLD, 31));
		lblNewLabel_10_3.setBounds(53, 355, 167, 57);
		panel.add(lblNewLabel_10_3);
		
		JLabel lblNewLabel = new JLabel("Create your account!");
		lblNewLabel.setFont(new Font("Bradley Hand ITC", Font.BOLD, 32));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(277, 46, 408, 63);
		contentPane.add(lblNewLabel);
		
		tffname = new JTextField();
		tffname.setBorder(UIManager.getBorder("EditorPane.border"));
		tffname.setBounds(492, 120, 160, 25);
		contentPane.add(tffname);
		tffname.setColumns(10);
		
		tflname = new JTextField();
		tflname.setBorder(UIManager.getBorder("EditorPane.border"));
		tflname.setColumns(10);
		tflname.setBounds(492, 154, 160, 25);
		contentPane.add(tflname);
		
		tfuser = new JTextField();
		tfuser.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		tfuser.setColumns(10);
		tfuser.setBounds(419, 190, 233, 25);
		contentPane.add(tfuser);
		
		JLabel lblNewLabel_1 = new JLabel("First Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1.setBounds(393, 120, 89, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name:");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1_1.setBounds(393, 154, 89, 25);
		contentPane.add(lblNewLabel_1_1);
		
		lblNewLabel_2 = new JLabel("Username:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2.setBounds(294, 190, 115, 25);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_4 = new JLabel("Password:");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_4.setBounds(294, 227, 115, 25);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Confirm Password:");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_5.setBounds(294, 263, 115, 25);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Gender:");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(294, 295, 115, 25);
		contentPane.add(lblNewLabel_6);
		
		JRadioButton rbmale = new JRadioButton("Male");
		rbmale.setForeground(new Color(255, 255, 255));
		rbmale.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbmale.setBackground(new Color(0, 102, 102));
		rbmale.setBounds(417, 298, 67, 23);
		contentPane.add(rbmale);
		
		rbfemale = new JRadioButton("Female");
		rbfemale.setForeground(new Color(255, 255, 255));
		rbfemale.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbfemale.setBackground(new Color(0, 102, 102));
		rbfemale.setBounds(487, 298, 80, 23);
		contentPane.add(rbfemale);
		
		rbother = new JRadioButton("Other");
		rbother.setForeground(new Color(255, 255, 255));
		rbother.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbother.setBackground(new Color(0, 102, 102));
		rbother.setBounds(572, 300, 80, 23);
		contentPane.add(rbother);
		
		ButtonGroup b = new ButtonGroup();
		b.add(rbmale);
		b.add(rbfemale);
		b.add(rbother);
		
		lblNewLabel_3 = new JLabel("Phone number:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(294, 323, 115, 25);
		contentPane.add(lblNewLabel_3);
		
		Choice choice = new Choice();
		choice.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		choice.setBounds(419, 327, 97, 20);
		contentPane.add(choice);
		choice.add("Nepal(+977)");
		choice.add("USA(+1)");
		choice.add("India(+91)");
		choice.add("Canada(+1)");
		choice.add("UK(+44)");
		choice.add("Other....");
		
		
		tfphone = new JTextField();
		tfphone.setBorder(UIManager.getBorder("EditorPane.border"));
		tfphone.setColumns(10);
		tfphone.setBounds(522, 327, 130, 21);
		contentPane.add(tfphone);
		
		JButton btnSignup = new JButton("Sign Up");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Thank you for creating an account:-)",null, 0, null);
			}
		});
		btnSignup.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSignup.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		btnSignup.setForeground(new Color(255, 255, 255));
		btnSignup.setBackground(new Color(192, 192, 192));
		btnSignup.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnSignup.setBounds(320, 390, 168, 39);
		contentPane.add(btnSignup);
		
		JButton btnReset = new JButton("Reset\r\n");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tffname.setText(null);
				tflname.setText(null);
				tfuser.setText(null);
				pw.setText(null);
				cpf.setText(null);
				tfphone.setText(null);
			}
		});
		btnReset.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnReset.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		btnReset.setForeground(new Color(255, 255, 255));
		btnReset.setBackground(new Color(192, 192, 192));
		btnReset.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnReset.setBounds(512, 390, 168, 39);
		contentPane.add(btnReset);
		
		pw = new JPasswordField();
		pw.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		pw.setBounds(419, 226, 233, 27);
		contentPane.add(pw);
		
		cpf = new JPasswordField();
		cpf.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		cpf.setBounds(419, 264, 233, 27);
		contentPane.add(cpf);
		
		JLabel lblNewLabel_7 = new JLabel("X");
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		lblNewLabel_7.setForeground(new Color(220, 20, 60));
		lblNewLabel_7.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(680, 0, 46, 39);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_9 = new JLabel("");
		ImageIcon Img = new ImageIcon(this.getClass().getResource("/Profile.jpg"));
		lblNewLabel_9.setIcon(Img);
		lblNewLabel_9.setBounds(356, 125, 48, 48);
		contentPane.add(lblNewLabel_9);
	
		setUndecorated(true);
	
	}
}
