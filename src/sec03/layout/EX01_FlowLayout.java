package sec03.layout;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import sec02.addcomponents.EX02_AddComponents_2;

public class EX01_FlowLayout extends JFrame{
	
	public EX01_FlowLayout() {
		//# �⺻�Ӽ� ����
		this.setTitle("FlowLayout");
		this.setBounds(100, 100, 300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
		
		//@Step1. �ֻ��� �����̳� ��������
		Container root = this.getContentPane();
		//@Step2. ���̾ƿ� ����
		root.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
		//@Step3. ���۳�Ʈ �߰��ϱ�
		root.add(new JButton("Button1"));
		root.add(new JButton("Button2"));
		root.add(new JButton("Button3"));
		root.add(new JButton("Button4"));
		root.add(new JButton("Button5"));
	}
	
	public static void main(String[] args) {
		new EX01_FlowLayout();
	}
}
