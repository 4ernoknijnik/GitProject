package pac1;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SnakeGame extends JPanel {

	public static final int SCALE = 32; // ����������� ����� ������
	public static final int WIDTH = 20; // ������� ������ � ������
	public static final int HEIGHT = 20; // ������� ������ � ������

	public SnakeGame() { // �����������

	}

	public void paint(Graphics g) {
		g.setColor(color(5, 50, 10)); // ������ ���� JPanel
		g.fillRect(0, 0, WIDTH * SCALE, HEIGHT * SCALE); // ����� ���� �� ���������� � �������
		g.setColor(color(255, 216, 0));  // ���� ���� - ������
		
		for (int xx=0; xx<=WIDTH*SCALE; xx+=SCALE){   // ������ ������� �� x
			g.drawLine(xx, 0, xx, HEIGHT*SCALE);
		}
		for (int yy=0; yy<=HEIGHT*SCALE; yy+=SCALE){  // ������ ������� �� y
			g.drawLine(0, yy,WIDTH*SCALE, yy );
		}
		
		
		
	}

	public Color color(int red, int green, int blue) {
		return new Color(red, green, blue);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame(); // ������� ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �� ��������� �������� ����
		frame.setResizable(false); // �������� ������ ����
		frame.setSize(WIDTH * SCALE+7, HEIGHT * SCALE+7); // ������ ������ ���� +7 ��� ������� ����
		frame.setLocationRelativeTo(null); // ������ ����� ������������� ����� �� ������
		frame.add(new SnakeGame()); // ��������� � JFrame JPanel
		frame.setVisible(true); // ������� ���� ������
	}

}
