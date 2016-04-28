package taro;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;

public class GUI {

	public static String day;
	public static String month;
	public static String year;

	public static String SaveFile;

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	public static JTextField textField_6;
	public static JTextField textField_7;
	public static JTextField textField_8;
	public static JTextField textField_9;
	public static JTextField textField_10;
	public static JTextField textField_11;
	public static JTextField textField_12;
	public static JTextField textField_13;
	public static JTextField textField_14;
	public static JTextField textField_15;
	public static JTextField textField_16;
	public static JTextField textField_17;
	public static JTextField textField_18;
	public static JTextField textField_19;

	public static JTextField txtA;
	public static JTextField txtB;
	public static JTextField txtC;
	public static JTextField txtD;
	public static JTextField txtE;
	public static JTextField txtF;
	public static JTextField txtH;

	public JPanel CreateTab() {
		JPanel panel = new JPanel();
		JPanel panelLeft = new JPanel();
		panelLeft.setBorder(new TitledBorder(null, "", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		JPanel panelUp = new JPanel(); // имеется ввиду Input , входящие данные
		TitledBorder border = BorderFactory
				.createTitledBorder("Исходные данные");

		panelUp.setBorder(border);

		panelLeft.setLayout(null);
		panelUp.setLayout(null);
		panelLeft.setSize(600, 50);
		panelUp.setSize(600, 100);
		panelLeft.setBounds(1, 76, 340, 800);
		panelUp.setBounds(1, 0, 1023, 75);

		panelUp.setBorder(border);
		panel.add(panelLeft);
		panel.add(panelUp);

		textField = new JTextField();
		textField.setText("23");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(6);
		textField.setBounds(20, 25, 40, 25);
		panelUp.add(textField);

		textField_1 = new JTextField();
		textField_1.setText("12");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(6);
		textField_1.setBounds(80, 25, 40, 25);
		panelUp.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setText("1985");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(8);
		textField_2.setBounds(140, 25, 50, 25);
		panelUp.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setText("Введите фамилию");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(14);
		textField_3.setBounds(220, 25, 145, 22);
		panelUp.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setText("Введите имя");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(14);
		textField_4.setBounds(385, 25, 150, 22);
		panelUp.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setText("Введите отчество");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setColumns(14);
		textField_5.setBounds(550, 25, 150, 22);
		panelUp.add(textField_5);

		JButton button = new JButton("Расчитать");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				day = textField.getText();
				month = textField_1.getText();
				year = textField_2.getText();

				Matematica matem = new Matematica();
				matem.sum();

				Raschet raschet = new Raschet();
				raschet.Raschet();

			}
		});
		button.setBounds(720, 25, 110, 25);
		panelUp.add(button);

		JButton button_1 = new JButton("Сохранить результат");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				day = textField.getText();
				month = textField_1.getText();
				year = textField_2.getText();

				Matematica matem = new Matematica();
				matem.sum();

				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Сохранить результат");
				fileChooser.setFileFilter(null);
				JFrame parentFrame = new JFrame();
				int userSelection = fileChooser.showSaveDialog(parentFrame);
				if (userSelection == JFileChooser.APPROVE_OPTION) {
					File fileToSave = fileChooser.getSelectedFile();
					SaveFile = fileToSave.getAbsolutePath() + ".xls";

				}

