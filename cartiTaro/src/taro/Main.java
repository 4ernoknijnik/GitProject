package taro;

import java.awt.event.ActionListener;

public abstract class Main implements ActionListener {

	public static void main(String[] args) {

		GUI gui = new GUI();
		gui.initialize();

		TestFrame tf = new TestFrame();
		try {
			tf.saveImage();
			System.out.println("bl");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
