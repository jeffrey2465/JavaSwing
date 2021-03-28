package sec06.event;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JToolBar;

//JMenuBar, JMenu, JMenuItem + JToolBar

public class EX10_uicomp6_withevent extends JFrame {
	public EX10_uicomp6_withevent() {
				
		//@Step1. �ֻ��� �����̳� ��������
		Container root = this.getContentPane();
		//@Step2. ���̾ƿ� ����
		root.setLayout(new BorderLayout()); //ToolBar�� BorderLayout������ ����� ����
		//@Step3. ���۳�Ʈ �߰��ϱ�
		
		//JMenuBar
		JMenuBar menuBar = new JMenuBar(); //MenuBar ���� <- Menu <- MenuItem
	
		JMenu menuFile = new JMenu("File");		
		JMenuItem item11 = new JMenuItem("New");
		JMenuItem item12 = new JMenuItem("Open", (int)'O');
		JMenuItem item13 = new JMenuItem("Exit");		
		menuFile.add(item11);
		menuFile.add(item12);
		JMenu menuEdit = new JMenu("Edit");
		menuEdit.add(new JMenuItem("Copy", new ImageIcon("images/menuicon1.png")));
		menuEdit.add(new JMenuItem("Paste"));		
		menuFile.add(menuEdit);
		menuFile.add(new JSeparator());
		menuFile.add(item13);		
		JMenu menuHelp = new JMenu("Help");
				
		menuBar.add(menuFile);
		menuBar.add(menuHelp);
		
		this.setJMenuBar(menuBar); //JFrame �޼���
		
		
		//JToolBar
		JToolBar toolBar = new JToolBar();
		
		toolBar.add(new JButton(new ImageIcon("images/menuicon1.png")));
		toolBar.add(new JButton(new ImageIcon("images/menuicon2.png")));
		toolBar.addSeparator();
		toolBar.add(new JButton(new ImageIcon("images/menuicon3.png")));
		toolBar.add(new JButton(new ImageIcon("images/menuicon4.png")));
		
		toolBar.setFloatable(true);//��ġ ���� �Ұ� (����Ʈ true)		
		root.add(toolBar, BorderLayout.NORTH);
		
		//event ó��. ==================================		
		//�̺�Ʈ @1. New(item11) �޴����ý� �޼��� �ڽ� ����
		//     @2. Open(item12) ���ý� FileChooser ����
		//     @3. Exit(item13) ������ ���α׷� ����
		class MyMenuHandler implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==item11) {
					JOptionPane.showMessageDialog(root, "���ο� ������ �����մϴ�");
				}
				else if(e.getSource()==item12) {
					JFileChooser fileChooser = new JFileChooser();
					fileChooser.showOpenDialog(null);
				}
				else if(e.getSource()==item13) {
					System.exit(0);
				}
				
			}
			
		}
		item11.addActionListener(new MyMenuHandler());
		item12.addActionListener(new MyMenuHandler());
		item13.addActionListener(new MyMenuHandler());
		//================================================================================
		
		//# �⺻�Ӽ� ����
		this.setTitle("UICompoents(JComboBox and JList)");
		this.setBounds(100, 100, 300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
	}
	
	public static void main(String[] args) {
		new EX10_uicomp6_withevent();
	}
}
