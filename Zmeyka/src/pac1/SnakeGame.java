package pac1;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SnakeGame extends JPanel {

	public static final int SCALE = 32; // размерность одной клетки
	public static final int WIDTH = 20; // сколько клеток в ширину
	public static final int HEIGHT = 20; // сколько клеток в длинну

	public SnakeGame() { // конструктор

	}

	public void paint(Graphics g) {
		g.setColor(color(5, 50, 10)); // задаем цвет JPanel
		g.fillRect(0, 0, WIDTH * SCALE, HEIGHT * SCALE); // вывод окна по кординатам и размеры
		g.setColor(color(255, 216, 0));  // цвет поля - желтый
		
		for (int xx=0; xx<=WIDTH*SCALE; xx+=SCALE){   // рисуем полоски по x
			g.drawLine(xx, 0, xx, HEIGHT*SCALE);
		}
		for (int yy=0; yy<=HEIGHT*SCALE; yy+=SCALE){  // рисуем полоски по y
			g.drawLine(0, yy,WIDTH*SCALE, yy );
		}
		
		
		
	}

	public Color color(int red, int green, int blue) {
		return new Color(red, green, blue);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame(); // создаем окно
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // по завешении закрытие окна
		frame.setResizable(false); // изменять размер окна
		frame.setSize(WIDTH * SCALE+7, HEIGHT * SCALE+7); // задаем размер поля +7 для ровного поля
		frame.setLocationRelativeTo(null); // окошко будет распологаться точно по центру
		frame.add(new SnakeGame()); // добавляем к JFrame JPanel
		frame.setVisible(true); // сделать окно видным
	}

}
