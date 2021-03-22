package sec03.layout;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EX04_CardLayout extends JFrame{
	
	public EX04_CardLayout() {
		//# �⺻�Ӽ� ����
		this.setTitle("CardLayout");
		this.setBounds(100, 100, 300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
		
		//@Step1. �ֻ��� �����̳� ��������
	    Container root = this.getContentPane();
	    //@Step2. ���̾ƿ� ��ü ���� �� ����
	    CardLayout cardLayout = new CardLayout();
	    root.setLayout(cardLayout);	    	    
	    //@Step3. ���۳�Ʈ �߰��ϱ�
	    JButton btn1=new JButton("Button1"); //btn1.setBackground(Color.RED);
	    JButton btn2=new JButton("Button2"); //btn2.setBackground(Color.GREEN);
	    JButton btn3=new JButton("Button3"); //btn3.setBackground(Color.YELLOW);
	    JButton btn4=new JButton("Button4"); //btn4.setBackground(Color.WHITE);
	    	    
	    root.add("btn1",btn1);
	    root.add("btn2",btn2);
	    root.add("btn3",btn3);
	    root.add("btn4",btn4);
	    
	    //Ư����ġ�� ī�� ��ġ�� �̵� 
	    cardLayout.show(root, "btn3"); //Button3
	    //������ �̵�
	    cardLayout.previous(root); //Button2
	    //�ڷ� �̵�	    
	    cardLayout.next(root); //Button3
	    //������ ��ġ�� �̵�
	    cardLayout.last(root); //Button4
	    //ó����ġ�� �̵�
	    cardLayout.first(root); //Button1
	    	    
	}
	
	public static void main(String[] args) {
		new EX04_CardLayout();
	}
}
