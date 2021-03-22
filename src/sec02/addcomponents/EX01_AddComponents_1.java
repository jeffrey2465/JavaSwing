package sec02.addcomponents;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EX01_AddComponents_1 extends JFrame{
	
	public EX01_AddComponents_1() {
		//# �⺻�Ӽ� ����
		this.setTitle("������Ʈ �߰��ϱ� ��� #1");
		this.setBounds(100, 100, 300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
		
		//@Step1. �ֻ��� �����̳� ��������
		Container root = this.getContentPane();
		//@Step2. ���̾ƿ� ����
		root.setLayout(new FlowLayout());
		//@Step3. ���۳�Ʈ �߰��ϱ�
		root.add(new JButton("Button1"));
		root.add(new JButton("Button2"));
		root.add(new JButton("Button3"));
		root.add(new JButton("Button4"));
		root.add(new JButton("Button5"));
	}
	
	public static void main(String[] args) {
		new EX01_AddComponents_1();
	}
}