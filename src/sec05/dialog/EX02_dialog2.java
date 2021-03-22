package sec05.dialog;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

//JFileChooser and JColorChooser

public class EX02_dialog2 extends JFrame{
	public EX02_dialog2() {
		
		//@Step1. �ֻ��� �����̳� ��������
		Container root = this.getContentPane();
		//@Step2. ���̾ƿ� ����
		root.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		//@Step3. ���۳�Ʈ �߰��ϱ�
		
		//# �⺻�Ӽ� ����
		this.setTitle("JFileChooser and JColorChooser");
		this.setBounds(100, 100, 600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
		
		//JFileChooser
		//@file Open 
		JFileChooser fileChooser1 = new JFileChooser();		
		FileNameExtensionFilter filter1 = new FileNameExtensionFilter("Word ����", "txt", "hwp", "docx");	
		FileNameExtensionFilter filter2= new FileNameExtensionFilter("Image ����", "jpg", "bmp", "png", "gif");		
		//fileChooser1.setFileFilter(filter); //�ϳ��� �����ϴ� ���		
		fileChooser1.addChoosableFileFilter(filter1);
		fileChooser1.addChoosableFileFilter(filter2);
		
		int openResult = fileChooser1.showOpenDialog(root); //�θ������̳� �߾�
		switch(openResult) {
		case JFileChooser.APPROVE_OPTION: //������ ������ ���
			String path = fileChooser1.getSelectedFile().getPath();
			JOptionPane.showMessageDialog(null, "���Ͽ��� : " + path);
		case JFileChooser.CANCEL_OPTION: //���� ����� ���
			JOptionPane.showMessageDialog(null, "���Ͽ��� ���");
		}
		
		//@file Save
		JFileChooser fileChooser2 = new JFileChooser("C:\\temp");		
		int saveResult = fileChooser2.showSaveDialog(null); //ȭ�� �߾� (�θ� ������)
		
		//@dir Open
		JFileChooser fileChooser3 = new JFileChooser();		
		fileChooser3.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); //������ ����		
		int dirOpenResult = fileChooser3.showOpenDialog(null); //ȭ�� �߾� (�θ� ������)
		
		//#JColorChooser
		JColorChooser colorChooser = new JColorChooser();
		Color selectedColor = colorChooser.showDialog(root, "�÷�����", Color.RED);
		if (selectedColor == null)
			JOptionPane.showMessageDialog(null, "�÷����� ���");
		else
			JOptionPane.showMessageDialog(null, "�÷�����: "+selectedColor.toString());
	}
	
	public static void main(String[] args) {
		new EX02_dialog2();
	}
}
