package sec04.uicomponent;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

//JCheckBox and JRadioButton
public class EX03_uicomponents3 extends JFrame {
	public EX03_uicomponents3() {
				
		//@Step1. �ֻ��� �����̳� ��������
		Container root = this.getContentPane();
		//@Step2. ���̾ƿ� ����
		root.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		//@Step3. ���۳�Ʈ �߰��ϱ�
		
		//JCheckBox
		JCheckBox cb1 = new JCheckBox("CheckBox1"); //�⺻ CheckBox 
		JCheckBox cb2 = new JCheckBox("CheckBox2", true); //�⺻ CheckBox + �ʱ⼱�� 
				
		ImageIcon imageIcon1 = new ImageIcon("images/icon1.png");			
		JCheckBox cb3 = new JCheckBox("CheckBox3",imageIcon1); //�⺻ CheckBox + �̹��� ������ (����Ȯ�� �Ұ���)
		JCheckBox cb4 = new JCheckBox("CheckBox4",imageIcon1);
							
		JCheckBox cb5 = new JCheckBox(imageIcon1); //�⺻ CheckBox + �̹��������ܸ� ���� + BorderPaint�� ����Ȯ��
		JCheckBox cb6 = new JCheckBox(imageIcon1);		
		cb5.setBorderPainted(true);
		cb6.setBorderPainted(true);
			
		//JRadioButton (ButtonGroup()�� ������ Containeró�� �������� ����� Container�� �ƴ�
		ButtonGroup bg1 = new ButtonGroup(); //�׷쿡 �ΰ��� �⺻ ���� ��ư �߰�
		JRadioButton rb1 = new JRadioButton("RadioBtn1");
		JRadioButton rb2 = new JRadioButton("RadioBtn2", true);
		bg1.add(rb1);
		bg1.add(rb2);
		
		ImageIcon imageIcon2 = new ImageIcon("images/icon2.png");		
		ButtonGroup bg2 = new ButtonGroup(); //�׷쿡 �ΰ��� �⺻ ���� ��ư �߰� + (�ؽ�Ʈ+�̹���������) ���� (����Ȯ�� �Ұ���)
		JRadioButton rb3 = new JRadioButton("RadioBtn3", imageIcon2);
		JRadioButton rb4 = new JRadioButton("RadioBtn4", imageIcon2);
		bg2.add(rb3);
		bg2.add(rb4);
		
		ButtonGroup bg3 = new ButtonGroup(); //�׷쿡 �ΰ��� �⺻ ���� ��ư �߰� + (�̹���������) ���� + BorderPaint�� ����Ȯ��
		JRadioButton rb5 = new JRadioButton(imageIcon2);
		JRadioButton rb6 = new JRadioButton(imageIcon2, true);
		bg3.add(rb5);
		bg3.add(rb6);
		rb5.setBorderPainted(true);
		rb6.setBorderPainted(true);
				
		root.add(cb1);
		root.add(cb2);
		root.add(cb3);
		root.add(cb4);
		root.add(cb5);
		root.add(cb6);
		
		root.add(rb1);
		root.add(rb2);
		root.add(rb3);
		root.add(rb4);
		root.add(rb5);
		root.add(rb6);
	
		
		//# �⺻�Ӽ� ����
		this.setTitle("UICompoents(JCheckBox and JRadioButton)");
		this.setBounds(100, 100, 650, 180);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
	}
	
	public static void main(String[] args) {
		new EX03_uicomponents3();
	}
}
