package carti;

import java.awt.Dimension;
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

public class JPanelUp {

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

	/**
	 * @wbp.parser.entryPoint
	 */
	public void RunJFrameUp() {

		frame = new JFrame();
		frame.setTitle("Taro");

		Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(sSize); // окно во весь экран
		frame.setResizable(true);
		// frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		textField = new JTextField();
		textField.setText("23");
		textField.setHorizontalAlignment(JTextField.CENTER); // сделать текст по середине
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

				// Matematica matem = new Matematica();
				// matem.sum();

				// Raschet raschet = new Raschet();
				// raschet.Raschet();

			}
		});

		btnNewButton = new JButton("Сохранить результат");
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				day = textField.getText();
				month = textField_1.getText();
				year = textField_2.getText();

				// Matematica matem = new Matematica();
				// matem.sum();

				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Сохранить результат");
				fileChooser.setFileFilter(null);
				JFrame parentFrame = new JFrame();
				int userSelection = fileChooser.showSaveDialog(parentFrame);
				if (userSelection == JFileChooser.APPROVE_OPTION) {
					File fileToSave = fileChooser.getSelectedFile();
					SaveFile = fileToSave.getAbsolutePath() + ".xls";

				}

				// FileXLS xls = new FileXLS();
				// xls.Create();

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

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 307, GroupLayout.PREFERRED_SIZE)
					.addGap(78))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnNewButton)
						.addComponent(button, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(932))
		);
		frame.getContentPane().setLayout(groupLayout);

	}

	public static void main(String[] args) {
		JPanelUp up = new JPanelUp();
		up.RunJFrameUp();
		
		JPanelLeft left = new JPanelLeft();
		left.RunJPanelLeft();
		
	}
}
