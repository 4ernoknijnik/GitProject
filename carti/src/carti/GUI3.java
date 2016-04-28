


	
	package carti;

	import javax.swing.*;
	import javax.swing.border.TitledBorder;

	import taro.Matematica;

	import java.awt.Color;
	import java.awt.Font;
	 
	public class GUI3 extends GUI
	{
		
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
	   
	 
	    public JPanel CreateTab()
	    {
	        JPanel panel = new JPanel();
	        JPanel panelLeft = new JPanel();
	        JPanel panelUp = new JPanel(); // имеется ввиду Input , входящие данные
	        TitledBorder border = BorderFactory.createTitledBorder("Исходные данные");
	 
	        panelUp.setBorder(border);
	 
	        panelLeft.setLayout(null);
	        panelUp.setLayout(null);
	        panelLeft.setSize(600, 50);
	        panelUp.setSize(600, 100);
	        panelLeft.setBounds(10, 76, 367, 874);
	        panelUp.setBounds(0, 0, 974, 74);
	 
	        panelUp.setBorder(border);
	        panel.add(panelLeft);
	        panel.add(panelUp);
	        panel.setBounds(500, 300, 600, 500);
	         panel.setOpaque(true);
	        
	        textField_6 = new JTextField();
	        textField_6.setText("1");
	        textField_6.setHorizontalAlignment(SwingConstants.CENTER);
			textField_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textField_6.setColumns(2);
			textField_6.setBounds(63, 148, 34, 40);
	        panelLeft.add(textField_6);
	       
			textField_7 = new JTextField();
			textField_7.setText("2");
			textField_7.setHorizontalAlignment(SwingConstants.CENTER);
			textField_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textField_7.setColumns(2);
			textField_7.setBounds(135, 148, 42, 40);
			panelLeft.add(textField_7);
			
			textField_8 = new JTextField();
			textField_8.setText("3");
			textField_8.setHorizontalAlignment(SwingConstants.CENTER);
			textField_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textField_8.setColumns(2);
			textField_8.setBounds(135, 148, 42, 40);
			panelLeft.add(textField_8);
			
			textField_9 = new JTextField();
			textField_9.setText("4");
			textField_9.setHorizontalAlignment(SwingConstants.CENTER);
			textField_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textField_9.setColumns(2);
			textField_9.setBounds(135, 148, 42, 40);
			panelLeft.add(textField_9);
			
			textField_10 = new JTextField();
			textField_10.setText("5");
			textField_10.setHorizontalAlignment(SwingConstants.CENTER);
			textField_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textField_10.setColumns(2);
			textField_10.setBounds(135, 148, 42, 40);
			panelLeft.add(textField_10);
			
			textField_11 = new JTextField();
			textField_11.setText("6");
			textField_11.setHorizontalAlignment(SwingConstants.CENTER);
			textField_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textField_11.setColumns(2);
			textField_11.setBounds(135, 148, 42, 40);
			panelLeft.add(textField_11);
			
			textField_12 = new JTextField();
			textField_12.setText("7");
			textField_12.setHorizontalAlignment(SwingConstants.CENTER);
			textField_12.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textField_12.setColumns(2);
			textField_12.setBounds(135, 148, 42, 40);
			panelLeft.add(textField_12);
			
			textField_13 = new JTextField();
			textField_13.setText("8");
			textField_13.setHorizontalAlignment(SwingConstants.CENTER);
			textField_13.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textField_13.setColumns(2);
			textField_13.setBounds(135, 148, 42, 40);
			panelLeft.add(textField_13);
					
			textField_14 = new JTextField();
			textField_14.setText("9");
			textField_14.setHorizontalAlignment(SwingConstants.CENTER);
			textField_14.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textField_14.setColumns(2);
			textField_14.setBounds(135, 148, 42, 40);
			panelLeft.add(textField_14);
			
			textField_15 = new JTextField();
			textField_15.setText("10");
			textField_15.setHorizontalAlignment(SwingConstants.CENTER);
			textField_15.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textField_15.setColumns(2);
			textField_15.setBounds(135, 148, 42, 40);
			panelLeft.add(textField_15);
			
			textField_16 = new JTextField();
			textField_16.setText("11");
			textField_16.setHorizontalAlignment(SwingConstants.CENTER);
			textField_16.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textField_16.setColumns(2);
			textField_16.setBounds(135, 148, 42, 40);
			panelLeft.add(textField_16);
			
			textField_17 = new JTextField();
			textField_17.setText("12");
			textField_17.setHorizontalAlignment(SwingConstants.CENTER);
			textField_17.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textField_17.setColumns(2);
			textField_17.setBounds(135, 148, 42, 40);
			panelLeft.add(textField_17);

			textField_18 = new JTextField();
			textField_18.setText("13");
			textField_18.setHorizontalAlignment(SwingConstants.CENTER);
			textField_18.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textField_18.setColumns(2);
			textField_18.setBounds(135, 148, 42, 40);
			panelLeft.add(textField_18);
					
			textField_19 = new JTextField();
			textField_19.setText("??");
			textField_19.setHorizontalAlignment(SwingConstants.CENTER);
			textField_19.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textField_19.setColumns(2);
			textField_19.setBounds(135, 148, 42, 40);
			panelLeft.add(textField_19);
			
			txtA = new JTextField();
			txtA.setText("A");
			txtA.setHorizontalAlignment(SwingConstants.CENTER);
			txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
			txtA.setColumns(2);
			txtA.setBounds(135, 148, 42, 40);
			panelLeft.add(txtA);
			
			txtB = new JTextField();
			txtB.setText("B");
			txtB.setHorizontalAlignment(SwingConstants.CENTER);
			txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
			txtB.setColumns(2);
			txtB.setBounds(135, 148, 42, 40);
			panelLeft.add(txtB);

			txtC = new JTextField();
			txtC.setText("C");
			txtC.setHorizontalAlignment(SwingConstants.CENTER);
			txtC.setFont(new Font("Tahoma", Font.PLAIN, 16));
			txtC.setColumns(2);
			txtC.setBounds(135, 148, 42, 40);
			panelLeft.add(txtC);

			txtD = new JTextField();
			txtD.setText("D");
			txtD.setHorizontalAlignment(SwingConstants.CENTER);
			txtD.setFont(new Font("Tahoma", Font.PLAIN, 16));
			txtD.setColumns(2);
			txtD.setBounds(135, 148, 42, 40);
			panelLeft.add(txtD);

			txtE = new JTextField();
			txtE.setText("E");
			txtE.setHorizontalAlignment(SwingConstants.CENTER);
			txtE.setFont(new Font("Tahoma", Font.PLAIN, 16));
			txtE.setColumns(2);
			txtE.setBounds(135, 148, 42, 40);
			panelLeft.add(txtE);

			txtF = new JTextField();
			txtF.setText("F");
			txtF.setHorizontalAlignment(SwingConstants.CENTER);
			txtF.setFont(new Font("Tahoma", Font.PLAIN, 16));
			txtF.setColumns(2);
			txtF.setBounds(135, 148, 42, 40);
			panelLeft.add(txtF);

			txtH = new JTextField();
			txtH.setText("H");
			txtH.setHorizontalAlignment(SwingConstants.CENTER);
			txtH.setFont(new Font("Tahoma", Font.PLAIN, 16));
			txtH.setColumns(2);
			txtH.setBounds(135, 148, 42, 40);
			panelLeft.add(txtH);
	                
	        
	        
	        
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
	 
	    public static void CreateGUI()
	    {
	        JFrame frame = new JFrame("Таблица значений функции");
	        
	     
	 
	        GUI3 tab = new GUI3();
	        frame.setContentPane(tab.CreateTab());
	        
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        frame.getContentPane().setLayout(null);
	       
	        frame.setBounds(10, 10, 1000, 1000);
	       
	        frame.setVisible(true);
	    }
	 
	  
	    
	 
	    public static void main(String[] args)
	    {
	        
	           
	    	JFrame frame = new JFrame("Таблица значений функции");
	        
		     
	   	 
	        GUI3 tab = new GUI3();
	        frame.setContentPane(tab.CreateTab());
	        
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        frame.getContentPane().setLayout(null);
	       
	        frame.setBounds(10, 10, 1000, 1000);
	       
	        frame.setVisible(true);
	   
	    }
	}


