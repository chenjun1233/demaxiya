package xm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class lou2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * 启动应
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lou2 frame = new lou2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 创建框架——第二层楼座位的选择
	 */
	public lou2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u5EA7\u4F4D1");
		lblNewLabel.setBounds(23, 10, 58, 15);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\u9884\u5B9A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("已预定");
			}
		});
		btnNewButton.setBounds(96, 6, 97, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u9000\u5B9A");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("未预定");
			}
		});
		btnNewButton_1.setBounds(203, 6, 97, 23);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("\u672A\u9884\u5B9A");
		textField.setEditable(false);
		textField.setBounds(335, 7, 66, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("\u8FD4\u56DE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zhu frame=new zhu();
				frame.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(318, 230, 108, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("\u5EA7\u4F4D2");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 43, 58, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("\u5EA7\u4F4D3");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(10, 76, 58, 15);
		contentPane.add(label);
		
		JLabel lblNewLabel_2 = new JLabel("\u5EA7\u4F4D4");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 110, 58, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u5EA7\u4F4D5");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(10, 143, 58, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u5EA7\u4F4D6");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(10, 176, 58, 15);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u5EA7\u4F4D7");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(10, 208, 58, 15);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton_3 = new JButton("\u9884\u5B9A");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText("已预定");
			}
		});
		btnNewButton_3.setBounds(96, 39, 97, 23);
		contentPane.add(btnNewButton_3);
		
		textField_1 = new JTextField();
		textField_1.setText("\u672A\u9884\u5B9A");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setEditable(false);
		textField_1.setBounds(335, 38, 66, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("\u9000\u5B9A");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText("未预定");
			}
		});
		btnNewButton_4.setBounds(203, 39, 97, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("\u9884\u5B9A");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setText("已预定");
			}
		});
		btnNewButton_5.setBounds(96, 72, 97, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("\u9000\u5B9A");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setText("未预定");
			}
		});
		btnNewButton_6.setBounds(203, 72, 97, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("\u9884\u5B9A");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_3.setText("已预定");
			}
		});
		btnNewButton_7.setBounds(96, 106, 97, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("\u9000\u5B9A");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_3.setText("未预定");
			}
		});
		btnNewButton_8.setBounds(203, 106, 97, 23);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("\u9884\u5B9A");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_4.setText("已预定");
			}
		});
		btnNewButton_9.setBounds(96, 139, 97, 23);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("\u9000\u5B9A");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_4.setText("未预定");
			}
		});
		btnNewButton_10.setBounds(203, 139, 97, 23);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("\u9884\u5B9A");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_5.setText("已预定");
			}
		});
		btnNewButton_11.setBounds(96, 172, 97, 23);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("\u9000\u5B9A");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_5.setText("未预定");
			}
		});
		btnNewButton_12.setBounds(203, 172, 97, 23);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("\u9884\u5B9A");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_6.setText("已预定");
			}
		});
		btnNewButton_13.setBounds(96, 204, 97, 23);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("\u9000\u5B9A");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_6.setText("未预定");
			}
		});
		btnNewButton_14.setBounds(203, 205, 97, 23);
		contentPane.add(btnNewButton_14);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setText("\u672A\u9884\u5B9A");
		textField_2.setEditable(false);
		textField_2.setBounds(335, 73, 66, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setText("\u672A\u9884\u5B9A");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setEditable(false);
		textField_3.setBounds(335, 107, 66, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setText("\u672A\u9884\u5B9A");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setEditable(false);
		textField_4.setBounds(335, 140, 66, 21);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setText("\u672A\u9884\u5B9A");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setEditable(false);
		textField_5.setBounds(335, 173, 66, 21);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setText("\u672A\u9884\u5B9A");
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setEditable(false);
		textField_6.setBounds(335, 205, 66, 21);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("\u4E8C         \u697C");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("宋体", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(10, 229, 183, 25);
		contentPane.add(lblNewLabel_6);
	}

}
