package taro;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

public class GUI {

	public static String day;
	public static String month;
	public static String year;

	public static String SaveFile;

	public JFrame frame;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;

	private JButton button;
	private JButton btnNewButton;
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

	/**
	 * @wbp.parser.entryPoint
	 */
	public void initialize() {

		frame = new JFrame();
		frame.setTitle("Taro");

		Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(sSize); // окно во весь экран

		frame.setResizable(true);
		// frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		textField = new JTextField();
		textField.setText("23");
		textField.setHorizontalAlignment(JTextField.CENTER); // сделать текст по
																// середине
		textField.setColumns(6);

		textField_1 = new JTextField();
		textField_1.setText("12");
		textField_1.setHorizontalAlignment(JTextField.CENTER);
		textField_1.setColumns(6);

		textField_2 = new JTextField();
		textField_2.setText("1985");
		textField_2.setHorizontalAlignment(JTextField.CENTER);
		textField_2.setColumns(8);

		frame.setVisible(true);
		button = new JButton("Рассчитать");
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

		btnNewButton = new JButton("Сохранить результат");
		btnNewButton.addActionListener(new ActionListener() {

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

				/*
				 * 
				 * Object[] buttons = {"Да", "Нет", "Отмена"}; int ans =
				 * JOptionPane.showOptionDialog(null,
				 * "Сохранить внеснные изменения?", "Диалог сохранения",
				 * JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
				 * null, buttons, buttons[0]); if (ans == 0) {
				 * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 * System.out.println("сохранить и выйти"); } else if (ans ==
				 * 1){ frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 * System.out.println("выйти"); } else if (ans == 2){
				 * frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				 * System.out.println("ничего не делать"); }
				 */
			}
		});

		textField_3 = new JTextField();
		textField_3.setText("Введитя Фамилия");
		textField_3.setHorizontalAlignment(JTextField.CENTER);
		textField_3.setColumns(14);

		textField_4 = new JTextField();
		textField_4.setText("Введитя Имя");
		textField_4.setHorizontalAlignment(JTextField.CENTER);
		textField_4.setColumns(14);

		textField_5 = new JTextField();
		textField_5.setText("Введитя Отчество");
		textField_5.setHorizontalAlignment(JTextField.CENTER);
		textField_5.setColumns(14);

		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setText("1");
		textField_6.setColumns(2);

		textField_7 = new JTextField();
		textField_7.setText("2");
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_7.setColumns(2);

		textField_8 = new JTextField();
		textField_8.setText("3");
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_8.setColumns(2);

		textField_9 = new JTextField();
		textField_9.setText("4");
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_9.setColumns(2);

		textField_10 = new JTextField();
		textField_10.setText("5");
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_10.setColumns(2);

		textField_11 = new JTextField();
		textField_11.setText("6");
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_11.setColumns(2);

		textField_12 = new JTextField();
		textField_12.setText("7");
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_12.setColumns(2);

		textField_13 = new JTextField();
		textField_13.setText("8");
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_13.setColumns(2);

		textField_14 = new JTextField();
		textField_14.setText("9");
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_14.setColumns(2);

		textField_15 = new JTextField();
		textField_15.setText("10");
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_15.setColumns(2);

		textField_16 = new JTextField();
		textField_16.setText("11");
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_16.setColumns(2);

		textField_17 = new JTextField();
		textField_17.setText("12");
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_17.setColumns(2);

		textField_18 = new JTextField();
		textField_18.setText("13");
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_18.setColumns(2);

		textField_19 = new JTextField();
		textField_19.setText("??");
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_19.setColumns(2);

		txtA = new JTextField();
		txtA.setText("A");
		txtA.setHorizontalAlignment(SwingConstants.CENTER);
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setColumns(2);

		txtB = new JTextField();
		txtB.setText("B");
		txtB.setHorizontalAlignment(SwingConstants.CENTER);
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(2);

		txtC = new JTextField();
		txtC.setText("C");
		txtC.setHorizontalAlignment(SwingConstants.CENTER);
		txtC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtC.setColumns(2);

		txtD = new JTextField();
		txtD.setText("D");
		txtD.setHorizontalAlignment(SwingConstants.CENTER);
		txtD.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtD.setColumns(2);

		txtE = new JTextField();
		txtE.setText("E");
		txtE.setHorizontalAlignment(SwingConstants.CENTER);
		txtE.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtE.setColumns(2);

		txtF = new JTextField();
		txtF.setText("F");
		txtF.setHorizontalAlignment(SwingConstants.CENTER);
		txtF.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtF.setColumns(2);

