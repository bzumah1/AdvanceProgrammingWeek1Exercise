package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import college.ArrayList;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JTable;

public class RegistrationForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTable table;
	private List<Object[]> dataList = (List<Object[]>) new ArrayList();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationForm frame = new RegistrationForm();
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
	public RegistrationForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 791, 300);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.light"));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Registration Form");
		lblNewLabel_1.setBounds(162, 10, 94, 13);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setForeground(UIManager.getColor("Button.focus"));
		panel.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
		panel.setBounds(58, 33, 315, 185);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Full Name");
		lblNewLabel.setBounds(10, 10, 66, 13);
		panel.add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 38, 66, 13);
		panel.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 61, 66, 13);
		panel.add(lblPassword);
		
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(10, 84, 66, 13);
		panel.add(lblGender);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setBounds(10, 112, 66, 13);
		panel.add(lblCourse);
		
		textField = new JTextField();
		textField.setBounds(80, 7, 156, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(80, 33, 156, 19);
		panel.add(textField_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBounds(79, 85, 52, 21);
		rdbtnNewRadioButton.setSelected(true);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(128, 85, 59, 21);
		panel.add(rdbtnFemale);
		
		JRadioButton rdbtnOthers = new JRadioButton("Others");
		rdbtnOthers.setBounds(193, 85, 59, 21);
		panel.add(rdbtnOthers);
		
		ButtonGroup btn = new ButtonGroup();
		btn.add(rdbtnOthers);
		btn.add(rdbtnFemale);
		btn.add(rdbtnNewRadioButton);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(80, 58, 156, 19);
		panel.add(passwordField_1);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(79, 107, 162, 18);
		comboBox.addItem("BCS");
		comboBox.addItem("BBA");
		comboBox.addItem("BHM");
		panel.add(comboBox);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBounds(10, 154, 85, 21);
		panel.add(btnNewButton);
		
		table = new JTable();
		table.setBounds(404, 44, 324, 159);
		contentPane.add(table);
		
		String[] columnNames = {"First Name", "Last Name", "Age"};
        Object[][] data = {{"John", "Doe", 30}, {"Jane", "Doe", 25}};
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        table.setModel(model);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(386, 20, 339, 205);
        contentPane.add(scrollPane);
		
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String fullName = textField.getText();
		        System.out.println("Full Name: " + fullName);
		        addData("John", "Doe", 30);
                // Update the table
                updateTable();
		    }
		});
		
	}
	public void addData(String firstName, String lastName, int age) {
        Object[] data = {firstName, lastName, age};
        dataList.add(data);
    }

    public void updateTable() {
        Object[][] dataArray = new Object[dataList.size()][];
        for (int i = 0; i < dataList.size(); i++) {
            dataArray[i] = dataList.get(i);
        }

        String[] columnNames = {"First Name", "Last Name", "Age"};
        DefaultTableModel model = new DefaultTableModel(dataArray, columnNames);
        table.setModel(model);
    }
}
