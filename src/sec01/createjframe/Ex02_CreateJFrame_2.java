package sec01.createjframe;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.border.LineBorder;

class MyFrame extends JFrame {
	public MyFrame() {
		this.setTitle("JFrame �����ϱ� ���#2"); //super("JFrame �����ϱ� ���#2")
		this.setBounds(100, 100, 350, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���α׷� ����
		this.setVisible(true);		
		//this.setLocationRelativeTo(null);//ȭ�鰡� ��ġ
	}
}

public class Ex02_CreateJFrame_2 {	
	public static void main(String[] args) {		
		//#1. MyJFrame ��ü ����
		new MyFrame();				
	}
}
