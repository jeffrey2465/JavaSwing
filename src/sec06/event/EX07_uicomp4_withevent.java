package sec06.event;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

//JSlider and JProgressBar

public class EX07_uicomp4_withevent extends JFrame {
	public EX07_uicomp4_withevent() {
				
		//@Step1. �ֻ��� �����̳� ��������
		Container root = this.getContentPane();
		//@Step2. ���̾ƿ� ����
		root.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		//@Step3. ���۳�Ʈ �߰��ϱ�
		
		//JSlider
		JSlider slider1 = new JSlider(); //�⺻ Slider (����Ʈ 0~100, 50)
		
		JSlider slider2 = new JSlider(100, 300); //�⺻ Slider  + �������� + Tick(Major, Minor) + Label ǥ��
		slider2.setMajorTickSpacing(50);
		slider2.setMinorTickSpacing(10);		
		slider2.setPaintTicks(true); //����Ʈ�� false�̱� ������ �̰� ���־� �����̽��� ����		
		slider2.setPaintLabels(true); ////����Ʈ�� false�̱� ������ �̰� ���־� ���̺��� ���� (Major Spacing���� ǥ��)
		
		JSlider slider3 = new JSlider(JSlider.VERTICAL); //���� Slider + ũ�� ����
		slider3.setPreferredSize(new Dimension(20, 100));
		
		
		//JProgressBar
				
		JProgressBar pb1 = new JProgressBar(); //�⺻ ProgressBar
		
		JProgressBar pb2 = new JProgressBar(JProgressBar.VERTICAL, 100, 300); //���� ProgressBar + ��ġ�� ���� + ũ������ + �� ����
		pb2.setValue(250);		
		pb2.setPreferredSize(new Dimension(10, 80));		
		pb2.setForeground(Color.RED);
		
		JProgressBar pb3 = new JProgressBar(100, 300); //�⺻ ProgressBar + ��ġ�� ���� + ����� ǥ��(%)		
		pb3.setValue(200);
		pb3.setStringPainted(true);		
						
		root.add(slider1);
		root.add(slider2);
		root.add(slider3);
		root.add(pb1);
		root.add(pb2);		
		root.add(pb3);
		
		//event ó��. ==================================		
		//�̺�Ʈ @1.�ι�° slider2�� �����ϸ� ����° ProgressBar(pb3)�� ������� ǥ��	
		slider2.addChangeListener(new ChangeListener() {			
			@Override
			public void stateChanged(ChangeEvent e) {
				pb3.setValue(slider2.getValue());				
			}
		});
		//=============================================
		
		//# �⺻�Ӽ� ����
		this.setTitle("UICompoents(JSlider and JProgressBar)");
		this.setBounds(100, 100, 500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
	}
	
	public static void main(String[] args) {
		new EX07_uicomp4_withevent();
	}
}
