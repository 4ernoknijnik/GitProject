package pacObj;

import javax.swing.JFrame;
import javax.swing.JPanel;

import pac1.SnakeGame;

public class GUI extends JPanel {

	public void run() {

		SnakeGame Sn = new SnakeGame();

		JFrame frame = new JFrame(); // ������� ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �� ���������
																// �������� ����
		frame.setResizable(false); // �������� ������ ����
		frame.setSize(Sn.WIDTH * Sn.SCALE + 7, Sn.HEIGHT * Sn.SCALE + 30); // ������
																			// ������
		// ���� +7 ���
		// ������� ����
		frame.setLocationRelativeTo(null); // ������ ����� ������������� �����
											// �� ������
		frame.add(new SnakeGame()); // ��������� � JFrame JPanel
		frame.setVisible(true); // ������� ���� ������
	}
}
