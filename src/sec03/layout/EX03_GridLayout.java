package sec03.layout;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EX03_GridLayout extends JFrame{
	
	public EX03_GridLayout() {
		//# �⺻�Ӽ� ����
		this.setTitle("GridLayout");
		this.setBounds(100, 100, 300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	

		
		//@Step1. �ֻ��� �����̳� ��������
	    Container root = this.getContentPane();
	    //@Step2. ���̾ƿ� ����
	    root.setLayout(new GridLayout(4,2));
	    //@Step3. ���۳�Ʈ �߰��ϱ�
	    root.add(new JButton("Button1"));
	    root.add(new JButton("Button2"));
	    root.add(new JButton("Button3"));
	    root.add(new JButton("Button4"));
	    root.add(new JButton("Button5"));
	    root.add(new JButton("Button6"));
	    root.add(new JButton("Button7"));


	}
	
	public static void main(String[] args) {
		new EX03_GridLayout();
	}
}
