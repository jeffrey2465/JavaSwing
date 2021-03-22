package sec05.dialog;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

//JOptionPane InputDialog, ConfirmDialog, MessageDialog

public class EX01_dialog1 extends JFrame{
	public EX01_dialog1() {
		
		//@Step1. �ֻ��� �����̳� ��������
		Container root = this.getContentPane();
		//@Step2. ���̾ƿ� ����
		root.setLayout(new BorderLayout());
		//@Step3. ���۳�Ʈ �߰��ϱ�
		JLabel label = new JLabel("�Է°�");
		label.setFont(new Font("�ü�",Font.BOLD, 30));
		label.setHorizontalAlignment(JLabel.CENTER);
		root.add(label);
		//# �⺻�Ӽ� ����
		this.setTitle("JOptionPane InputDialog, ConfirmDialog, MessageDialog");
		this.setBounds(100, 100, 300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
		
		//JOptionPane
		//@InputDialog
		String inputStr = JOptionPane.showInputDialog("�ؽ�Ʈ�� �Է��ϼ���");
		label.setText(inputStr);
		//@ConfirmDialog
		int confirmResult = JOptionPane.showConfirmDialog(null, "�����Ͻðڽ��ϱ�", "����Ȯ��", JOptionPane.YES_NO_OPTION);
		switch(confirmResult) {
		case JOptionPane.YES_OPTION:
			label.setText("YES�� ����"); break;
		case JOptionPane.NO_OPTION:
			label.setText("No�� ����"); break;
		case JOptionPane.CLOSED_OPTION:
			label.setText("â ����"); break;
		}		
		//@MessageDialog
		JOptionPane.showMessageDialog(null, "���޼���", "�޼���â", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "�����޼���", "�޼���â", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, "�Ϲݸ޼���", "�޼���â", JOptionPane.PLAIN_MESSAGE);

	}
	
	public static void main(String[] args) {
		new EX01_dialog1();
	}
}
