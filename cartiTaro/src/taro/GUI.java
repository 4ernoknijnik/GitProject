package taro;

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

	/**
	 * @wbp.parser.entryPoint
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setTitle("Taro");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(600, 600);

		textField = new JTextField();
		textField.setText("23");
		textField.setColumns(6);

		textField_1 = new JTextField();
		textField_1.setText("12");
		textField_1.setColumns(6);

		textField_2 = new JTextField();
		textField_2.setText("1985");
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

				FileXLS xls = new FileXLS();
				xls.Create();

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

				// parent component of the dialog
				JFrame parentFrame = new JFrame();

				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Сохранить результат");
				
				fileChooser.setFileFilter(null);

				int userSelection = fileChooser.showSaveDialog(parentFrame);

				if (userSelection == JFileChooser.APPROVE_OPTION) {
					File fileToSave = fileChooser.getSelectedFile();
					System.out.println("Save as file: " + fileToSave.getAbsolutePath());
					SaveFile = fileToSave.getAbsolutePath()+".xls";

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

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE).addGap(18).addComponent(button).addGap(18)
				.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(107, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(27)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE).addComponent(button).addComponent(btnNewButton))
				.addContainerGap(521, Short.MAX_VALUE)));
		frame.getContentPane().setLayout(groupLayout);

	}

}
