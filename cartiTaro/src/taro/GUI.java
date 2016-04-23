package taro;

import javax.swing.JFrame;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {

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

				String day = textField.getText();
				String month = textField_1.getText();
				String year = textField_2.getText();

				Matematica matem = new Matematica();
				matem.Matematica(day, month, year);

				matem.sum();
				
			//	System.out.println(matem.A);
			//	System.out.println(matem.Const3);
			//	System.out.println(matem.Const2);
			//	System.out.println(matem.Const1);
			//	System.out.println(matem.Const1 + matem.Const2 + matem.Const3);

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
