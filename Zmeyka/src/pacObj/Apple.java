package pacObj;

import pac1.SnakeGame;

public class Apple {
	SnakeGame main;
	
	public int posX;
	public int posY;
	
	public Apple(int startX,int startY){
		posX=startX;
		posY=startY;
	}
	
	public void setRandomPosition(){
		posX=(int)(Math.random()*main.WIDTH); // (int) - �������� ���������� �� ���������
		posY=(int)(Math.random()*main.HEIGHT);
	}

}
