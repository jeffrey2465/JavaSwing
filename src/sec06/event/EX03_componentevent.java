package sec06.event;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

//JComponent and JWindowEvent

public class EX03_componentevent extends JFrame {
	public EX03_componentevent() {
		
		//@Step1. �ֻ��� �����̳� ��������
		Container root = this.getContentPane();
		//@Step2. ���̾ƿ� ����
		root.setLayout(new BorderLayout());
		//@Step3. ���۳�Ʈ �߰��ϱ�
		JLabel label = new JLabel("Hello", JLabel.HORIZONTAL);
		root.add(label);
		
		/*
		//���1. ComponentListener ��ü���� + ��� �߻�޼��� ���� + ���
		root.addComponentListener(new ComponentListener() {			
			@Override
			public void componentShown(ComponentEvent e) {
				System.out.println("ComponetShown");				
			}			
			@Override
			public void componentResized(ComponentEvent e) {
				//�������� ���� �ؽ�Ʈ ũ�� ����
				int fontSize = e.getComponent().getWidth()/10;
				label.setFont(new Font(null, Font.BOLD, fontSize));				
			}			
			@Override
			public void componentMoved(ComponentEvent e) {
				System.out.println("componentMoved");				
			}			
			@Override
			public void componentHidden(ComponentEvent e) {
				System.out.println("componentHidden");
			}
		});
		*/
		//���2. ComponentAdpater ��ü���� + �ʿ� �߻�޼��� ���� + ���
		root.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				//�������� ���� �ؽ�Ʈ ũ�� ����
				int fontSize = e.getComponent().getWidth()/10;
				label.setFont(new Font(null, Font.BOLD, fontSize));				
			}		
		});
								
		//# �⺻�Ӽ� ����
		this.setTitle("Event(ComponentEvent)");
		this.setBounds(100, 100, 200, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
	}
	
	public static void main(String[] args) {
		new EX03_componentevent();
	}
}
