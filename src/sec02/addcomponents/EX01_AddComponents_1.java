package sec02.addcomponents;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EX01_AddComponents_1 extends JFrame{
	
	public EX01_AddComponents_1() {
		//# �⺻�Ӽ� ����
		this.setTitle("������Ʈ �߰� ��� #1");
		this.setBounds(100, 100, 320, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
		
		//@Step1. ���̾ƿ� ����
		this.setLayout(new FlowLayout());
		//@Step3. ���۳�Ʈ �߰��ϱ�
		this.add(new JButton("Button1"));
		this.add(new JButton("Button2"));
		this.add(new JButton("Button3"));
		this.add(new JButton("Button4"));
		this.add(new JButton("Button5"));
	}
	
	public static void main(String[] args) {
		new EX01_AddComponents_1();
	}
}
