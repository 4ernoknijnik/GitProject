package pacObj;

public class Zmeyka {

	public int direction = 0;
	public int length = 2;

	public int snakeX[] = new int[100]; // ���� ����� ��������� ������
	public int snakeY[] = new int[100]; // ���� ����� ��������� ������

	public Zmeyka(int x0, int y0, int x1, int y1) { // ����������� ������
		snakeX[0] = x0;
		snakeY[0] = y0;
		snakeX[1] = x1;
		snakeX[1] = y1;

	}

	public void move (){
		
	}
}