		txtH = new JTextField();
		txtH.setText("H");
		txtH.setHorizontalAlignment(SwingConstants.CENTER);
		txtH.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtH.setColumns(2);

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout
				.setHorizontalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								Alignment.TRAILING,
								groupLayout
										.createSequentialGroup()
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addContainerGap(
																				12,
																				Short.MAX_VALUE)
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.TRAILING,
																								false)
																						.addGroup(
																								Alignment.LEADING,
																								groupLayout
																										.createSequentialGroup()
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addComponent(
																												textField,
																												GroupLayout.PREFERRED_SIZE,
																												GroupLayout.DEFAULT_SIZE,
																												GroupLayout.PREFERRED_SIZE)
																										.addGap(29)
																										.addComponent(
																												textField_1,
																												GroupLayout.PREFERRED_SIZE,
																												GroupLayout.DEFAULT_SIZE,
																												GroupLayout.PREFERRED_SIZE))
																						.addGroup(
																								Alignment.LEADING,
																								groupLayout
																										.createSequentialGroup()
																										.addGap(23)
																										.addGroup(
																												groupLayout
																														.createParallelGroup(
																																Alignment.LEADING)
																														.addComponent(
																																textField_14,
																																GroupLayout.PREFERRED_SIZE,
																																40,
																																GroupLayout.PREFERRED_SIZE)
																														.addGroup(
																																groupLayout
																																		.createSequentialGroup()
																																		.addComponent(
																																				textField_18,
																																				GroupLayout.PREFERRED_SIZE,
																																				40,
																																				GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(
																																				ComponentPlacement.RELATED,
																																				GroupLayout.DEFAULT_SIZE,
																																				Short.MAX_VALUE)
																																		.addComponent(
																																				textField_15,
																																				GroupLayout.PREFERRED_SIZE,
																																				40,
																																				GroupLayout.PREFERRED_SIZE))
																														.addComponent(
																																textField_9,
																																Alignment.TRAILING,
																																GroupLayout.PREFERRED_SIZE,
																																40,
																																GroupLayout.PREFERRED_SIZE))))
																		.addPreferredGap(
																				ComponentPlacement.RELATED))
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(100)
																		.addComponent(
																				textField_6,
																				GroupLayout.PREFERRED_SIZE,
																				40,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(52)))
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addComponent(
																				textField_7,
																				GroupLayout.PREFERRED_SIZE,
																				40,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(71)
																		.addComponent(
																				textField_8,
																				GroupLayout.PREFERRED_SIZE,
																				40,
																				GroupLayout.PREFERRED_SIZE)
																		.addContainerGap(
																				1000,
																				Short.MAX_VALUE))
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addComponent(
																				textField_17,
																				GroupLayout.PREFERRED_SIZE,
																				40,
																				GroupLayout.PREFERRED_SIZE)
																		.addContainerGap())
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.TRAILING)
																						.addComponent(
																								textField_16,
																								GroupLayout.PREFERRED_SIZE,
																								40,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								textField_2,
																								GroupLayout.PREFERRED_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								textField_10,
																								GroupLayout.PREFERRED_SIZE,
																								40,
																								GroupLayout.PREFERRED_SIZE))
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addGroup(
																								groupLayout
																										.createParallelGroup(
																												Alignment.LEADING)
																										.addGroup(
																												groupLayout
																														.createSequentialGroup()
																														.addPreferredGap(
																																ComponentPlacement.RELATED)
																														.addComponent(
																																textField_3,
																																GroupLayout.PREFERRED_SIZE,
																																GroupLayout.DEFAULT_SIZE,
																																GroupLayout.PREFERRED_SIZE)
																														.addGap(18)
																														.addComponent(
																																textField_4,
																																GroupLayout.PREFERRED_SIZE,
																																GroupLayout.DEFAULT_SIZE,
																																GroupLayout.PREFERRED_SIZE)
																														.addGap(18)
																														.addComponent(
																																textField_5,
																																GroupLayout.PREFERRED_SIZE,
																																GroupLayout.DEFAULT_SIZE,
																																GroupLayout.PREFERRED_SIZE)
																														.addPreferredGap(
																																ComponentPlacement.RELATED,
																																GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE)
																														.addComponent(
																																button,
																																GroupLayout.PREFERRED_SIZE,
																																124,
																																GroupLayout.PREFERRED_SIZE)
																														.addGap(18)
																														.addComponent(
																																btnNewButton,
																																GroupLayout.PREFERRED_SIZE,
																																307,
																																GroupLayout.PREFERRED_SIZE)
																														.addGap(78))
																										.addGroup(
																												groupLayout
																														.createSequentialGroup()
																														.addGap(79)
																														.addComponent(
																																textField_19,
																																GroupLayout.PREFERRED_SIZE,
																																40,
																																GroupLayout.PREFERRED_SIZE)
																														.addContainerGap()))
																						.addGroup(
																								Alignment.TRAILING,
																								groupLayout
																										.createSequentialGroup()
																										.addGap(1005)
																										.addComponent(
																												textField_12,
																												GroupLayout.PREFERRED_SIZE,
																												40,
																												GroupLayout.PREFERRED_SIZE)
																										.addContainerGap())))
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.TRAILING)
																						.addComponent(
																								textField_13,
																								GroupLayout.PREFERRED_SIZE,
																								40,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								textField_11,
																								GroupLayout.PREFERRED_SIZE,
																								40,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								txtA,
																								GroupLayout.PREFERRED_SIZE,
																								40,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								txtC,
																								GroupLayout.PREFERRED_SIZE,
																								40,
																								GroupLayout.PREFERRED_SIZE))
																		.addGap(32)
																		.addComponent(
																				txtD,
																				GroupLayout.PREFERRED_SIZE,
																				40,
																				GroupLayout.PREFERRED_SIZE)
																		.addContainerGap())))
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addGap(116)
										.addComponent(txtB,
												GroupLayout.PREFERRED_SIZE, 40,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap(1187, Short.MAX_VALUE))
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addGap(155)
										.addComponent(txtE,
												GroupLayout.PREFERRED_SIZE, 40,
												GroupLayout.PREFERRED_SIZE)
										.addGap(35)
										.addComponent(txtF,
												GroupLayout.PREFERRED_SIZE, 40,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap(1073, Short.MAX_VALUE))
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addGap(188)
										.addComponent(txtH,
												GroupLayout.PREFERRED_SIZE, 40,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap(1115, Short.MAX_VALUE)));
		groupLayout
				.setVerticalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addGap(27)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																textField,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																textField_1,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																textField_2,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btnNewButton)
														.addComponent(button)
														.addComponent(
																textField_3,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																textField_4,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																textField_5,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.RELATED, 79,
												Short.MAX_VALUE)
										.addComponent(textField_17,
												GroupLayout.PREFERRED_SIZE, 40,
												GroupLayout.PREFERRED_SIZE)
										.addGap(7)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																textField_15,
																GroupLayout.PREFERRED_SIZE,
																40,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																textField_18,
																GroupLayout.PREFERRED_SIZE,
																40,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																textField_16,
																GroupLayout.PREFERRED_SIZE,
																40,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																textField_19,
																GroupLayout.PREFERRED_SIZE,
																40,
																GroupLayout.PREFERRED_SIZE))
										.addGap(48)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																textField_6,
																GroupLayout.PREFERRED_SIZE,
																40,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																textField_7,
																GroupLayout.PREFERRED_SIZE,
																40,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																textField_8,
																GroupLayout.PREFERRED_SIZE,
																40,
																GroupLayout.PREFERRED_SIZE))
										.addGap(15)
										.addComponent(textField_14,
												GroupLayout.PREFERRED_SIZE, 40,
												GroupLayout.PREFERRED_SIZE)
										.addGap(11)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																textField_12,
																GroupLayout.PREFERRED_SIZE,
																40,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																textField_9,
																GroupLayout.PREFERRED_SIZE,
																40,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																textField_10,
																GroupLayout.PREFERRED_SIZE,
																40,
																GroupLayout.PREFERRED_SIZE))
										.addGap(35)
										.addComponent(textField_11,
												GroupLayout.PREFERRED_SIZE, 40,
												GroupLayout.PREFERRED_SIZE)
										.addGap(32)
										.addComponent(textField_13,
												GroupLayout.PREFERRED_SIZE, 40,
												GroupLayout.PREFERRED_SIZE)
										.addGap(107)
										.addComponent(txtA,
												GroupLayout.PREFERRED_SIZE, 40,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																txtB,
																GroupLayout.PREFERRED_SIZE,
																40,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																txtC,
																GroupLayout.PREFERRED_SIZE,
																40,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																txtD,
																GroupLayout.PREFERRED_SIZE,
																40,
																GroupLayout.PREFERRED_SIZE))
										.addGap(27)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																txtE,
																GroupLayout.PREFERRED_SIZE,
																40,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																txtF,
																GroupLayout.PREFERRED_SIZE,
																40,
																GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addComponent(txtH,
												GroupLayout.PREFERRED_SIZE, 40,
												GroupLayout.PREFERRED_SIZE)
										.addGap(27)));
		frame.getContentPane().setLayout(groupLayout);

	}

}