				FileXLS xls = new FileXLS();
				xls.Create();

			}
		});
		button_1.setBounds(850, 25, 160, 25);
		panelUp.add(button_1);
		panel.setBounds(500, 300, 600, 500);
		panel.setOpaque(true);

		textField_6 = new JTextField();
		textField_6.setText("1");
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_6.setColumns(2);
		textField_6.setBounds(80, 190, 40, 40);
		panelLeft.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setText("2");
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_7.setColumns(2);
		textField_7.setBounds(150, 190, 40, 40);
		panelLeft.add(textField_7);

		textField_8 = new JTextField();
		textField_8.setText("3");
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_8.setColumns(2);
		textField_8.setBounds(220, 190, 40, 40);
		panelLeft.add(textField_8);

		textField_9 = new JTextField();
		textField_9.setText("4");
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_9.setColumns(2);
		textField_9.setBounds(115, 260, 40, 40);
		panelLeft.add(textField_9);

		textField_10 = new JTextField();
		textField_10.setText("5");
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_10.setColumns(2);
		textField_10.setBounds(185, 260, 40, 40);
		panelLeft.add(textField_10);

		textField_11 = new JTextField();
		textField_11.setText("6");
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_11.setColumns(2);
		textField_11.setBounds(150, 330, 40, 40);
		panelLeft.add(textField_11);

		textField_12 = new JTextField();
		textField_12.setText("7");
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_12.setColumns(2);
		textField_12.setBounds(290, 225, 40, 40);
		panelLeft.add(textField_12);

		textField_13 = new JTextField();
		textField_13.setText("8");
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_13.setColumns(2);
		textField_13.setBounds(150, 400, 40, 40);
		panelLeft.add(textField_13);

		textField_14 = new JTextField();
		textField_14.setText("9");
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_14.setColumns(2);
		textField_14.setBounds(10, 225, 40, 40);
		panelLeft.add(textField_14);

		textField_15 = new JTextField();
		textField_15.setText("10");
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_15.setColumns(2);
		textField_15.setBounds(115, 130, 40, 40);
		panelLeft.add(textField_15);

		textField_16 = new JTextField();
		textField_16.setText("11");
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_16.setColumns(2);
		textField_16.setBounds(185, 130, 40, 40);
		panelLeft.add(textField_16);

		textField_17 = new JTextField();
		textField_17.setText("12");
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_17.setColumns(2);
		textField_17.setBounds(150, 60, 40, 40);
		panelLeft.add(textField_17);

		textField_18 = new JTextField();
		textField_18.setText("13");
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_18.setColumns(2);
		textField_18.setBounds(45, 130, 40, 40);
		panelLeft.add(textField_18);

		textField_19 = new JTextField();
		textField_19.setText("??");
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_19.setColumns(2);
		textField_19.setBounds(255, 130, 40, 40);
		panelLeft.add(textField_19);

		txtA = new JTextField();
		txtA.setText("A");
		txtA.setHorizontalAlignment(SwingConstants.CENTER);
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setColumns(2);
		txtA.setBounds(150, 530, 40, 40);
		panelLeft.add(txtA);

		txtB = new JTextField();
		txtB.setText("B");
		txtB.setHorizontalAlignment(SwingConstants.CENTER);
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(2);
		txtB.setBounds(70, 600, 40, 40);
		panelLeft.add(txtB);

		txtC = new JTextField();
		txtC.setText("C");
		txtC.setHorizontalAlignment(SwingConstants.CENTER);
		txtC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtC.setColumns(2);
		txtC.setBounds(150, 600, 40, 40);
		panelLeft.add(txtC);

		txtD = new JTextField();
		txtD.setText("D");
		txtD.setHorizontalAlignment(SwingConstants.CENTER);
		txtD.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtD.setColumns(2);
		txtD.setBounds(230, 600, 40, 40);
		panelLeft.add(txtD);

		txtE = new JTextField();
		txtE.setText("E");
		txtE.setHorizontalAlignment(SwingConstants.CENTER);
		txtE.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtE.setColumns(2);
		txtE.setBounds(110, 670, 40, 40);
		panelLeft.add(txtE);

		txtF = new JTextField();
		txtF.setText("F");
		txtF.setHorizontalAlignment(SwingConstants.CENTER);
		txtF.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtF.setColumns(2);
		txtF.setBounds(190, 670, 40, 40);
		panelLeft.add(txtF);

		txtH = new JTextField();
		txtH.setText("H");
		txtH.setHorizontalAlignment(SwingConstants.CENTER);
		txtH.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtH.setColumns(2);
		txtH.setBounds(150, 740, 40, 40);
		panelLeft.add(txtH);

		JPanel panelCentr = new JPanel();
		panelCentr.setBorder(new TitledBorder(null, "", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		panelCentr.setLayout(null);
		panelCentr.setBounds(342, 76, 340, 800);
		panel.add(panelCentr);

		JPanel panelRight = new JPanel();
		panelRight.setBorder(new TitledBorder(null, "", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		panelRight.setForeground(Color.BLACK);
		panelRight.setLayout(null);
		panelRight.setBounds(684, 76, 340, 800);
		panel.add(panelRight);
		return panel;
	}

	public static void CreateGUI() {
		JFrame frame = new JFrame("Таблица значений функции");

		GUI gui = new GUI();
		frame.setContentPane(gui.CreateTab());

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().setLayout(null);
		Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(sSize); // окно во весь экран

		frame.setLocationRelativeTo(null);
		;

		// frame.setBounds(10, 10, 1000, 1000);

		frame.setVisible(true);
	}

	public static void main(String[] args) {

		CreateGUI();

	}
}
