package sec06.event;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

//JButton and JLabel
public class EX05_uicomp1_withevent extends JFrame {
	public EX05_uicomp1_withevent() {
		
		
		//@Step1. �ֻ��� �����̳� ��������
		Container root = this.getContentPane();
		//@Step2. ���̾ƿ� ����
		root.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		//@Step3. ���۳�Ʈ �߰��ϱ�		
		//Button
		JButton btn1 = new JButton("Button"); //�⺻��ư		
		JButton btn2 = new JButton("Button"); //�⺻��ư + ���� + ���ڻ�
		btn2.setBackground(Color.GREEN);
		btn2.setForeground(Color.RED);		
		ImageIcon imageIcon = new ImageIcon("images/icon1.png"); //�⺻��ư + �̹��������� 
		JButton btn3 = new JButton("Button",imageIcon);		
		JButton btn4 = new JButton(imageIcon); //�̹�����ư
		
		//Label		
		JLabel label1 = new JLabel("Label"); //�⺻���̺�		
		JLabel label2 = new JLabel("Label"); //�⺻���̺� + ����(��������) + ���ڻ�
		label2.setBackground(Color.YELLOW);
		label2.setOpaque(true);
		label2.setForeground(Color.BLUE);		
		JLabel label3 = new JLabel("Label", JLabel.RIGHT); //�⺻���̺� + ũ�⺯�� + �������� + ��Ʈ + �׵θ��׸���
		label3.setBorder(new LineBorder(Color.RED, 1));
		label3.setPreferredSize(new Dimension(100, 20));
		label3.setFont(new Font("Consolas", Font.BOLD, 20));
		JLabel label4 = new JLabel(imageIcon); //�̹������̺�
		
		root.add(btn1);
		root.add(btn2);
		root.add(btn3);
		root.add(btn4);
		root.add(label1);
		root.add(label2);
		root.add(label3);
		root.add(label4);
		
		
		//event ó�� ��� #1. (�͸��̳�Ŭ����)=======================
		//�̺�Ʈ @1.ù��° ��ư�� ������ ù��° Label�� �ؽ�Ʈ�� ABCDE�� ����
		//�̺�Ʈ @2.�ι�° ��ư�� ������ �ι�° Label ���� ����
		/*
		btn1.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				label1.setText("ABCDE");				
			}
		});
		//
		btn2.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				label2.setBackground(Color.RED);				
			}
		});
		*/
		
		//event ó�� ��� #2. (������ Ŭ���� ����)=======================
		//�̺�Ʈ @1.ù��° ��ư�� ������ ù��° Label�� �ؽ�Ʈ�� ABCDE�� ����
		//�̺�Ʈ @2.�ι�° ��ư�� ������ �ι�° Label ���� ����
		class MyBtnHandler implements ActionListener{ //�����̳ʰ� �ƴ� ����̳ʷ� �����Ϸ��� btn, label�� ��� ����� ����

			@Override
			public void actionPerformed(ActionEvent e) {
				//e.getActionCommand().equals("Button") �� ���� ��ư���� �ٸ� ��� �̷��Ե� ����
				if(e.getSource()==btn1) {
					label1.setText("ABCDE");
				} 
				else if (e.getSource()== btn2) {
					label2.setBackground(Color.RED);
				}
			}
		}
		btn1.addActionListener(new MyBtnHandler());
		btn2.addActionListener(new MyBtnHandler());
		//========================================================
		
				
		//# �⺻�Ӽ� ����
		this.setTitle("UICompoents(JButton and JLabel)");
		this.setBounds(100, 100, 450, 180);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
	}
	
	
	
	public static void main(String[] args) {
		new EX05_uicomp1_withevent();
	}
}
