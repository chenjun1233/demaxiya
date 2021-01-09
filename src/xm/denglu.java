package xm;

import java.awt.Font;
/**
 * 登记页面
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class denglu extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * 启动应用程序。
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					denglu frame = new denglu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 创建框架——登录界面cj
	 */
	public denglu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(denglu.class.getResource("/img/j19.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\u767B\u5F55");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		
		btnNewButton.setBounds(31, 180, 112, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\u7528\u6237\u540D");
		lblNewLabel.setBounds(31, 67, 58, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u5BC6\u7801");
		lblNewLabel_1.setBounds(31, 114, 58, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u767B\u5F55\u7CFB\u7EDF");
		lblNewLabel_2.setBounds(177, 10, 127, 15);
		contentPane.add(lblNewLabel_2);
		
		textField  = new JTextField();
		textField.setBounds(99, 64, 127, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(99, 111, 127, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(denglu.class.getResource("/img/bg1.jpg")));
		lblNewLabel_3.setBounds(0, 0, 436, 263);
		contentPane.add(lblNewLabel_3);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				    String tname=textField.getText();
					String tpass=textField_1.getText();
					mm log=new mm(tname,tpass);
					if(log.validate()) {
						 zhu frame=new zhu();
						frame.setVisible(true);
						
						lblNewLabel_2.setText("登录成功");
						
					}
					else {
						lblNewLabel_2.setText("登录失败");
					}
			}
		});
	}
}
