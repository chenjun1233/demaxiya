package xm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class zhu extends JFrame {

	private JPanel contentPane;

	/**
	 * 启动应用程序
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					zhu frame = new zhu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 构造框架——图书馆座位系统的zhu
	 */
	public zhu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\u67E5\u770B\u5386\u53F2\u8BB0\u5F55");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				chakanshuju frame=new chakanshuju();
				frame.setVisible(true);
			}
		});
		
		btnNewButton.setBounds(318, 0, 118, 23);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("\u5EA7\u4F4D\u7BA1\u7406");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("黑体", Font.PLAIN, 20));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(141, 0, 141, 38);
		contentPane.add(label);
		
		JButton btnNewButton_1 = new JButton("\u4E00\u697C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lou1 frame=new lou1();
				frame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(33, 176, 97, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u4E8C\u697C");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lou2 frame=new lou2();
				frame.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(165, 176, 97, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u4E09\u697C");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lou3 frame=new lou3();
				frame.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(301, 176, 97, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u767B\u8BB0");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dengji frame=new dengji();
				frame.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(318, 35, 118, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("\u67E5\u770B\u65F6\u95F4");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				shijian frame=new shijian();
				frame.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(301, 230, 97, 23);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(zhu.class.getResource("/img/cj123.jpg")));
		lblNewLabel.setBounds(0, 0, 436, 263);
		contentPane.add(lblNewLabel);
		

		
		
	}
}
