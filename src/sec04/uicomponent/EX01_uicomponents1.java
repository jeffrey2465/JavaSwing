package sec04.uicomponent;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

//JButton and JLabel
public class EX01_uicomponents1 extends JFrame {
	public EX01_uicomponents1() {
		
		
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
		
		//# �⺻�Ӽ� ����
		this.setTitle("UICompoents(JButton and JLabel)");
		this.setBounds(100, 100, 450, 180);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
	}
	
	public static void main(String[] args) {
		new EX01_uicomponents1();
	}
}
