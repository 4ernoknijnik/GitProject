package carti;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Run extends JFrame {
	public void Run() {

		getContentPane().setLayout(new BorderLayout(0, 0));

		//Karta karta = new Karta();
	//	karta.Karta();
		
		GUI gui = new GUI();
		
		
		getContentPane().add((gui.RunGui()), BorderLayout.WEST);

	}

	public static void main(String[] args) {
		Run run = new Run();
		run.Run();

	}
}
