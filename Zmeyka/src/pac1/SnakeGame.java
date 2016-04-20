package pac1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import pacObj.Snake;

public class SnakeGame extends JPanel implements ActionListener {

	public static final int SCALE = 32; // размерность одной клетки
	public static final int WIDTH = 20; // сколько клеток в ширину
	public static final int HEIGHT = 20; // сколько клеток в длинну
	public static final int SPEED = 5;

	Snake s = new Snake(10, 10, 9, 10);
	Timer t = new Timer(1000 / SPEED, this);

	public SnakeGame() { // конструктор класса SnakeGame
		t.start(); // запуск таймера
		addKeyListener(new Keyboard());
		setFocusable(true); // нажатие клавиши находится в фокусе - тоесть в
							// самой программе
	}

	public void paint(Graphics g) {
		g.setColor(color(5, 50, 10)); // задаем цвет JPanel
		g.fillRect(0, 0, WIDTH * SCALE, HEIGHT * SCALE); // вывод окна по
															// кординатам и
															// размеры
		g.setColor(color(255, 216, 0)); // цвет поля - желтый

		for (int xx = 0; xx <= WIDTH * SCALE; xx += SCALE) { // рисуем полоски
																// по x
			g.drawLine(xx, 0, xx, HEIGHT * SCALE);
		}
		for (int yy = 0; yy <= HEIGHT * SCALE; yy += SCALE) { // рисуем полоски
																// по y
			g.drawLine(0, yy, WIDTH * SCALE, yy);
		}
		for (int d = 0; d < s.length; d++) { // рисуем змейку
			g.setColor(color(200, 150, 0));
			g.fillRect(s.snakeX[d] * SCALE + 1, s.snakeY[d] * SCALE + 1, SCALE - 1, SCALE - 1);
		}

	}

	public Color color(int red, int green, int blue) {
		return new Color(red, green, blue);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame(); // создаем окно
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // по завешении
																// закрытие окна
		frame.setResizable(false); // изменять размер окна
		frame.setSize(WIDTH * SCALE + 7, HEIGHT * SCALE + 7); // задаем размер
																// поля +7 для
																// ровного поля
		frame.setLocationRelativeTo(null); // окошко будет распологаться точно
											// по центру
		frame.add(new SnakeGame()); // добавляем к JFrame JPanel
		frame.setVisible(true); // сделать окно видным
	}

	public void actionPerformed(ActionEvent e) {

		s.move();

		repaint();

	}

	private class Keyboard extends KeyAdapter {
		public void keyPressed(KeyEvent kEvt) {
			int key = kEvt.getKeyCode(); // получаем код клавиши, каждой клавише
											// соответствует свой код
			if ((key == KeyEvent.VK_RIGHT) & s.direction != 2)
				s.direction = 0; // если клавиша нажата вправо то змейка вправо
			if ((key == KeyEvent.VK_DOWN) & s.direction != 3)
				s.direction = 1;
			if ((key == KeyEvent.VK_LEFT) & s.direction != 0)
				s.direction = 2;
			// s.direction !=2 - что бы змейка поварачивала правильно и не
			// съедала себя
			if ((key == KeyEvent.VK_UP) & s.direction != 1)
				s.direction = 3; // если клавиша нажата вверх то змейка вверх
		}
	}
}
