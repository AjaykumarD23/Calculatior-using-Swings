package calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstProject extends JFrame {

	private JPanel contentPane;
	private JTextField tfa;
	private JTextField tfb;
	private JTextField tfr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstProject frame = new FirstProject();
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
	public FirstProject() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("CALCULATOR");
		heading.setForeground(new Color(0, 0, 0));
		heading.setFont(new Font("Algerian", Font.BOLD, 15));
		heading.setBounds(153, 10, 98, 21);
		contentPane.add(heading);
		
		JLabel labela = new JLabel("A");
		labela.setForeground(new Color(255, 0, 0));
		labela.setFont(new Font("Times New Roman", Font.BOLD, 13));
		labela.setBounds(125, 66, 28, 16);
		contentPane.add(labela);
		
		tfa = new JTextField();
		tfa.setBounds(153, 65, 96, 19);
		contentPane.add(tfa);
		tfa.setColumns(10);
		
		JLabel labelb = new JLabel("B");
		labelb.setForeground(new Color(255, 0, 0));
		labelb.setFont(new Font("Times New Roman", Font.BOLD, 13));
		labelb.setBounds(125, 108, 45, 13);
		contentPane.add(labelb);
		
		tfb = new JTextField();
		tfb.setColumns(10);
		tfb.setBounds(155, 105, 96, 19);
		contentPane.add(tfb);
		
		JLabel labelresult = new JLabel("Result");
		labelresult.setForeground(Color.RED);
		labelresult.setFont(new Font("Times New Roman", Font.BOLD, 14));
		labelresult.setBounds(97, 144, 39, 17);
		contentPane.add(labelresult);
		
		tfr = new JTextField();
		tfr.setBounds(155, 141, 96, 19);
		contentPane.add(tfr);
		tfr.setColumns(10);
		
		JButton add = new JButton("ADD");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to add
				String data1 =tfa.getText();
				String data2 =tfb.getText();
				int var1 = Integer.valueOf(data1);
				int var2 = Integer.valueOf(data2);
				int res = var1 + var2;
				String result = String.valueOf(res);
				tfr.setText(result);
			}
		});
		add.setFont(new Font("Times New Roman", Font.BOLD, 14));
		add.setForeground(new Color(0, 64, 64));
		add.setBounds(0, 201, 87, 25);
		contentPane.add(add);
		
		JButton sub = new JButton("SUB");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//logic to sub
				String data1 =tfa.getText();
				String data2 =tfb.getText();
				int var1 = Integer.valueOf(data1);
				int var2 = Integer.valueOf(data2);
				int res = var1 - var2;
				String result = String.valueOf(res);
				tfr.setText(result);
			}
		});
		sub.setForeground(new Color(0, 64, 64));
		sub.setFont(new Font("Times New Roman", Font.BOLD, 14));
		sub.setBounds(97, 201, 82, 25);
		contentPane.add(sub);
		
		JButton mul = new JButton("MUL");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			//logic to mul
				String data1 =tfa.getText();
				String data2 =tfb.getText();
				int var1 = Integer.valueOf(data1);
				int var2 = Integer.valueOf(data2);
				int res = var1 * var2;
				String result = String.valueOf(res);
				tfr.setText(result);
				
			}
		});
		mul.setForeground(new Color(0, 64, 64));
		mul.setFont(new Font("Times New Roman", Font.BOLD, 14));
		mul.setBounds(189, 201, 87, 25);
		contentPane.add(mul);
		
		JButton btnDiv = new JButton("DIV");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//logic to div
				float var1 = Float.valueOf(tfa.getText());
				float var2 = Float.valueOf(tfb.getText());
				float res = var1 / var2;
				String result = String.valueOf(res);
				tfr.setText(result);
			}
		});
		btnDiv.setForeground(new Color(0, 64, 64));
		btnDiv.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnDiv.setBounds(286, 201, 73, 25);
		contentPane.add(btnDiv);
		
		JButton rem = new JButton("REM");
		rem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//logic to rem
				float var1 = Float.valueOf(tfa.getText());
				float var2 = Float.valueOf(tfb.getText());
				
				String result = String.valueOf(var1 % var2);
				tfr.setText(result);
			}
		});
		rem.setForeground(new Color(0, 64, 64));
		rem.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rem.setBounds(363, 201, 73, 25);
		contentPane.add(rem);
	}
}
