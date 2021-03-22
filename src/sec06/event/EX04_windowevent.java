package sec06.event;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//JComponent and JWindowEvent

public class EX04_windowevent extends JFrame {
	public EX04_windowevent() {
		
		//@Step1. �ֻ��� �����̳� ��������
		Container root = this.getContentPane();
		//@Step2. ���̾ƿ� ����
		root.setLayout(new BorderLayout());
		//@Step3. ���۳�Ʈ �߰��ϱ�
		
		JTextArea ta = new JTextArea();
		JScrollPane sp = new JScrollPane(ta);		
		root.add(sp);
		
		this.addWindowListener(new WindowListener() {			
			@Override
			public void windowOpened(WindowEvent e) {
				System.out.println("windowOpened"); 	
				ta.append("JFrame: windowOpened\n");
			}			
			@Override
			public void windowIconified(WindowEvent e) {
				System.out.println("windowIconified"); 	
				ta.append("JFrame: windowIconified\n");
			}			
			@Override
			public void windowDeiconified(WindowEvent e) {
				System.out.println("windowDeiconified");
				ta.append("JFrame: windowDeiconified\n");
			}			
			@Override
			public void windowDeactivated(WindowEvent e) {
				System.out.println("windowDeactivated"); 
				ta.append("JFrame: windowDeactivated\n");
			}
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("windowClosing"); 			
				ta.append("JFrame: windowClosing\n");
			}			
			@Override
			public void windowClosed(WindowEvent e) {
				System.out.println("windowClosed"); 		
				ta.append("JFrame: windowClosed\n");
			}			
			@Override
			public void windowActivated(WindowEvent e) {			
				System.out.println("windowActivated"); 
				ta.append("JFrame: windowActivated\n");
			}
		});
		
		
		JDialog dialog = new JDialog();
		dialog.setTitle("WindowEvent");
		dialog.setSize(200, 200);
		dialog.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("Dialog Closing"); //������ ���� Closing ���
				dialog.dispose();
				ta.append("JDialog: windowClosing\n");
			}			
			@Override
			public void windowClosed(WindowEvent e) {
				//�������� dispose() �޼���� ���� ��� ȣ��
				System.out.println("Dialog Closed"); 
				ta.append("JDialog: windowClosed\n");
			}			
		});		
		dialog.setVisible(true);
						
		//# �⺻�Ӽ� ����
		this.setTitle("Event(WindowEvent)");
		this.setBounds(100, 100, 300, 220);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
	}
	
	public static void main(String[] args) {
		new EX04_windowevent();
	}
}
