package sec01.createjframe;

import javax.swing.JFrame;


public class Ex01_CreateJFrame_1 extends JFrame {
	
	public static void main(String[] args) {
		
		//#1. JFrame ��ü ����
		JFrame jf = new JFrame();
		
		//#2. JFrame ���� (Ÿ��Ʋ, ũ��, x ��ư ����, ���̱� ����)
		jf.setTitle("JFrame �����ϱ� ���#1");
		jf.setBounds(100, 100, 350, 200);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���α׷� ����
		jf.setVisible(true);
		//jf.setLocationRelativeTo(null);//ȭ�鰡� ��ġ
						
		/* ���� ���� ������ ���� ���� 		
		//#3. JFrame ��ü ����
		JFrame jf2 = new JFrame();
		
		//#4. JFrame ���� (Ÿ��Ʋ, ũ��, x ��ư ����, ���̱� ����)
		jf2.setTitle("JFrame �����ϱ� ���#1");
		jf2.setBounds(100, 100, 350, 200);
		jf2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //�ڽ��� �����Ӹ� ����
		jf2.setVisible(true);
		*/
						
	}

}
