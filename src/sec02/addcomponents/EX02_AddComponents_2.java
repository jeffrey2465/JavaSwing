package sec02.addcomponents;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EX02_AddComponents_2 extends JFrame{
	
	public EX02_AddComponents_2() {
		//# �⺻�Ӽ� ����
		this.setTitle("������Ʈ �߰��ϱ� ��� #2");
		this.setBounds(100, 100, 300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
		
		//@Step1. JPanel ��ü �����ϱ� 
		JPanel panel = new JPanel();		
		//@Step2. ���̾ƿ� ����
		panel.setLayout(new FlowLayout());
		//@Step3. ���۳�Ʈ �߰��ϱ�
		panel.add(new JButton("Button1"));
		panel.add(new JButton("Button2"));
		panel.add(new JButton("Button3"));
		panel.add(new JButton("Button4"));
		panel.add(new JButton("Button5"));
		//@Step4. JPanel�� JFrame�� �����ϱ�
		this.setContentPane(panel);
	}
	
	public static void main(String[] args) {
		new EX02_AddComponents_2();
	}
}
