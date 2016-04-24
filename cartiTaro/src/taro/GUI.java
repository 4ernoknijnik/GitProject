package taro;

import javax.swing.JFrame;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {

	public static String day;
	public static String month;
	public static String year;
	public JFrame frame;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;

	private JButton button;

	/**
	 * @wbp.parser.entryPoint
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(600, 600);

		textField = new JTextField();
		textField.setText("23");
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setText("12");
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setText("1985");
		textField_2.setColumns(10);

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

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(50)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
				.addGap(44)
				.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE).addGap(50).addComponent(button)
				.addContainerGap(93, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(27)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE).addComponent(button))
				.addContainerGap(524, Short.MAX_VALUE)));
		frame.getContentPane().setLayout(groupLayout);

	}

}
