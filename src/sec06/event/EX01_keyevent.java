package sec06.event;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EX01_keyevent extends JFrame {

	JLabel keyCodeLb;
	JLabel keyCharLb;
	JLabel keyTextLb;
		
	EX01_keyevent(){
		
		
		//@Step1. �ֻ��� �����̳� ��������
		Container root = this.getContentPane();
		//@Step2. ���̾ƿ� ����
		root.setLayout(new GridLayout(3,2));

		//@Step3. ���۳�Ʈ �߰��ϱ�
		keyCodeLb = new JLabel("-", JLabel.CENTER);
		keyCharLb = new JLabel("-", JLabel.CENTER);
		keyTextLb = new JLabel("-", JLabel.CENTER);
		root.add(new JLabel("Ű�ڵ尪(KeyCode):", JLabel.RIGHT));
		root.add(keyCodeLb);
		root.add(new JLabel("Ű�ڵ幮��(KeyChar):", JLabel.RIGHT));
		root.add(keyCharLb);
		root.add(new JLabel("Ű�ؽ�Ʈ(KeyText):", JLabel.RIGHT));
		root.add(keyTextLb);
			
		/*
		//root�� Ű���� �̺�Ʈ�� ó�� ===================================
		//PPT���� �߰��ϴ� ��
		//@���#1. KeyListener ��ü ���� + ��� �߻�޼��� ���� + ���
		root.addKeyListener(new KeyListener() {			
			@Override
			public void keyTyped(KeyEvent e) { 	
				//Ű������ Press + Release�� ���յɶ� (Ÿ�԰����� Ű)
			}			
			@Override
			public void keyReleased(KeyEvent e) {
				//Ű�� ��������
			}			
			@Override
			public void keyPressed(KeyEvent e) {
				//Ű�� ������
			}
		});
		
		//@���#2. KeyAdapter ��ü ���� + �ʿ���  �߻�޼��� ���� + ���
		root.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				//�ʿ��� �޼��常 ����
			}
		});
		//=========================================================
		*/	
		
		
		
		//KeyAdapter ��ü ���� �� �ʿ��� �߻�޼��� �������̵�
		root.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				char keyChar = e.getKeyChar();
				String keyText = e.getKeyText(keyCode);
				keyCodeLb.setText(String.valueOf(keyCode));
				keyCharLb.setText(String.valueOf(keyChar));
				keyTextLb.setText(keyText);
			}
		});
		
			
		
		//# �⺻�Ӽ� ����
		this.setTitle("KeyEvent");
		this.setBounds(100, 100, 300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		//Ű�����̺�Ʈ�� ó���ϴ� ����� �ݵ�� ��Ŀ���� �޾ƾ� ��
		root.requestFocus();
	}
	
	public static void main(String[] args) {
		new EX01_keyevent();
	}
}

