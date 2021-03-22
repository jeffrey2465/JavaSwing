package sec05.dialog;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

//Custom Dialog (modal�� modalless)

class ModalDialog extends JDialog {
	public ModalDialog(JFrame frame, String title) {
		super(frame, title, true);
		this.setTitle("Custom Dialog");
		this.setLayout(new BorderLayout());
		this.setSize(200, 150);
		add(new JLabel("Custom Dialog", JLabel.CENTER));
		add(new JButton("Ȯ��"),"South");		
	}
}
class ModallessDialog extends JDialog {
	public ModallessDialog(JFrame frame, String title) {
		super(frame, title); 
		this.setTitle("Custom Dialog");
		this.setLayout(new BorderLayout());
		this.setSize(200, 150);
		add(new JLabel("Custom Dialog", JLabel.CENTER));
		add(new JButton("Ȯ��"),"South");		
	}
}

public class EX03_dialog3 extends JFrame{
	public EX03_dialog3() {
		
		//@Step1. �ֻ��� �����̳� ��������
		Container root = this.getContentPane();
		//@Step2. ���̾ƿ� ����
		root.setLayout(new BorderLayout());
		//@Step3. ���۳�Ʈ �߰��ϱ�

		//# �⺻�Ӽ� ����
		this.setTitle("JOptionPane InputDialog, ConfirmDialog, MessageDialog");
		this.setBounds(100, 100, 300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
		
		//Custom Dialog
		//modal
		ModalDialog modalDialog = new ModalDialog(null, "��� Custom Dialog");
		modalDialog.setLocationRelativeTo(root); //null�̸� ȭ�� �߾�
		modalDialog.setVisible(true);
		
		//modalless
		ModallessDialog modallessDialog = new ModallessDialog(null, "��޸��� Custom Dialog");
		modallessDialog.setLocationRelativeTo(root); //null�̸� ȭ�� �߾�
		modallessDialog.setVisible(true);
				
	}
	
	public static void main(String[] args) {
		new EX03_dialog3();
	}
}
