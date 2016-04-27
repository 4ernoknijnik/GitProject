package taro;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import taro.Matematica;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class Functions extends GUI {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JButton button;
	private JButton button_1;

	public JPanel CreateTab() {
		JPanel panel = new JPanel();
		JPanel panelLeft = new JPanel();
		JPanel panelUp = new JPanel(); // имеется ввиду Input , входящие данные
		TitledBorder border = BorderFactory.createTitledBorder("Исходные данные");

		panelUp.setBorder(border);

		panelLeft.setLayout(null);
		panelUp.setLayout(null);
		panelLeft.setSize(600, 50);
		panelUp.setSize(600, 100);
		panelLeft.setBounds(0, 76, 367, 874);
		panelUp.setBounds(0, 0, 1243, 74);

		panelUp.setBorder(border);
		panel.add(panelLeft);

		
		JTextField textField = new JTextField();
		textField.setText("9");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setColumns(2);
		textField.setBounds(20, 118, 40, 40);
		panelLeft.add(textField);

		textField_1 = new JTextField();
		textField_1.setText("13");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setColumns(2);
		textField_1.setBounds(10, 35, 40, 40);
		panelLeft.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setText("10");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setColumns(2);
		textField_2.setBounds(100, 74, 40, 40);
		panelLeft.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setText("4");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_3.setColumns(2);
		textField_3.setBounds(100, 268, 40, 40);
		panelLeft.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setText("1");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_4.setColumns(2);
		textField_4.setBounds(77, 162, 34, 40);
		panelLeft.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setText("2");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_5.setColumns(2);
		textField_5.setBounds(146, 162, 40, 40);
		panelLeft.add(textField_5);

		textField_6 = new JTextField();
		textField_6.setText("3");
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_6.setColumns(2);
		textField_6.setBounds(257, 162, 40, 40);
		panelLeft.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setText("12");
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_7.setColumns(2);
		textField_7.setBounds(198, 11, 40, 40);
		panelLeft.add(textField_7);

		textField_8 = new JTextField();
		textField_8.setText("11");
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_8.setColumns(2);
		textField_8.setBounds(198, 74, 40, 40);
		panelLeft.add(textField_8);

		textField_9 = new JTextField();
		textField_9.setText("5");
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_9.setColumns(2);
		textField_9.setBounds(198, 268, 40, 40);
		panelLeft.add(textField_9);

		textField_10 = new JTextField();
		textField_10.setText("??");
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_10.setColumns(2);
		textField_10.setBounds(317, 74, 40, 40);
		panelLeft.add(textField_10);

		textField_11 = new JTextField();
		textField_11.setText("8");
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_11.setColumns(2);
		textField_11.setBounds(146, 415, 40, 37);
		panelLeft.add(textField_11);

		textField_12 = new JTextField();
		textField_12.setText("6");
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_12.setColumns(2);
		textField_12.setBounds(146, 343, 40, 40);
		panelLeft.add(textField_12);

		textField_13 = new JTextField();
		textField_13.setText("7");
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_13.setColumns(2);
		textField_13.setBounds(317, 223, 40, 40);
		panelLeft.add(textField_13);

		textField_14 = new JTextField();
		textField_14.setText("A");
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_14.setColumns(2);
		textField_14.setBounds(117, 570, 40, 40);
		panelLeft.add(textField_14);

		textField_15 = new JTextField();
		textField_15.setText("C");
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_15.setColumns(2);
		textField_15.setBounds(117, 628, 40, 40);
		panelLeft.add(textField_15);

		textField_16 = new JTextField();
		textField_16.setText("D");
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_16.setColumns(2);
		textField_16.setBounds(189, 628, 40, 40);
		panelLeft.add(textField_16);

		textField_17 = new JTextField();
		textField_17.setText("B");
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_17.setColumns(2);
		textField_17.setBounds(77, 628, 40, 40);
		panelLeft.add(textField_17);

		textField_18 = new JTextField();
		textField_18.setText("E");
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_18.setColumns(2);
		textField_18.setBounds(116, 695, 40, 40);
		panelLeft.add(textField_18);

		textField_19 = new JTextField();
		textField_19.setText("F");
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_19.setColumns(2);
		textField_19.setBounds(191, 695, 40, 40);
		panelLeft.add(textField_19);

		textField_20 = new JTextField();
		textField_20.setText("H");
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_20.setColumns(2);
		textField_20.setBounds(149, 753, 40, 40);
		panelLeft.add(textField_20);
		panel.add(panelUp);

		textField_21 = new JTextField();
		textField_21.setText("23");
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setColumns(6);
		textField_21.setBounds(21, 26, 64, 20);
		panelUp.add(textField_21);

		textField_22 = new JTextField();
		textField_22.setText("12");
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setColumns(6);
		textField_22.setBounds(95, 26, 70, 20);
		panelUp.add(textField_22);

		textField_23 = new JTextField();
		textField_23.setText("1985");
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setColumns(8);
		textField_23.setBounds(171, 26, 92, 20);
		panelUp.add(textField_23);

		textField_24 = new JTextField();
		textField_24.setText("\u0412\u0432\u0435\u0434\u0438\u0442\u044F \u0424\u0430\u043C\u0438\u043B\u0438\u044F");
		textField_24.setHorizontalAlignment(SwingConstants.CENTER);
		textField_24.setColumns(14);
		textField_24.setBounds(269, 26, 158, 20);
		panelUp.add(textField_24);

		textField_25 = new JTextField();
		textField_25.setText("\u0412\u0432\u0435\u0434\u0438\u0442\u044F \u0418\u043C\u044F");
		textField_25.setHorizontalAlignment(SwingConstants.CENTER);
		textField_25.setColumns(14);
		textField_25.setBounds(442, 29, 158, 20);
		panelUp.add(textField_25);

		textField_26 = new JTextField();
		textField_26
				.setText("\u0412\u0432\u0435\u0434\u0438\u0442\u044F \u041E\u0442\u0447\u0435\u0441\u0442\u0432\u043E");
		textField_26.setHorizontalAlignment(SwingConstants.CENTER);
		textField_26.setColumns(14);
		textField_26.setBounds(624, 29, 158, 20);
		panelUp.add(textField_26);

		button = new JButton("\u0420\u0430\u0441\u0441\u0447\u0438\u0442\u0430\u0442\u044C");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				day = textField.getText();
				month = textField_1.getText();
				year = textField_2.getText();

				Matematica matem = new Matematica();
				matem.sum();

				Raschet raschet = new Raschet();
				raschet.Raschet();

		
			}
		});
		button.setBounds(792, 26, 124, 26);
		panelUp.add(button);

		button_1 = new JButton(
				"\u0421\u043E\u0445\u0440\u0430\u043D\u0438\u0442\u044C \u0440\u0435\u0437\u0443\u043B\u044C\u0442\u0430\u0442");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
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
		button_1.setBounds(926, 26, 307, 26);
		panelUp.add(button_1);
		panel.setBounds(500, 300, 600, 500);

		panel.setOpaque(true);

		JPanel panelCentr = new JPanel();
		panelCentr.setLayout(null);
		panelCentr.setBounds(366, 76, 237, 874);
		panel.add(panelCentr);

		JPanel panelRight = new JPanel();
		panelRight.setForeground(Color.RED);
		panelRight.setLayout(null);
		panelRight.setBounds(613, 76, 237, 874);
		panel.add(panelRight);
		return panel;
	}

	public static void CreateGUI() {
		JFrame frame = new JFrame("Таблица значений функции");

		Functions tab = new Functions();
		frame.setContentPane(tab.CreateTab());

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().setLayout(null);
		
		Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(sSize); // окно во весь экран

		frame.setLocation(0, 0);

		frame.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				CreateGUI();
			}
		});
	}
}