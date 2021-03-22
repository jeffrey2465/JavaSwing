package sec04.uicomponent;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//JTextField and JTextArea
public class EX02_uicomponents2 extends JFrame {
	public EX02_uicomponents2() {
				
		//@Step1. �ֻ��� �����̳� ��������
		Container root = this.getContentPane();
		//@Step2. ���̾ƿ� ����
		root.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		//@Step3. ���۳�Ʈ �߰��ϱ�		
		//JTextField
		JTextField tf1 = new JTextField("TextField"); //�⺻�ؽ�Ʈ�ʵ�		
		JTextField tf2 = new JTextField("TextField"); //�⺻�ؽ�Ʈ�ʵ� + ���� + ���ڻ� 
		tf2.setBackground(Color.GREEN);
		tf2.setForeground(Color.RED);
		JTextField tf3 = new JTextField(10); //�⺻�ؽ�Ʈ�ʵ� + �Է� �� ���� (10) 
		JTextField tf4 = new JTextField("TextField",10); //�⺻�ؽ�Ʈ�ʵ� + �Է� �� ���� + �����Ұ�
		tf4.setEditable(false);
				
		//JTextArea		
		JTextArea ta1 = new JTextArea("TextArea"); //�⺻ TextArea
		JTextArea ta2 = new JTextArea("TextArea", 3,10); //�⺻ TextArea + ���� ũ�� + ���� ũ�� ���� (�ؽ�Ʈ�� ��� �Է��ϸ� ũ�Ⱑ �þ)		
		JTextArea ta3 = new JTextArea("TextArea", 3,10); //�⺻ TextArea + ���� ũ�� + ���� ũ�� ���� + ũ�� ���� (�ؽ�Ʈ�� ��� �Է��ϸ� ȭ���� ���)
		ta3.setPreferredSize(new Dimension(3,10));		
		JTextArea ta4 = new JTextArea("TextArea", 3,10); //�⺻ TextArea + ���� ũ�� + ���� ũ�� ���� + ��ũ�ѱ�� ���� (�ؽ�Ʈ�� ��� �Է��ϸ� ��ũ�Ѹ� ����)				
		JScrollPane sp = new JScrollPane(ta4,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		root.add(tf1);
		root.add(tf2);
		root.add(tf3);
		root.add(tf4);
		root.add(ta1);
		root.add(ta2);
		root.add(ta3);
		root.add(sp);
		
		//# �⺻�Ӽ� ����
		this.setTitle("UICompoents(JTextField and JTextArea)");
		this.setBounds(100, 100, 480, 180);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
	}
	
	public static void main(String[] args) {
		new EX02_uicomponents2();
	}
}
