package sec06.event;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import javafx.scene.control.CheckBox;

//JCheckBox and JRadioButton

public class EX06_uicomp3_withevent extends JFrame {
	public EX06_uicomp3_withevent() {
				
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
		
		//event ó��. (�͸��̳�Ŭ����)=======================		
		//�̺�Ʈ @1.cb1�� ���õǸ� cb3���ڻ� ���������� ���� / ������ �Ǹ� �ٽ� ������
		//�̺�Ʈ @2.cb2�� ���õǸ� cb4���ڻ� ���������� ���� / ������ �Ǹ� �ٽ� ������
//		cb1.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("...");
//				JCheckBox cb = (JCheckBox)e.getSource();
//				if(cb.isSelected()) {	
//					cb3.setForeground(Color.RED);					
//				}
//				
//				
//			}
//		});
//		
		//event ó��. ==================================		
		//�̺�Ʈ @1.ù��° cb1�� ���õǸ� cb3�� ������ �����ϸ� �ٽ� ���������� ����
		//		   �ι�° cb2�� ���õǸ� cb4�� ������ �����Ǹ� �ٽ� ���������� ����		
		cb4.setForeground(Color.RED);//�ʱⰪ�� �����̱� ������
		class MyCheckBoxHandler implements ActionListener{ //Check �ڽ���ItemListener�ε� ������ ���		
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("...");
				JCheckBox cb = (JCheckBox)e.getSource();
				if(cb==cb1) {
					if(cb.isSelected())
						cb3.setForeground(Color.RED);
					else
						cb3.setForeground(Color.BLACK);
				}
				else {
					if(cb.isSelected())
						cb4.setForeground(Color.RED);
					else
						cb4.setForeground(Color.BLACK);
				}
			}			
		}
		cb1.addActionListener(new MyCheckBoxHandler());
		cb2.addActionListener(new MyCheckBoxHandler());
		
		//�̺�Ʈ @2.ù��° rb1�� ���õǸ� rb3�� rb4�� disable
		//		   �ι�° rb2�� ���õǸ� rb3�� rb4�� enable		
		class MyRadioBtnHandler implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (e.getSource() == rb1) { // RadioButton�� Ŭ���� ���ø� �����ϱ� ������ isSelected �˻� ���ʿ�
					rb3.setEnabled(false);
					rb4.setEnabled(false);
				} else {
					rb3.setEnabled(true);
					rb4.setEnabled(true);
				}
			}
		}	
		rb1.addActionListener(new MyRadioBtnHandler());
		rb2.addActionListener(new MyRadioBtnHandler());
			
		
		
		//# �⺻�Ӽ� ����
		this.setTitle("UICompoents(JCheckBox and JRadioButton)");
		this.setBounds(100, 100, 650, 180);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
	}
	
	public static void main(String[] args) {
		new EX06_uicomp3_withevent();
	}
}
