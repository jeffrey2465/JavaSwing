package sec03.layout;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EX02_BorderLayout extends JFrame{
	
	public EX02_BorderLayout() {
		//# �⺻�Ӽ� ����
		this.setTitle("BorderLayout");
		this.setBounds(100, 100, 300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
		
		//@Step1. �ֻ��� �����̳� ��������
		Container root = this.getContentPane();
		//@Step2. ���̾ƿ� ����
		root.setLayout(new BorderLayout());
		//@Step3. ���۳�Ʈ �߰��ϱ�
		root.add(new JButton("Button1"), BorderLayout.CENTER); 	//"Center"�� ��ü ����
		root.add(new JButton("Button2"), BorderLayout.NORTH);	//"North"�� ��ü ����
		root.add(new JButton("Button3"), BorderLayout.WEST);	//"West"�� ��ü ����
		root.add(new JButton("Button4"), BorderLayout.EAST);	//"East"�� ��ü ����
		
		/* PPT ���� ��
		root.add(new JButton("Button1"), BorderLayout.CENTER); 	//"Center"�� ��ü ����
		root.add(new JButton("Button2"), BorderLayout.NORTH);	//"North"�� ��ü ����
		root.add(new JButton("Button3"), BorderLayout.SOUTH);	//"South"�� ��ü ����
		root.add(new JButton("Button4"), BorderLayout.WEST);	//"West"�� ��ü ����
		root.add(new JButton("Button5"), BorderLayout.EAST);	//"East"�� ��ü ����
		*/
		/* PPT ���� ��
		root.add(new JButton("Button1"), "Center"); 	//"Center"�� ��ü ����
		root.add(new JButton("Button2"), "North");	//"North"�� ��ü ����
		root.add(new JButton("Button3"), "South");
		*/
		/* PPT ���� ��
		root.add(new JButton("Button1")); 	//"Center"�� ��ü ����
		root.add(new JButton("Button2"));	//"North"�� ��ü ����
		root.add(new JButton("Button3"));
		*/
		

	}
	
	public static void main(String[] args) {
		new EX02_BorderLayout();
	}
}
