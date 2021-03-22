package sec06.event;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EX02_mouseevent extends JFrame {

	JLabel mouseEventLb;
	JLabel mousePositionLb;
		
	EX02_mouseevent(){
		
		//@Step1. �ֻ��� �����̳� ��������
		Container root = this.getContentPane();
		//@Step2. ���̾ƿ� ����
		root.setLayout(new BorderLayout());

		//@Step3. ���۳�Ʈ �߰��ϱ�
		mouseEventLb = new JLabel("-", JLabel.CENTER);
		mousePositionLb = new JLabel("-", JLabel.CENTER);
		root.add(mouseEventLb, BorderLayout.CENTER);
		root.add(mousePositionLb, BorderLayout.SOUTH);	
				
		/*
		//PPT���� �߰��ϴ� ��
		//root�� ���콺 �̺�Ʈ�� ó�� ===================================		
		//@���#1. MouseListener ��ü ���� + ��� �߻�޼��� ���� + ���
		root.addMouseListener(new MouseListener() {			
			@Override
			public void mouseReleased(MouseEvent e) {				
				//���콺 ��ư�� ����������
			}			
			@Override
			public void mousePressed(MouseEvent e) {				
				//���콺 ��ư�� ��������
			}			
			@Override
			public void mouseExited(MouseEvent e) {				
				//���콺�� â�� �������
			}			
			@Override
			public void mouseEntered(MouseEvent e) {				
				//���콺�� â������ ��������
			}			
			@Override
			public void mouseClicked(MouseEvent e) { //Press�� Release�� ���� �ڸ�				
				//���콺�� Ŭ���Ǿ�����				
			}
		});
		//@���#2. MouseAdapter ��ü ���� + �ʿ���  �߻�޼��� ���� + ���
		root.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {			
				//�ʿ��� �޼��常 ����
			}			
		});
		*/
		
		//@ MouseAdapter ��ü ���� + �ʿ���  �߻�޼��� ���� + ���
		root.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {			
				int x = e.getX();
				int y = e.getY();				
				mouseEventLb.setText("mouse Pressed");
				mousePositionLb.setText("Mouse Pressed At ("+x+", "+y+")");
			}			
		});
		//=========================================================

		/*
		//PPT���� �߰��ϴ� ��
		//���콺 ������ �̺�Ʈ ó��
		//���#1. MouseMotionListener ��ü ���� + ��� �߻�޼��� ���� + ���
		root.addMouseMotionListener(new MouseMotionListener() {			
			@Override
			public void mouseMoved(MouseEvent e) {
				//���콺�� �����϶�
			}			
			@Override
			public void mouseDragged(MouseEvent e) {
				//���콺�� �巹���� ��				
			}
		});

		//���#2. MouseMotionAdapter ��ü ����  + �ʿ���  �߻�޼��� ���� + ���
		root.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				//�ʿ��� �޼��常 ����		
			}
		});
		*/
		// MouseMotionAdapter ��ü ����  + �ʿ���  �߻�޼��� ���� + ���
		root.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				mouseEventLb.setText("Mouse Move");
				mousePositionLb.setText("Mouse Moved At ("+x+", "+y+")");			
			}
		});
		
		// MouseMotionAdapter ��ü ����  + �ʿ���  �߻�޼��� ���� + ���
		root.addMouseWheelListener(new MouseWheelListener() {
			
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				mouseEventLb.setText("Mouse Wheel Move");
				if(e.getWheelRotation()>0) //���:wheel down, ����:wheel up
					mousePositionLb.setText("Mouse Wheel : Down");
				else
					mousePositionLb.setText("Mouse Wheel : Up");
			}
		});
		
		//# �⺻�Ӽ� ����
		this.setTitle("MouseEvent");
		this.setBounds(100, 100, 300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new EX02_mouseevent();
	}
}

