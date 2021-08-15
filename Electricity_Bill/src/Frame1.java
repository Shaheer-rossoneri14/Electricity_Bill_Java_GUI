import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Frame1 {

	private JFrame frame;
	private JTextField txtName;
	private JTextField txtAddress;
	private JTextField txtMotorId;
	private JTextField txtUnit;
	private JTextField txtRateunit;
	private JButton btnCalculate;
	private JTextField textFieldAns;
	private JLabel lblName;
	private JLabel lblRate;
	private JLabel lblRateunit;
	private JLabel lblAddress;
	private JLabel lblMotorId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 640, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtName = new JTextField();
		txtName.setBounds(117, 20, 144, 28);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(398, 32, 203, 44);
		frame.getContentPane().add(txtAddress);
		txtAddress.setColumns(10);
		
		txtMotorId = new JTextField();
		txtMotorId.setBounds(398, 88, 203, 52);
		frame.getContentPane().add(txtMotorId);
		txtMotorId.setColumns(10);
		
		txtUnit = new JTextField();
		txtUnit.setBounds(117, 60, 144, 28);
		frame.getContentPane().add(txtUnit);
		txtUnit.setColumns(10);
		
		txtRateunit = new JTextField();
		txtRateunit.setBounds(117, 100, 144, 28);
		frame.getContentPane().add(txtRateunit);
		txtRateunit.setColumns(10);
		
		btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float unit, rate, bill;
				try {
					unit=Float.parseFloat(txtUnit.getText());
					rate=Float.parseFloat(txtRateunit.getText());
					bill= rate*unit;
					textFieldAns.setText(Float.toString(bill));
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter a Valid number");
				}
			}
		});
		btnCalculate.setBounds(235, 198, 170, 52);
		frame.getContentPane().add(btnCalculate);
		
		JLabel lblBill = new JLabel("Bill:");
		lblBill.setFont(new Font("Serif", Font.BOLD, 15));
		lblBill.setBounds(159, 301, 56, 44);
		frame.getContentPane().add(lblBill);
		
		
		textFieldAns = new JTextField();
		textFieldAns.setBounds(214, 299, 229, 52);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		lblName = new JLabel("Name:");
		lblName.setBounds(12, 26, 108, 15);
		frame.getContentPane().add(lblName);
		
		lblRate = new JLabel("Unit:");
		lblRate.setBounds(12, 66, 70, 15);
		frame.getContentPane().add(lblRate);
		
		lblRateunit = new JLabel("Rate/Unit:");
		lblRateunit.setBounds(12, 106, 87, 15);
		frame.getContentPane().add(lblRateunit);
		
		lblAddress = new JLabel("Address:");
		lblAddress.setBounds(323, 46, 70, 15);
		frame.getContentPane().add(lblAddress);
		
		lblMotorId = new JLabel("Motor ID:");
		lblMotorId.setBounds(323, 106, 70, 15);
		frame.getContentPane().add(lblMotorId);
		
	}
}
