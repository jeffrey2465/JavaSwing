package sec01.createjframe;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Ex03_CreateJFrame_3 extends JFrame {	
	
	Ex03_CreateJFrame_3() {
		this.setTitle("JFrame �����ϱ� ���#3"); //super("JFrame �����ϱ� ���#3")
		this.setBounds(100, 100, 350, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���α׷� ����
		this.setVisible(true);	
		//this.setLocationRelativeTo(null);//ȭ�鰡� ��ġ
	}
	
	public static void main(String[] args) {		
		//#1. MyJFrame ��ü ����
		new Ex03_CreateJFrame_3();				
	}
}
 